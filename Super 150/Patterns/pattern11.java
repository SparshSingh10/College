import java.util.Scanner;

class pattern11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int k=n-i-1;k>0;k--){
                System.out.print("  ");
            }
            for (int j=0;j<2*i+1;j++) {
                if(j%2==0)
                    System.out.print("* ");
                else
                    System.out.print("! ");
            }
            System.out.println();
        }
    }
}





