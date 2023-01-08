public class MirrorNumTriangle {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n; ++i) {
            int l;
            for(l = i; l < n; ++l) {
                System.out.print(" ");
            }

            for(l = i; l >= 1; --l) {
                System.out.print(l);
            }

            for(l = 2; l <= i; ++l) {
                System.out.print(l);
            }

            System.out.println();
        }

    }
}

/*

Output:

    1
   212
  32123
 4321234
543212345

 */
