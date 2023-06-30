package ThirdModuleHomeWork7;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Phone> phones = new ArrayList<>();                         //Создание списка телефонов разных производителей

        phones.add(new Phone("SAMSUNG","GALAXY_S23", 23000));
        phones.add(new Phone("SAMSUNG","GALAXY_S56", 56000));
        phones.add(new Phone("SAMSUNG","GALAXY_S12", 12000));
        phones.add(new Phone("SAMSUNG","GALAXY_A40", 40000));
        phones.add(new Phone("SAMSUNG","GALAXY_FOLD_Z", 64500));
        phones.add(new Phone("SAMSUNG","GALAXY_FOLD_Z_ULTRA", 74500));
        phones.add(new Phone("XIAOMI","REDMI_10", 11000));
        phones.add(new Phone("XIAOMI","REDMI_NOTE_5", 15000));
        phones.add(new Phone("XIAOMI","MI_16", 36000));
        phones.add(new Phone("XIAOMI","MI_16_ULTRA", 46000));

        List<String> modelsOfPhones = phones.stream()                   //Создание списка моделей одного производителя
                .filter(phone -> phone.brend.equals("SAMSUNG"))
                .map(phone -> phone.model)
                .toList();

        System.out.println();
        System.out.println(modelsOfPhones);                             //Вывод списка моделей одного производителя
        System.out.println();

        phones.stream()
                .sorted()
                .forEach(phone -> System.out.println(phone));           //Вывод цены и соответствующей модели по возрастанию
    }
}
