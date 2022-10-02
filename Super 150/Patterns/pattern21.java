import java.util.Scanner;

class pattern21{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int space=2*n-3;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*  ");
            }
            for(int k=1;k<=space;k++){
                System.out.print("   ");
            }
            for(int j=1;j<=i;j++){
                if(j<n)
                System.out.print("*  ");
            }
            System.out.println();
            space-=2;
        }
        
        }
    }
