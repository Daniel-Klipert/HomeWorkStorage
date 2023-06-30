package ThirdModuleHomeWork1;

public class Test {
    public static void main(String[] args) {
        Plastic plastic = new Plastic();
        Steel steel = new Steel();
        //Не получится создать меч из пластика
        Sword<Steel> sword2 = new Sword<>(steel);           //А вот из стали - без проблем!
        boolean isSword = sword2.testSword();
        System.out.println(isSword);
    }
}
