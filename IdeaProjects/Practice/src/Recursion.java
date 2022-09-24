import java.util.*;


public class Recursion {
    public static int calcPower(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xPownm1 = calcPower(x, n-1);
        int xPow = x*xPownm1;
        return xPow;
    }

    public static void main(String[] args) {
        int x=5, n=3;
        int z= calcPower(x, n);
        System.out.println(z);
    }


//    public static void fibonacci(int a, int b, int n){
//        if(n==0){
//            return;
//        }
//        int c=a+b;
//        System.out.println(c);
//        fibonacci(b,c,n-1);
//    }
//    public static void main(String[] args) {
//        int a=0;
//        int b=1;
//        System.out.println(a);
//        System.out.println(b);
//        int n=7;
//        fibonacci(a, b, n-2);
//    }


//    public static int calcfactorial(int n){
//        if(n==1 || n==0){
//            return 1;
//        }
//        int fact_nm1=calcfactorial(n-1);
//        int fact_n= n * fact_nm1;
//        return fact_n;
//    }
//    public static void main(String[] args) {
//        int n=7;
//        int ans = calcfactorial(n);
//        System.out.println(ans);
//    }


//    public static void printSum(int i, int n, int sum){
//        if(i==n){
//            sum+=i;
//            System.out.println(sum);
//            return;
//        }
//        sum+= i;
//        printSum(i+1, n, sum);
//        System.out.println(i);
//    }
//
//    public static void main(String[] args) {
//        printSum(1,5,0);
//    }


//    public static void printNumb(int n){
//        if(n==6){
//            return; //base
//        }
//        System.out.println(n);//print
//        printNumb(n+1);//recursion
//    }
//    public static void main(String[] args) {
//        int n=1;
//        printNumb(n);
//    }
}
