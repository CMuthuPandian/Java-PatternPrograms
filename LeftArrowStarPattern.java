/*

Write a C program to print left arrow star pattern series using for loop

Input Format
Int ->

Constraints
Nil

Output Format
Print pattern

Sample Input 0
5

Sample Output 0

    *****
   ****
  ***
 **
*
 **
  ***
   ****
    *****

 */
import java.util.Scanner;
public class LeftArrowStarPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = n-1;
        int count1 = n;
        for(int i=1;i<2*n;i++){
            for(int j=0;j<count;j++){
                System.out.print(" ");
            }
            for(int k=0;k<count1;k++){
                System.out.print("*");
            }
            if(i<n){
                count--;
                count1--;
            }
            else{
                count++;
                count1++;
            }
            System.out.println();
        }
    }
}

/*

9
        *********
       ********
      *******
     ******
    *****
   ****
  ***
 **
*
 **
  ***
   ****
    *****
     ******
      *******
       ********
        *********
        
 */
