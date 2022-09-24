package classesandobjects;

import java.util.Scanner;

public class studentUse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(student.getNumStudents());
        student s1=new student("Tanisha");
        student s2=new student("Priya");
        System.out.println(student.getNumStudents());
//        System.out.println(s1.getNumStudents());
//        System.out.println(s2.getNumStudents());
        s1.print();
        s2.print();
//        s1.name="Radhika";
//        s1.setRollNumber(34);
//        System.out.println("s1 "+ s1);
     //   s1.rollNum=42;
        //s2.name="Siya";
       // s2.rollNum=56;
        //System.out.println(s1.getRollNumber());
        //System.out.println(s1.name+" "+s1.rollNum);
        //System.out.println(s2.name+" "+s2.rollNum);

    }
}
