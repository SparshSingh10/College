import java.util.Scanner;

class pattern10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp=0;
        for(int i=n;i>=0;i--){
            for(int k=1;k<=sp;k++){
                System.out.print("  ");
            }
            for (int j=1;j<=i*2-1;j++) {
                System.out.print("* ");
            }
       sp++;
            System.out.println();
        }
    }
}





// import java.util.Scanner;

// class Pattern10{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i--){
//             for(int k=1;k<i;k++){
//                 System.out.print("  ");
//             }
//             for (int j=1;j<=i*2-1-;j++) {
//                 System.out.print("*i* ");
//             }
//        sp++;
//             System.out.println();
//         }
//     }
// }