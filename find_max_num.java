public class Main {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;

        if (a >= b && a >= c) {
            System.out.println("A is the greatest");
        } else if (b >= a && b >= c) {
            System.out.println("B is the greatest");
        } else {
            System.out.println("C is the greatest");
        }
    }
}
