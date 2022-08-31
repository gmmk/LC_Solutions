public class Introduction {
    // Write a function that takes in a number and prints it.

    public static void main(String[] args) {
        printNumbers(5);
    }

    public static void printNumbers(int n) {
        if(n == 0) return;
        System.out.println(n);
        printNumbers(--n);
    }

}
