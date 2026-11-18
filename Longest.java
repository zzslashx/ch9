public class Longest {
    public static void main(String[] args) {
        if (args.length == 0) {
         System.err.println("Usage: error");
            return;
        }

          String first = args[0];
        String longest = args[0];
      

        for (int i = 1; i < args.length; i++) {
            if (args[i].length() > longest.length()) {
                longest = args[i];
            }
            if (args[i].compareTo(first) < 0) {
                first = args[i];
            }
        }

        System.out.println("Longest: " + longest + " (" + longest.length() + " letters)");
        System.out.println("First alphabetically: " + first);
    }
}
