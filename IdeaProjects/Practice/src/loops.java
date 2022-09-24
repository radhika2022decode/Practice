
import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
//        for(int x = 0; x<=10; x++){
//            System.out.println(x);
//        }
//        int i = 0;
//        while(i<11){
//            System.out.println(i);
//            i++;
//        }
//        int i =0;
//        do{
//            System.out.println(i);
//            i++;
//        }while(i<11);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mul=0;
        for(int i=1; i<=10;i++){

            mul=n*i;
            System.out.println(mul);

        }
    }
}
