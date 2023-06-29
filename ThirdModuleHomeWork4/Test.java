package ThirdModuleHomeWork4;



public class Test {
    public static void main(String[] args) {

        MyTreeSet<Car> carTree = new MyTreeSet<>();

        carTree.add(new Car(1000, "BWM"));          //добавление елементов в пустое дерево
        carTree.add(new Car(1500, "MERSEDES"));     //
        carTree.add(new Car(2000, "LADA"));         //
        carTree.add(new Car(500, "JEEP"));          //
        carTree.add(new Car(1250, "MUCLAREN"));     //

        System.out.println(carTree.size());                     //Вывод размера дерева и дерева
        carTree.printMyTreeSet();                               //




        System.out.println(carTree.contains(new Car(2000)));    //Проверкаа на содержание машины с определенной стоимостью
        System.out.println(carTree.contains(new Car(4000)));    //

        carTree.remove(new Car(1000));                          //Удаление корня
        System.out.println(carTree.size());                          //
        carTree.printMyTreeSet();                                    //

        carTree.remove(new Car(1500));                          //Удаление простого элемента
        System.out.println(carTree.size());                         //
        carTree.printMyTreeSet();                                   //

        carTree.remove(new Car(500));                           //Удаление целого дерева
        carTree.remove(new Car(2000));                          //
        carTree.remove(new Car(1250));                          //
        System.out.println(carTree.size());                         //
        carTree.printMyTreeSet();                                   //



    }
}
