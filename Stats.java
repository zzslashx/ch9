public class Stats {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: error");
            return;
        }

        int count = args.length;
        int sum = 0;
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[0]);

        for (int i = 0; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);
            sum = sum + num;
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        double average = (double) sum / count;

        System.out.println("Count: " + count);
        System.out.println("Sum: " + sum);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.printf("Average:, %.2f\n", average);
    }
}
