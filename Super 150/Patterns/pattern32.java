import java.util.Scanner;

class pattern32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 1;
        for (int i = 1; i < 2 * n; i++) {
            for (int j = 1; j <= x * 2 - 1; j++) {
                if (j % 2 != 0)
                    System.out.print(x + "  ");
                else
                    System.out.print("* ");
            }
                if (i< n)
                    x++;
                else
                    x--;
                System.out.println();
        }

    }
}