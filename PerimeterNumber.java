public class PerimeterNumber {
    public static void main(String[] args) {
        int n = 4;

        for(int i = 1; i < 2 * n; ++i) {
            for(int j = 1; j < 2 * n; ++j) {
                if (i != 1 && i != 7 && j != 1 && j != 7) {
                    if (i == n && j == n) {
                        System.out.print("1 ");
                    } else if (i != 3 && i != 4 && i != 5 || j != 3 && j != 4 && j != 5) {
                        System.out.print("3 ");
                    } else {
                        System.out.print("2 ");
                    }
                } else {
                    System.out.print("4 ");
                }
            }
            System.out.println();
        }

    }
}

/*

Output:

4 4 4 4 4 4 4 
4 3 3 3 3 3 4 
4 3 2 2 2 3 4 
4 3 2 1 2 3 4 
4 3 2 2 2 3 4 
4 3 3 3 3 3 4 
4 4 4 4 4 4 4 

 */
