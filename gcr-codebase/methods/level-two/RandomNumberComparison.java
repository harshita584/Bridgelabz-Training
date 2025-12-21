public class RandomNumberComparison {

    // Method to generate array of 4-digit random numbers
    public int[] generate4DigitRandomArray(int size) {

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            // Generates random 4-digit number (1000 to 9999)
            numbers[i] = (int)(Math.random() * 9000) + 1000;
        }

        return numbers;
    }

    // Method to find average, minimum and maximum
    public double[] findAverageMinMax(int[] numbers) {

        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            min = (int) Math.min(min, numbers[i]);
            max = (int) Math.max(max, numbers[i]);
        }

        double average = (double) sum / numbers.length;

        return new double[]{average, min, max};
    }

    public static void main(String[] args) {

        RandomNumberComparison obj = new RandomNumberComparison();

        // Generate 5 random numbers
        int[] randomNumbers = obj.generate4DigitRandomArray(5);

        System.out.println("Generated 4-digit random numbers:");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }

        double[] result = obj.findAverageMinMax(randomNumbers);

        System.out.println("\n\nAverage value = " + result[0]);
        System.out.println("Minimum value = " + (int)result[1]);
        System.out.println("Maximum value = " + (int)result[2]);
    }
}
