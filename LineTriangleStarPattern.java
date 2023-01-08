public class LineTriangleStarPattern {
    public static void main(String[] mains) {
        int n = 5;
        int space = 1;

        for(int i = 1; i <= n; ++i) {
            int l;
            for(l = i; l < n; ++l) {
                System.out.print(" ");
            }

            if (i == 1) {
                System.out.print("*");
                space -= 2;
            } else if (i == n) {
                for(l = 1; l < 2 * n; ++l) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");

                for(l = 1; l <= space; ++l) {
                    System.out.print(" ");
                }

                System.out.print("*");
            }

            space += 2;
            System.out.println();
        }

    }
}
