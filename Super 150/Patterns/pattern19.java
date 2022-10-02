import java.util.Scanner;

class pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = -1;
        int x = n;
        int star = n / 2 + 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= star; j++) {
                System.out.print("* ");
            }
            for (int k = 1; k <= space; k++) {
                System.out.print("  ");
            }if(i==1||i==n)
            {

                for (int j = 1; j < star; j++) {
                    // if(i==1 || i==n)
                    //     j=1;
                    System.out.print("* ");
                }
            }
            else
            for (int j = 1; j <= star; j++) {
                // if(i==1 || i==n)
                //     j=1;
                System.out.print("* ");
            }
            if (i <(n / 2+1)) {
                star--;
                space += 2;
            } else {
                star++;
                space -= 2;
            }
            System.out.println();
        }

    }
}
