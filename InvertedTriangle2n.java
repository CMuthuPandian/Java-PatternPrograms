/*

To print inverted pyramid star pattern

Input Format
Int -> Integer

Constraints
No Constraints

Output Format
Print the pattern

Sample Input 0
5

Sample Output 0

* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *

 */

import java.util.Scanner;

public class InvertedTriangle2n {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 2*n;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<count;k++){
                System.out.print("* ");
            }
            count=count-2;
            System.out.println();
        }

    }

}

/*

Output:

* * * * * * * * * * * * * 
  * * * * * * * * * * * 
    * * * * * * * * * 
      * * * * * * * 
        * * * * * 
          * * * 
            *
            
 */
