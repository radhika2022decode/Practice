import java.util.*;
import java.util.Scanner;
public class strings {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name= new String("Radhika");
        System.out.println(name.length()); //length
        System.out.println(name+" "+"Gupta"); //concatenate
        //int temp=0;
        int n=name.length();
        for(int i=n; i>=0; i--){
            System.out.println(name[i]);
        }
    }


}
