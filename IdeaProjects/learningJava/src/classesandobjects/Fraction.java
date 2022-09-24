package classesandobjects;

public class Fraction {

    private int numerator;
    private int denominator;
    public Fraction(int numerator, int denominator){
        this.numerator= numerator;
        this.denominator= denominator;
        simplify();
    }

    private void simplify() {
        int gcd = 1;
        int smaller = Math.min(numerator,denominator);
        for(int i=2; i<=smaller; i++){
            if(numerator%i == 0 && denominator%i==0){
                gcd =i;
            }
        }
        numerator= numerator/gcd;
        denominator= denominator/gcd;
    }

    public void print(){
        System.out.println(numerator+"/"+denominator);
    }

    public void increment(){
        numerator=numerator+denominator;
        simplify();
    }

    public void add(Fraction f2){
        int n=(getNumerator()*f2.denominator) + (getDenominator()*f2.numerator);
        int d=(getDenominator()*f2.denominator);
        setNumerator(n);
        setDenominator(d);
        simplify();
    }

    public void addFraction(Fraction f2){
        this.numerator=this.numerator*f2.denominator + this.denominator*f2.numerator;
        this.denominator=this.denominator*f2.denominator;
        simplify();
    }

    public void subtract(Fraction f2){
        this.numerator=this.numerator*f2.denominator - this.denominator*f2.numerator;
        this.denominator=this.denominator*f2.denominator;
        simplify();
    }

    public void multiply(Fraction f2){
        this.numerator=this.numerator*f2.numerator;
        this.denominator=this.denominator*f2.denominator;
        simplify();
    }

    public static Fraction addNew(Fraction f1, Fraction f2){
        int n=f1.numerator*f2.denominator + f1.denominator*f2.numerator;
        int d=f1.denominator*f2.denominator;
        Fraction f3= new Fraction(n,d);
        return f3;
    }


    public void setNumerator(int num) {
        this.numerator = num;
        simplify();
    }
    public int getNumerator() {
        return numerator;
    }

    public void setDenominator(int num) {
        if(num==0){
            return; //throw error
        }
        this.denominator = num;
        simplify();
    }
    public int getDenominator() {
        return denominator;
    }

}
