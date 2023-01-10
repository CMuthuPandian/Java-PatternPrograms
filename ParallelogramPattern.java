public class ParallelogramPattern {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n; ++i) {
            int j;
            for(j = i; j <= n - 1; ++j) {
                System.out.print(" ");
            }

            for(j = 1; j <= n; ++j) {
                if (i != 1 && i != n && j != 1 && j != n) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }

    }
}
