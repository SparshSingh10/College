import java.util.Scanner;

class Pattern9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=n-i;k>=1;k--){
                System.out.print(" ");
            }
            for (int j=0;j<i*2-1;j++) {
                System.out.print("*");
            }
       
            System.out.println();
        }
    }
}