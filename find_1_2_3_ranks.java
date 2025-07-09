public class Main {
    public static void main(String[] args) {
        int a = 20, b = 50, c = 40;
        int first = 0, second = 0, third = 0;
        if (a > b && a > c) {
            first = a;
            if (b > c) {
                second = b;
                third = c;
            } else {
                second = c;
                third = b;
            }
        } else if (b > a && b > c) {
            first = b;
            if (a > c) {
                second = a;
                third = c;
            } else {
                second = c;
                third = a;
            }
        } else {
            first = c;
            if (a > b) {
                second = a;
                third = b;
            } else {
                second = b;
                third = a;
            }
        }
        System.out.println("First Rank: " + first);
        System.out.println("Second Rank: " + second);
        System.out.println("Third Rank: " + third);
    }
}
