import java.util.Scanner;

class Pattern9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n;k--){
                System.out.print(" ");
            }
            for (int j=0;j<i;j++) {
                System.out.print("*");
            }
       
            System.out.println();
        }
        for(int i=n-1;i>=1;i++){
            for (int j=1;j<=i;j++) {
                System.out.print("*");
            }
       
            System.out.println();
        }
    }
}