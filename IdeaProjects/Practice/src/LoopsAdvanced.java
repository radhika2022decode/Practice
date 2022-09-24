public class LoopsAdvanced {
    public static void main(String[] args) {
        int m=5;
        int n=4;

//        Problem 1
//        for(int i=1; i<=m; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            int spaces= 2*(m-i);
//            for(int j = 1; j<=spaces; j++){
//                System.out.print(" ");
//            }
////              2nd part
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
////        LOWER HALF
//        for(int i=m; i>=1; i--){
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            int spaces= 2*(m-i);
//            for(int j = 1; j<=spaces; j++){
//                System.out.print(" ");
//            }
////              2nd part
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        Problem 2
//        for(int i=1; i<=m; i++){
//            for(int j=1; j<=m-i; j++){
//                System.out.print(" ");
//            }
//            for(int j=1; j<=5; j++){
//                if(i==1 || j==1 || i==m || j==m) {
//                    System.out.print("*");
//                }
//                else{
//                        System.out.print(" ");
//                    }
//            }
//            System.out.println();
//        }
//        Problem 3
//        for(int i=1; i<=5; i++){
//            for(int j=1; j<=m-i; j++){
//                System.out.print(" ");
//            }
//            for(int j=1; j<=i; j++){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }
//        Problem 4
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
//            for(int j=i; j>=1; j--){
//                System.out.print(j);
//            }
            for(int j=2; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
//            for(int j=i; j>=1; j--){
//                System.out.print(j);
//            }
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
