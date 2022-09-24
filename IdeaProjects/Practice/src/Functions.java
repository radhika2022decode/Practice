import java.util.*;

public class Functions {
    static int a=0, b=1;
    public static void fibonacci(int n){

        if(n>0){
            int c=a+b;
            a=b;
            b=c;
            System.out.print(" "+c);
            fibonacci(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.print(a+" ");
        System.out.print(b);
        fibonacci(n-2);


    }


//    public static int exponent(int x, int n){
//        int a=x^n;
//        return a;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int x=sc.nextInt();
//        int n=sc.nextInt();
//        System.out.println("Exponential of two numbers is: "+ exponent(x,n));
//    }


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num, pos=0, neg=0, zero=0;
//        char choice;
//        do{
//            System.out.println("Enter the number");
//            num= sc.nextInt();
//            if(num>0){
//                pos++;
//            }
//            else if(num<0){
//                neg++;
//            }
//            else{
//                zero++;
//            }
//            System.out.println("Do you want to continue? Y/N");
//            choice=sc.next().charAt(0);
//        }while (choice="Y" || choice="N");
//    }


//    public static void main(String[] args) {
//        int i =11;
//        do{
//            System.out.println(i);
//            i++;
//        }while(true);
//    }


//    public static int elgToVote(int a){
//        if(a>=18){
//            System.out.println("Eligible to vote");
//        }
//        else{
//            System.out.println("Not eligible to vote");
//        }
//        return a;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a= sc.nextInt();
//        System.out.println(elgToVote(a));
//    }


//    public static double cirOfCircle(int r){
//        double cir= 2*3.14*r;
//        return cir;
//    }
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int r= sc.nextInt();
//        System.out.println("Circumference ofr circle is:"+cirOfCircle(r));
//    }


//    public static int factorialOfNum(int n) {
//        int f = 1;
//        for(int i=n; i>=1; i--){
//           f=f*i;
//        }
//        System.out.println(f);
//        return f;
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n= sc.nextInt();
//        System.out.println("Factorial of n is:" + factorialOfNum(n));
//    }


//    public static int calcSum(int n){
//        return n;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n= sc.nextInt();
//        int oddSum=0;
//        for(int i=1; i<=n; i++){
//            if(i%2 != 0){
//                System.out.println(oddSum=oddSum+i);
//            }
//        }
////        System.out.println(calcSum);
//    }


//          public static void main(String args[]){
//              int a, b;
//              Scanner sc=new Scanner(System.in);
//               a= sc.nextInt();
//               b= sc.nextInt();
//              if(a>b){
//                  System.out.println("greatest no. is "+ a);
//              }
//              else if(a<b){
//                  System.out.println("greatest no. is "+ b);
//              }
//              else{
//                  System.out.println("both are equal");
//              }
//          }

}
