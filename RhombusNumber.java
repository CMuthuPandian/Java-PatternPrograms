public class RhombusNumber {
    public static void main(String[] args) {
        int n = 5;
        int count = 1;
        int space = 1;
        for(int i = 1; i < n * 2; ++i) {
            int j;
            for(j = n - space; j > 0; --j) {
                System.out.print(" ");
            }
            int start;
            if (i < n) {
                start = i;
                ++space;
            } else {
                start = n * 2 - i;
                --space;
            }
            for(j = 0; j < count; ++j) {
                System.out.print(start);
                if (j < count / 2) {
                    --start;
                } else {
                    ++start;
                }
            }
            if (i < n) {
                count += 2;
            } else {
                count -= 2;
            }
            System.out.println();
        }

    }
}

/*

Output:

    1
   212
  32123
 4321234
543212345
 4321234
  32123
   212
    1
    
 */
