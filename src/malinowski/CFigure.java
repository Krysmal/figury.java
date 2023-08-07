package malinowski;

public abstract class CFigure {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    protected abstract double calculate();
    public static String info(){
        return "obiekt klasy CFigure";
    }
}
