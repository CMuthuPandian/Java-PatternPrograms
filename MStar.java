public class MStar {
    public static void main(String[] args) {
        int n = 6;
        int row = 1;

        for(int i = 1; i < 2 * n; ++i) {
            int space = 2 * n - 2 * row;
            int j;
            for(j = 1; j <= row; ++j) {
                System.out.print("*");
            }

            for(j = 1; j <= space; ++j) {
                System.out.print(" ");
            }

            for(j = 1; j <= row; ++j) {
                System.out.print("*");
            }

            if (i < n) {
                ++row;
            } else {
                --row;
            }

            System.out.println();
        }

    }
}

/*

Output:

*          *
**        **
***      ***
****    ****
*****  *****
************
*****  *****
****    ****
***      ***
**        **
*          *

 */
