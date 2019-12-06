package Polymophism;

public class Dog extends Animal implements I2 {
    @Override
    public void sound() {
        System.out.println("Haw haw");
    }

    @Override
    public void getPict() {

    }

    public boolean isHunter(){
        return true;
    }
}
