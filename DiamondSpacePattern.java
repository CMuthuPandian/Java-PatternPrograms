public class DiamondSpacePattern {
    public static void main(String[] args) {
        int n = 10;
        int space = 1;
        int count = 1;

        for(int i = 1; i <= n; ++i) {
            int j;
            for(j = count; j <= n / 2; ++j) {
                System.out.print("*");
            }

            for(j = 1; j < space; ++j) {
                System.out.print(" ");
            }

            for(j = count; j <= n / 2; ++j) {
                System.out.print("*");
            }

            if (i < n / 2) {
                space += 2;
                ++count;
            } else if (i == n / 2) {
                space = space;
                count = count;
            } else {
                space -= 2;
                --count;
            }

            System.out.println();
        }

    }
}
