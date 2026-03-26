import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SplitwiseService service = new SplitwiseService();

        List<User> users = new ArrayList<>();

        System.out.println("Enter number of users:");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Add users
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of user " + (i + 1) + ": ");
            String name = sc.nextLine();
            User user = new User(name);
            users.add(user);
            service.addUser(user);
        }

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Expense");
            System.out.println("2. Show Balances");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {

                sc.nextLine(); // consume newline

                System.out.print("Who paid? ");
                String payerName = sc.nextLine();

                User paidBy = null;
                for (User u : users) {
                    if (u.getName().equalsIgnoreCase(payerName)) {
                        paidBy = u;
                        break;
                    }
                }

                if (paidBy == null) {
                    System.out.println("User not found!");
                    continue;
                }

                System.out.print("Enter amount: ");
                double amount = sc.nextDouble();

                sc.nextLine(); // consume newline

                System.out.println("Enter participants (space separated names):");
                String input = sc.nextLine();
                String[] names = input.split(" ");

                List<User> participants = new ArrayList<>();

                for (String name : names) {
                    for (User u : users) {
                        if (u.getName().equalsIgnoreCase(name)) {
                            participants.add(u);
                        }
                    }
                }

                if (participants.isEmpty()) {
                    System.out.println("No valid participants!");
                    continue;
                }

                Expense expense = new Expense(paidBy, amount, participants);
                service.addExpense(expense);

                System.out.println("Expense added successfully!");

            } else if (choice == 2) {
                service.showBalances();

            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;

            } else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}