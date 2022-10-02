import java.util.Scanner;

class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp=0;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=sp;k++){
                System.out.print("    ");
            }
            for(int j=1;j<=n-sp;j++){
                System.out.print("* ");
            }
            sp++;
         
            System.out.println();
        }
    }
}