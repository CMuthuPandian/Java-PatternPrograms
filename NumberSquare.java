/*

Print the pattern as per the sample output Without ROTATION

Input Format
int -> integer

Constraints
No Constraints

Output Format
Print the pattern

Sample Input 0
6

Sample Output 0

  1  2  3  4  5  6
  2  3  4  5  6  1
  3  4  5  6  1  2
  4  5  6  1  2  3
  5  6  1  2  3  4
  6  1  2  3  4  5

Sample Input 1
11

Sample Output 1

  1  2  3  4  5  6  7  8  9 10 11
  2  3  4  5  6  7  8  9 10 11  1
  3  4  5  6  7  8  9 10 11  1  2
  4  5  6  7  8  9 10 11  1  2  3
  5  6  7  8  9 10 11  1  2  3  4
  6  7  8  9 10 11  1  2  3  4  5
  7  8  9 10 11  1  2  3  4  5  6
  8  9 10 11  1  2  3  4  5  6  7
  9 10 11  1  2  3  4  5  6  7  8
 10 11  1  2  3  4  5  6  7  8  9
 11  1  2  3  4  5  6  7  8  9 10


 */
import java.util.Scanner
public class NumberSquare {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                System.out.printf("%3d",j);
            }
            for(int k=0;k<i;k++){
                System.out.printf("%3d",k+1);
            }
            System.out.println();
        }
    }

}

/*

Output:

13
  1  2  3  4  5  6  7  8  9 10 11 12 13
  2  3  4  5  6  7  8  9 10 11 12 13  1
  3  4  5  6  7  8  9 10 11 12 13  1  2
  4  5  6  7  8  9 10 11 12 13  1  2  3
  5  6  7  8  9 10 11 12 13  1  2  3  4
  6  7  8  9 10 11 12 13  1  2  3  4  5
  7  8  9 10 11 12 13  1  2  3  4  5  6
  8  9 10 11 12 13  1  2  3  4  5  6  7
  9 10 11 12 13  1  2  3  4  5  6  7  8
 10 11 12 13  1  2  3  4  5  6  7  8  9
 11 12 13  1  2  3  4  5  6  7  8  9 10
 12 13  1  2  3  4  5  6  7  8  9 10 11
 13  1  2  3  4  5  6  7  8  9 10 11 12
 
 */
