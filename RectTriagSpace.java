public class RectTriagSpace {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; ++i) {
            int m;
            for(m = 1; m <= i; ++m) {
                System.out.print(m);
            }
            for(m = i; m < n; ++m) {
                System.out.print(" ");
            }
            for(m = i; m < n; ++m) {
                System.out.print(" ");
            }
            for(m = i; m >= 1; --m) {
                System.out.print(m);
            }
            System.out.println();
        }

    }
}

/*

Output:

1        1
12      21
123    321
1234  4321
1234554321

 */
