package Pattern;

public class CapRevRightTriag1 {
    public static void main(String[] args){
        int n=5;
        int alp=64;
        int temp=alp+n;
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print((char)temp+" ");
                temp--;
            }
            System.out.println();
            temp=alp+n-i;
        }
    }
}

Output:

E D C B A 
D C B A 
C B A 
B A 
A
