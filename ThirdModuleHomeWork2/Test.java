package ThirdModuleHomeWork2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {

        MyLinkedList<Car> list = new MyLinkedList<>();

        Car car1 = new Car(1);              //
        Car car2 = new Car(2);              //
        Car car3 = new Car(2);              //
        Car car4 = new Car(4);              //
        Car car5 = new Car(5);              //
        Car car6 = new Car(6);              //Создание списка и добавление элементов
        list.add(car1);                           //
        list.add(car1);                           //
        list.add(car2);                             //
        list.add(car3);                             //
        list.add(car4);                             //
        list.printMyLinkedList();                   //
        System.out.println(list.getSize());         //

        list.add(car5, 4);                      //
        list.add(car6, 2);                      //
        list.printMyLinkedList();                     // Добавление элементов по индексу
        System.out.println(list.getSize());           //

        list.remove(4);                        // удаление элементов
        list.removeOne(car3);                      //
        list.removeAll(car1);                      //
        list.printMyLinkedList();                    //
        System.out.println(list.getSize());         //

        System.out.println(list.get(3));          //    Получение значения
















    }
}
