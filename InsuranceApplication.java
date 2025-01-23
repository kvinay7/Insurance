// Custom Exceptions
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class InsufficientCoverageException extends Exception {
    public InsufficientCoverageException(String message) {
        super(message);
    }
}

// User Class
class User {
    private int userId;
    private String name;
    private String email;
    private String password;
    private Policy policy;

    public User(int userId, String name, String email, String password) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public boolean login(String password) {
        return this.password.equals(password);
    }

    public void updateProfile(String name, String email) {
        if (name != null) this.name = name;
        if (email != null) this.email = email;
    }

    public void addPolicy(Policy policy) {
        this.policy = policy;
    }

    public Policy getPolicy() {
        return policy;
    }
}

// Policy Class
class Policy {
    private int policyId;
    private int userId;
    private String policyType;
    private double coverageAmount;
    private String startDate;
    private String endDate;
    private double premiumAmount;

    public Policy(int policyId, int userId, String policyType, double coverageAmount, String startDate, String endDate, double premiumAmount) {
        this.policyId = policyId;
        this.userId = userId;
        this.policyType = policyType;
        this.coverageAmount = coverageAmount;
        this.startDate = startDate;
        this.endDate = endDate;
        this.premiumAmount = premiumAmount;
    }

    public void modifyPolicy(double coverageAmount, double premiumAmount) {
        if (coverageAmount > 0) this.coverageAmount = coverageAmount;
        if (premiumAmount > 0) this.premiumAmount = premiumAmount;
    }

    public double getCoverageAmount() {
        return coverageAmount;
    }
}

// Claim Class
class Claim {
    private int claimId;
    private int policyId;
    private int userId;
    private double amountClaimed;
    private String status;
    private String submissionDate;

    public Claim(int claimId, int policyId, int userId, double amountClaimed, String submissionDate) {
        this.claimId = claimId;
        this.policyId = policyId;
        this.userId = userId;
        this.amountClaimed = amountClaimed;
        this.status = "submitted";
        this.submissionDate = submissionDate;
    }

    public void updateClaim(double amountClaimed) {
        this.amountClaimed = amountClaimed;
    }
}

// Payment Class
class Payment {
    private int paymentId;
    private int userId;
    private int policyId;
    private double amount;
    private String status;

    public Payment(int paymentId, int userId, int policyId, double amount) {
        this.paymentId = paymentId;
        this.userId = userId;
        this.policyId = policyId;
        this.amount = amount;
        this.status = "pending";
    }

    public void makePayment(double userBalance) throws InsufficientFundsException {
        if (userBalance < amount) {
            throw new InsufficientFundsException("Insufficient funds for this payment.");
        }
        this.status = "completed";
    }
}

// Notification Class
class Notification {
    public static void sendNotification(User user, String message) {
        System.out.println("Notification to " + user.name + ": " + message);
    }
}

// Admin Class
class Admin {
    private int adminId;
    private String name;
    private String email;

    public Admin(int adminId, String name, String email) {
        this.adminId = adminId;
        this.name = name;
        this.email = email;
    }

    public void reviewClaim(Claim claim) {
        // Claim review logic would go here
    }
}

// Main Application Class
public class InsuranceApplication {
    public static void main(String[] args) {
        try {
            User user1 = new User(1, "John Doe", "john@example.com", "password123");
            Policy policy1 = new Policy(101, user1.userId, "Health", 100000, "2024-01-01", "2025-01-01", 500);
            user1.addPolicy(policy1);

            Payment payment1 = new Payment(201, user1.userId, policy1.policyId, 500);
            double userBalance = 600; // User balance
            payment1.makePayment(userBalance); // Process payment

            Notification.sendNotification(user1, "Payment successful!");
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
