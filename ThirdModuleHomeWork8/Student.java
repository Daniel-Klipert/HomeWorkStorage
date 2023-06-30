package ThirdModuleHomeWork8;

import java.util.Optional;

public class Student {

    private String name;
    private Optional<Address> address;

    public Student(String name, Optional<Address> address) {
        this.name = name;
        this.address = address;
    }

    public Student(String name) {
        this.name = name;
        this.address = Optional.empty();
    }

    public Optional<Address> getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }
}
