public class NumberDiamond {
    public static void main(String[] args) {
        int n = 4;
        int column = 1;
        int space = 1;

        for(int i = 1; i < 2 * n; ++i) {
            int j;
            for(j = space; j < n; ++j) {
                System.out.print(" ");
            }

            for(j = column; j >= 1; --j) {
                System.out.print(j);
                if (j == 1) {
                    for(int k = 2; k <= column; ++k) {
                        System.out.print(k);
                    }
                }
            }

            if (i < n) {
                ++column;
                ++space;
            } else {
                --column;
                --space;
            }

            System.out.println();
        }

    }
}
