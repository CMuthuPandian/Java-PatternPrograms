package Pattern;

public class AlphabetRightTriangle {
    public static void main(String[] args){
        int n=5;
        int count=1;
        int alp1=97;
        int alp2=65;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(count%2!=0){
                    System.out.print((char)alp1+" ");
                    count++;
                    alp1++;
                    alp2++;
                }
                else {
                    System.out.print((char) alp2 + " ");
                    count++;
                    alp1++;
                    alp2++;
                }
            }
            System.out.println();
        }
    }
}
