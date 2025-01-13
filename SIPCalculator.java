public class SIPCalculator {
    public static void main(String[] args) {
        double sipAmount = 3000; // Monthly SIP amount
        double roiPercent = 0.02; // ROI percentage (2%)
        double roiAmount = roiPercent * sipAmount; // ROI for each SIP
        double total = 0;

        // Calculate total for 2 months
        for (int month = 1; month <= 2; month++) {
            total += (roiAmount * month) + sipAmount;
        }

        // Add one additional SIP amount
        total += sipAmount;

        // Print the total investment
        System.out.println("Total Investment: " + total);
    }
}
