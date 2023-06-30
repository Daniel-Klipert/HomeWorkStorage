package ThirdModuleHomeWork8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {

    public static void printStudentInfo(Student student) {

       String name = student.getName();
       student.getAddress().ifPresentOrElse(address -> System.out.println(name + " " + address.getCity() + " " + address.getRegion()),
               () -> System.out.println(name));
    }

    public static void main(String[] args) {

        Student miha = new Student("Миша");
        Student vovka = new Student("Володя", Optional.ofNullable(new Address("Moscow", "MoscowCity")));

        printStudentInfo(miha);
        printStudentInfo(vovka);

        List<String> listOfWords = new ArrayList<>();

        listOfWords.add("Thank ");
        listOfWords.add("you ");
        listOfWords.add("for ");
        listOfWords.add("working ");
        listOfWords.add("for ");
        listOfWords.add("our ");
        listOfWords.add("benefit ");
        listOfWords.add("very ");
        listOfWords.add("much!");

        for (int i = 0; i < listOfWords.size(); i++) {System.out.println(listOfWords.get(i));}
        Stream<String> stream = listOfWords.stream();
        System.out.println(stream.reduce((x, y ) -> x + y ).get());
    }
}
