public class LineTriangleStarPattern1 {
    public static void main(String[] args) {
        int n = 5;
        int space = 2 * n - 5;

        for(int i = 1; i <= n; ++i) {
            int l;
            for(l = 1; l < i; ++l) {
                System.out.print(" ");
            }

            if (i == 1) {
                for(l = 1; l < 2 * n; ++l) {
                    System.out.print("*");
                }

                space += 2;
            } else if (i == n) {
                System.out.print("*");
            } else {
                System.out.print("*");

                for(l = 1; l <= space; ++l) {
                    System.out.print(" ");
                }

                System.out.print("*");
            }

            space -= 2;
            System.out.println();
        }

    }
}
