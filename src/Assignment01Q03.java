public class Assignment01Q03 {
    public static void main(String[] args) {
        String str = args[0];
        int x = Integer.parseInt(str);
        System.out.println("The first " + x + " Fibonacci numbers are:");
        int numOdd = 0;
        int a = 1, b = 1;
        for (int i = 0; i < x; i++) {
            System.out.print(a);
            if (a % 2 != 0) {
                numOdd++;
            }
            if (i < x - 1) {
                System.out.print(" "); // Make sure we don't print a trailing space
            }
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();
        
        ////////////////////////////////////////////////////////////////
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
