package classesandobjects;
public class student {

    public String name;
    final private int rollNum;
    double cgpa;
    public final static double CONVERSIONFACTOR= 0.95;
    private static int numStudents;

    public student(String name){
        this.name = name;
        numStudents++;
        this.rollNum=numStudents;
    }

    public static int getNumStudents(){
        return numStudents;
    }
//    public student(String n){
//        name=n;
//        this.rollNum=numStudents;
//        rollNum=0;
//    }
    public void print(){
        System.out.println(name +" "+rollNum);
    }


    public int getRollNumber(){

        return this.rollNum;
    }
    public void setRollNumber(int rollNum){
        if(rollNum<=0){
            return;
        }
        System.out.println("this "+this);
//        this.rollNum=rollNum;
    }

}
