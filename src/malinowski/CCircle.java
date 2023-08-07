package malinowski;

public abstract class CCircle extends CFigure{
    protected double d;

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public CCircle() {
        this.d = 6.28;
        this.name = "koło";
    }
    public CCircle(double d) {
        this.d = d;
        this.name = "koło";
    }
    @Override
    protected double calculate() {
        return 3.14*d*d*d*d/64;
    }


    public static String info(){
        return "obiekt klasy CCircle";
    }




    @Override
    public String toString() {
        return "CCircle{" +
                "d=" + d +
                ", name='" + name + '\'' +
                '}';
    }
}
