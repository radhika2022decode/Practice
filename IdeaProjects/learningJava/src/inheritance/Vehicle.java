package inheritance;

public class Vehicle {
    private String color;
    protected int maxSpeed;
    public Vehicle(int maxSpeed){
        System.out.println("Vehicle's Constructor");
        this.maxSpeed=maxSpeed;
    }
    public void print(){
        System.out.println("Vehicle "+"Color: "+getColor()+" Maximum Speed: "+maxSpeed);
    }

    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
}
