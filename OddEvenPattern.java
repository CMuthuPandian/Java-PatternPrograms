/*

Print the following number pattern

Input Format
n-Integer

Constraints
n>0

Output Format
pattern

Sample Input 0
5

Sample Output 0

1
2 4
3 5 7
6 8 10 12
9 11 13 15 17

Sample Input 1
7

Sample Output 1

1
2 4
3 5 7
6 8 10 12
9 11 13 15 17
14 16 18 20 22 24
19 21 23 25 27 29 31

 */

import java.util.Scanner;

public class OddEvenPattern {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int odd =1;
        int even =2;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(i%2==0){
                    System.out.print(odd+" ");
                    odd=odd+2;
                }
                else{
                    System.out.print(even+" ");
                    even=even+2;
                }
            }
            System.out.println();
        }
    }
}

/*

Output:

9
1 
2 4 
3 5 7 
6 8 10 12 
9 11 13 15 17 
14 16 18 20 22 24 
19 21 23 25 27 29 31 
26 28 30 32 34 36 38 40 
33 35 37 39 41 43 45 47 49 

 */
