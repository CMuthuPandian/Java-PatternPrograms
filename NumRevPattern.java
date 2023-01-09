public class NumRevPattern {
    public static void main(String[] args) {
        int n = 6;
        int p = n;

        for(int i = 1; i <= n; ++i) {
            for(int j = p; j >= 1; --j) {
                System.out.print("" + i + " ");
            }

            --p;
            System.out.println();
         }

    }
}

/*

Output:

1 1 1 1 1 1 
2 2 2 2 2 
3 3 3 3 
4 4 4 
5 5 
6

 */
