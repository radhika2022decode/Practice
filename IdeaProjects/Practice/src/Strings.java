import java.util.*;

public class Strings {
    public static void main(String[] args) {
//        String sentence="My name is Tony.";
//        String name=sentence.substring(11,sentence.length());
//        System.out.println(name);

//      String fullname="tony";
//      String lastname="Stark";
//      String sentence=fullname+lastname;
//        System.out.println(sentence.length());

//        charAt
//        for (int i=0; i<sentence.length(); i++){
//            System.out.print(sentence.charAt(i)+" ");
//        }
        StringBuilder sb= new StringBuilder("hello");
//        string reversal:
        for(int i=0; i<sb.length()/2; i++){
            int front=i;
            int back= sb.length()-1-i;
            char frontChar=sb.charAt(front);
            char backChar=sb.charAt(back);
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
//        System.out.println(sb);
//        System.out.println(sb.charAt(0));
//        sb.setCharAt(0, 'P');
//        System.out.println(sb);
//        sb.insert(2, 'n');
//        System.out.println(sb);
//        sb.delete(2,4);
//        System.out.println(sb);
//        sb.append("s");
//        System.out.println(sb.length());
    }
}
