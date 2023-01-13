
public class XStar {
    public static void main(String[] args){
        int n = 5;
        int column = 1;
        int space=n-2;
        for(int i = 1; i <=n; ++i) {
            for(int j = 1; j <= column; ++j) {
                System.out.print("*");
            }
            for(int k=1;k<=space;k++){
                System.out.print(" ");
            }
            if((n/2)+1==i)
                --column;
            for(int j = 1; j <= column; ++j) {
                System.out.print("*");
            }
            if((n/2)+1==i)
                ++column;
            if (i <= n/2) {
                ++column;
                space=space-2;
            } else {
                --column;
                space=space+2;
            }

            System.out.println();
        }
    }

}

/*

Output:

*   *
** **
*****
** **
*   *

 */
