public class TrapeziumPattern {
    public static void main(String[] args) {
        int n = 4;
        int first = 1;
        int second = n * n + 1;
        int space = 0;

        for(int i = n; i >= 1; --i) {
            int l;
            for(l = space; l >= 1; --l) {
                System.out.print(" ");
            }

            int var10001;
            for(l = 1; l <= i; ++l) {
                var10001 = first++;
                System.out.print("" + var10001 + " ");
            }

            for(l = 1; l <= i; ++l) {
                if (first == second) {
                    System.out.print(second++);
                } else {
                    var10001 = second++;
                    System.out.print(" " + var10001);
                }
            }

            System.out.println();
            space += 2;
            second = second - 1 - (i - 1) * 2;
        }

    }
}

/*

Output:

1 2 3 4  17 18 19 20
  5 6 7  14 15 16
    8 9  12 13
      10 11
      
 */
