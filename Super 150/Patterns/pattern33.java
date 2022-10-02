
import java.util.Scanner;
class pattern33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val = n;
        int space=n-1;
        for (int i = 1; i <=n; i++) {
            for(int k=1;k<=space;k++){
                System.out.print("  ");
            }
            int p=val;
            for (int j = 1; j <= 2*i-1; j++) {
                if (j==i)
                    System.out.print("0 ");
                else
                    System.out.print(p+" ");
                if(j<i){
                    p++;
                }
                else{
                    p--;
                }
            }
            space--;
            val--;
                System.out.println();
        }

    }
}
