public class MPattern {
    public static void main(String[] args) {
        int n = 3;

        for(int i = 1; i <= n; ++i) {
            for(int j = 1; j <= 3 * n; ++j) {
                if (i % 2 != 0) {
                    if ((i + j) % 4 == 0) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                } else if (j % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

    }
}

/*

Output:

    *       *     
  *   *   *   *   
*       *       * 

 */
