import java.util.*;
class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int sp = n - 1;
        while (i<=n) {
            for(int k=1;k<=sp;k++){
                System.out.print(" ");
            }
            sp--;
            int j=1;
            while (j<=i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
