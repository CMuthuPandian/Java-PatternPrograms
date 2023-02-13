/*

print the pattern. Sample output is given.

Input Format
int

Constraints
Nil

Output Format
print the pattern

Sample Input 0
5

Sample Output 0

*   *
 * *
  *
 * *
*   *

Sample Input 1
12

Sample Output 1

*          *
 *        *
  *      *
   *    *
    *  *
     **
    *  *
   *    *
  *      *
 *        *
*          *

 */
import java.util.Scanner;
public class XStarPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=1;i<=n;i++){
            if(n%2==0 && (n/2+1)==i){
                continue;
            }
            else{
                for(int j=1;j<=n;j++){
                    if((i==j)||(i+j)==n+1){
                        System.out.print("*");
                    }
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}

/*

Output:

8
*      *
 *    * 
  *  *  
   **   
  *  *  
 *    * 
*      *

 */
