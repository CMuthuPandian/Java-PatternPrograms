package Pattern;

public class ArrowStarPattern {
    public static void main(String[] args){
        int n=10;
        int column=1;
        for(int i=1;i<2*n;i++){
            for(int j=1;j<=column;j++){
                System.out.print("*");
            }
            if(i<n)
                column++;
            else
                column--;
            System.out.println();
        }
    }
}

Output:

*
**
***
****
*****
******
*******
********
*********
**********
*********
********
*******
******
*****
****
***
**
*
