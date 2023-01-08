public class LineDiamondStarPattern {
    public static void main(String[] args) {
        int n = 10;
        int space = 1;
        int count = 1;

        for(int i = 1; i <= n - 1; ++i) {
            int k;
            for(k = space; k <= (n - 1) / 2; ++k) {
                System.out.print(" ");
            }

            if (i != 1 && i != n - 1) {
                System.out.print("*");

                for(k = 1; k <= count; ++k) {
                    System.out.print(" ");
                }

                System.out.print("*");
            } else {
                System.out.print("*");
                count -= 2;
            }

            if (i < n / 2) {
                ++space;
                count += 2;
            } else {
                --space;
                count -= 2;
            }

            System.out.println();
        }

    }
}
