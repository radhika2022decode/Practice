import java.util.*;
public class largestNum {
    public static int LargestNum(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i< numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        int numbers[]={5,8,3,9,2};
        System.out.println(LargestNum(numbers));


    }

}
