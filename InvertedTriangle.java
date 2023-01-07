public class InvertedTriangle {
    public static void main(String[] args) {
        int n = 5;
        int column = 2 * n - 1;

        for(int i = 1; i <= n; ++i) {
            int k;
            for(k = 1; k < i; ++k) {
                System.out.print(" ");
            }

            for(k = 1; k <= column; ++k) {
                System.out.print("*");
            }

            column -= 2;
            System.out.println();
        }

    }
}
