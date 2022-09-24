import java.util.Scanner;

public class bitManipulation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int oper=sc.nextInt();
        int n=5; //0101
        int pos=1;
        if(oper==1){
            int bitMask=1<<pos;
            int newNum=bitMask | n;
            System.out.println(newNum);
        }
        else{
            int bitMask=1<<pos;
            int notbitMask=~(bitMask);
            int newNumber= notbitMask & n;
            System.out.println(newNumber);
        }



//        int notbitMask=~(bitMask);

//        int newNumber= notbitMask & n;
//        System.out.println(newNumber);

//        int newNum= bitMask | n;
//        System.out.println(newNum);

//
//        if((bitMask & n) == 0){
//            System.out.println("bit was zero");
//        }
//        else {
//            System.out.println("bit was one");
//        }
    }
}
