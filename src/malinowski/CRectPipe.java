package malinowski;

public class CRectPipe extends CRectangle{
    protected double A1;
    protected double B1;

    public double getA1() {
        return A1;
    }

    public void setA1(double a1) {
        A1 = a1;
    }

    public double getB1() {
        return B1;
    }

    public void setB1(double b1) {
        B1 = b1;
    }

    public CRectPipe() {
        super(10,8);
        A1 = 8;
        B1 = 6;
        this.name="prostokątna rura";
    }

    public CRectPipe(double a, double b, double a1, double b1) {
        super(a, b);
        A1 = a1;
        B1 = b1;
        this.name="prostokątna rura";
    }
    protected double calculate(){
        return (this.A*this.B*this.B*this.B-this.A*this.A*this.A*this.B)/12;
    }
    public static String info(){
        return "obiekt klasy CRecPipe";
    }
}
