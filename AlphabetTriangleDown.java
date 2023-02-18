/*

Print the pattern as given below

Input Format
It should be an Integer

Constraints
1<= N <= 100

Output Format
Print the pattern

Sample Input 0
3

Sample Output 0
abc
ab
a

Sample Input 1
5

Sample Output 1
abcde
abcd
abc
ab
a

 */

import java.util.Scanner;

public class AlphabetTriangleDown {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int alp = 97;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print((char)alp);
                alp++;
            }
            alp=97;
            System.out.println();
        }
    }
    
}

/*

Output:

7
abcdefg
abcdef
abcde
abcd
abc
ab
a

 */
