import java.util.List;

public class Expense {
    private User paidBy;
    private double amount;
    private List<User> participants;

    public Expense(User paidBy, double amount, List<User> participants) {
        this.paidBy = paidBy;
        this.amount = amount;
        this.participants = participants;
    }

    public User getPaidBy() {
        return paidBy;
    }

    public double getAmount() {
        return amount;
    }

    public List<User> getParticipants() {
        return participants;
    }
}