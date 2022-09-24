import java.util.Scanner;

public class Arrays {
    public static int multiply(int n, int m){
        int ans =0;

        while(m>0) {
            System.out.println(m & 1);
            if ((m & 1) != 0) {
                ans = ans + n;
                System.out.println(ans);

            }
            n = n << 1;
            m = m >> 1;
            System.out.println(n);
            System.out.println(m);
            System.out.println(" ");

        }
        return ans;
    }
    public static void main(String[] args) {
        int ans= multiply(10, 10);
        System.out.println(ans);

//        System.out.println("Enter the length of array:");
//        Scanner sc=new Scanner(System.in);
//        int size=sc.nextInt();
//        int numbers[]= new int[size];
//        for(int i=0; i<size; i++){
//            numbers[i]=sc.nextInt();
//        }
//
//        System.out.println("number to be searched:");
//        int x= sc.nextInt();
//        int[] marks=new int[3];
//        marks[0]=97;
//        marks[1]=90;
//        marks[2]=88;
//        int temp=0;
//        for(int i=0; i<numbers.length; i++){
//            numbers[i]=temp;
//            numbers[numbers.length-i-1]

//            if(numbers[i]==x){
//                System.out.println("x found at index:"+i);
//            }
//        }
//        System.out.println(marks[0]);
    }
}
