import java.util.*;

public class SplitwiseService {

    private Map<String, Map<String, Double>> balanceSheet = new HashMap<>();

    // Add user
    public void addUser(User user) {
        balanceSheet.putIfAbsent(user.getName(), new HashMap<>());
    }

    // Add expense
    public void addExpense(Expense expense) {

        double totalAmount = expense.getAmount();
        List<User> participants = expense.getParticipants();
        User paidBy = expense.getPaidBy();

        double splitAmount = totalAmount / participants.size();

        for (User user : participants) {

            // Skip the person who paid
            if (user.getName().equals(paidBy.getName())) {
                continue;
            }

            // Ensure both users exist
            balanceSheet.putIfAbsent(user.getName(), new HashMap<>());
            balanceSheet.putIfAbsent(paidBy.getName(), new HashMap<>());

            // Update balance
            Map<String, Double> userMap = balanceSheet.get(user.getName());

            userMap.put(
                paidBy.getName(),
                userMap.getOrDefault(paidBy.getName(), 0.0) + splitAmount
            );
        }
    }

    // Show balances
    public void showBalances() {
        boolean hasBalances = false;

        for (String user : balanceSheet.keySet()) {
            Map<String, Double> balances = balanceSheet.get(user);

            for (String owedTo : balances.keySet()) {
                double amount = balances.get(owedTo);

                if (amount > 0) {
                    System.out.println(user + " owes " + owedTo + ": " + amount);
                    hasBalances = true;
                }
            }
        }

        if (!hasBalances) {
            System.out.println("No balances");
        }
    }
}