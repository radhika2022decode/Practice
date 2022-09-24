import java.util.*;
public class linear_Search {
    public static int linearSearch(int num[], int key){
        for(int i=0; i< num.length; i++){
            if(num[i] == key){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int num[]= {2,4,7,9,5,1,3};
        int key=8;
        int index=linearSearch(num,key);
        if(index==-1){
            System.out.println("Key not found");
        }
        else{
            System.out.println("Key found at index: "+index);
        }

    }
}
