import java.util.Scanner;

class pattern22{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int space=-1;
        int x=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=x;j++){
                System.out.print("*  ");
            }
            for(int k=1;k<=space;k++){
                System.out.print("   ");
            }
            for(int j=1;j<=x;j++){
                if(j<n)
                System.out.print("*  ");
            }
            System.out.println();
            space+=2;
            x--;
        }
        
        }
    }
