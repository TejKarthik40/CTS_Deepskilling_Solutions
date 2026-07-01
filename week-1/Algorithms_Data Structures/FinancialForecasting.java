public class FinancialForecasting {

    // Recursive method to calculate future value
    public static double predictFutureValue(double currentValue,double growthRate,int years) {
        // Base case
        if (years == 0) {
            return currentValue;
        }
        // Recursive call
        return predictFutureValue(currentValue * (1 + growthRate),growthRate,years - 1);
    }

    public static void main(String[] args) {

        double initialValue = 10000.0;
        double growthRate = 0.10; // 10%
        int years = 5;

        double futureValue = predictFutureValue(initialValue, growthRate, years);

        System.out.println("Initial Value: ₹" + initialValue);
        System.out.println("Growth Rate: " + (growthRate * 100) + "%");
        System.out.println("Years: " + years);
        System.out.printf("Predicted Future Value: ₹%.2f%n", futureValue);
    }
}