package ThirdModuleHomeWork7;

public class Phone implements Comparable<Phone> {

    String brend, model;
    int prise;

    public Phone(String brend, String model, int prise) {
        this.brend = brend;
        this.model = model;
        this.prise = prise;
    }

    @Override
    public int compareTo(Phone o) {
        return this.prise - o.prise;
    }

    public String toString() {
        return "Price: " + this.prise + " | Model: " + this.model;
    }

}



