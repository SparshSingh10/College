import java.util.Scanner;

class pattern18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space=n-1;
        int x=1;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=space;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*x-1;j++){
                System.out.print("* ");
            }
            System.out.println();
            if(i<=n/2){
                space--;
                x++;
            }
            else{
                space++;
                x--;
                }
        }

        }
    }