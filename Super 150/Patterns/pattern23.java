import java.util.Scanner;

class pattern23{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int space=n-1;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=space;k++){
                System.out.print("   ");
            }
            for(int j=1;j<=i*2-1;j++){
                System.out.print("1  ");
            }
            System.out.println();
            space--;
        }
        
        }
    }
