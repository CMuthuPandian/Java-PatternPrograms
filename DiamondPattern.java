public class DiamondPattern {
    public static void main(String[] args) {
        int n = 5;
        int space = n;
        int row = 1;

        for(int i = 1; i <= 2 * n; ++i) {
            int j;
            for(j = 1; j <= space; ++j) {
                System.out.print(" ");
            }

            for(j = 1; j <= row; ++j) {
                System.out.print("* ");
            }

            if (i < n) {
                --space;
                ++row;
            } else {
                ++space;
                --row;
            }

            System.out.println();
        }

    }
}
