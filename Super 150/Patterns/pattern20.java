import java.util.Scanner;

class pattern20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space1=n-1;
        int space2=1;
        int x=1;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=space1;k++){
                System.out.print("  ");
            }
            
            System.out.print("* ");
            for(int k=1;k<=space2;k++){
                System.out.print("  ");
            }
            if(i==1||i==n)
                System.out.println();
            else{
             System.out.print("* ");
             System.out.println();
            }
            if(i<=n/2){
                space1--;
                space2+=2;
                x++;
            }
            else{
                space1++;
                space2-=2;
                x--;
                }
        }

        }
    }
