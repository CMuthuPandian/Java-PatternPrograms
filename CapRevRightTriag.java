package Pattern;

public class CapRevRightTriag {
    public static void main(String[] args){
        int n=5;
        int alp=64;
        int temp=alp+n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(temp)+" ");
                temp++;
            }
            System.out.println();
            temp=alp+n-i;
        }
    }
}

/*

Output:

E 
D E 
C D E 
B C D E 
A B C D E

*/
