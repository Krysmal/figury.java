package malinowski;

public abstract class CRectangle extends CFigure{
    protected double A;
    protected double B;

    public double getA() {
        return A;
    }

    public void setA(double a) {
        A = a;
    }

    public double getB() {
        return B;
    }

    public void setB(double b) {
        B = b;
    }
    public CRectangle() {
        A = 10;
        B = 8;
        this.name="prostokąt";
    }
    public CRectangle(double a, double b) {

        this.name="prostokąt";
        A = a;
        B = b;
    }


    @Override
    protected double calculate() {
        return A*B*B*B/12;
    }
    public static String info(){
        return "obiekt klasy CRectangle";
    }
}
