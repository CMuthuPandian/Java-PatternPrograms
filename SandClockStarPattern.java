public class SandClockStarPattern {
    public static void main(String[] args) {
        int n = 5;
        int space = 1;
        int star = 1;

        for(int i = 1; i <= 2 * n; ++i) {
            int k;
            for(k = 1; k < space; ++k) {
                System.out.print(" ");
            }

            for(k = star; k <= n; ++k) {
                System.out.print("* ");
            }

            if (i < n) {
                ++star;
                ++space;
            } else if (i == n) {
                star = star;
                space = space;
            } else {
                --star;
                --space;
            }

            System.out.println();
        }

    }
}

/*

Output:

* * * * * 
 * * * * 
  * * * 
   * * 
    * 
    * 
   * * 
  * * * 
 * * * * 
* * * * *

 */
