import java.util.Scanner;

class pattern16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x=n;
        int space=n-1;
        for(int i=1;i<2*n;i++){
            for(int k=1;k<=space;k++){
                System.out.print("   ");
            }
            for(int j=1;j<=x;j++){
                System.out.print("*  ");
            }
            if(i<n){
                space-=1;
                x--;
            }
            else{
                space+=1;
                x++;
            }
            System.out.println();

        }
    }
}