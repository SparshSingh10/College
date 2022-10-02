import java.util.Scanner;

class pattern15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x=n;
        int space=0;
        for(int i=1;i<2*n;i++){
            for(int k=1;k<=space;k++){
                System.out.print("   ");
            }
            for(int j=1;j<=x;j++){
                System.out.print("*  ");
            }
            if(i<n){
                space+=2;
                x--;
            }
            else{
                space-=2;
                x++;
            }
            System.out.println();

        }
    }
}