package ThirdModuleHomeWork1;

public class Sword<T extends Metal> {
    Sword(T m){
        this.material = m;
    }
T material;
public boolean testSword() {return this.material.getEndurance() > 49;}

}
