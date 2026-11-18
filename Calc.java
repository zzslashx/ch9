public class Calc {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Usage: java Calc <add|mult|max|min> <numbers>");
            return;
        }

        String res = args[0];

        if (!res.equals("add") && !res.equals("mult") && !res.equals("max") && !res.equals("min")) {
            System.err.println("Unknown operation: " + res);
            return;
        }

        int result = 0;

        for (int i = 1; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);
            if (i == 1) {
                result = num;
            } else if (res.equals("add")) {
                result = result + num;
            } else if (res.equals("mult")) {
                result = result * num;
            } else if (res.equals("max") && num > result) {
                result = num;
            } else if (res.equals("min") && num < result) {
                result = num;
            }
        }

        System.out.println(result);
    }
}
