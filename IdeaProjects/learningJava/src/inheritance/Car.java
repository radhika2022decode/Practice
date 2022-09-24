package inheritance;
public class Car extends Vehicle {
    int numDoors;
//    int maxSpeed;

    public Car(int numDoors, int maxSpeed){
        super(maxSpeed);  //it should always be the first call
        System.out.println("Car's Constructor");
        this.numDoors=numDoors;
    }
    public void print(){
        super.print();
        System.out.println("Car "+"Color: "+getColor()+" maxspeed "+maxSpeed+ " Number of Doors: "+numDoors);
    }

    public void printMaxSpeed(){
        super.maxSpeed=70;
        System.out.println(maxSpeed+" "+super.maxSpeed);
    }

}
