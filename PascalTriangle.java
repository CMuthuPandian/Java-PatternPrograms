import java.io.PrintStream;

public class PascalTriangle {

    public static void main(String[] args) {
        int n = 5;
        printPascal(n);
    }
    
    public static void printPascal(int n) {
        for (int line = 1; line <= n; line++) {
            for (int j = 0; j <= n - line; j++) {
                System.out.print(" ");
            }
            int C = 1;
            for (int i = 1; i <= line; i++) {
                System.out.print(C + " ");
                C = C * (line - i) / i;
            }
            System.out.println();
        }
    }
    
}

/*

Output:

     1 
    1 1 
   1 2 1 
  1 3 3 1 
 1 4 6 4 1

 */
