package ThirdModuleHomeWork2;

public class Car implements Comparable<Car> {
    private int prise;
    private String name;
    public Car(int prise, String name) {this.prise = prise; this.name = name;}
    public Car(int prise) {this.prise = prise;}

    @Override
    public int compareTo(Car o) {
        return this.prise - o.prise;
    }

    public String toString(){
        String str = "" + this.prise;
        return str;
    }
}
