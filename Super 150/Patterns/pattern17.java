import java.util.Scanner;

class pattern17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x=n/2;
        int space=1;
        for(int i = 1; i <= n; i++) {
            for (int j = 1; j <= x; j++) {
                System.out.print("* ");
            }
        for (int k = 1; k <= space; k++) {
            System.out.print("  ");
        }
        for (int j = 1; j <= x; j++) {
            System.out.print("* ");
        }
        if(i<=n/2){
        x--;
        space+=2;
        }
        else
        {
            x++;
            space-=2;
        }
        System.out.println();
        }
    }

        }
