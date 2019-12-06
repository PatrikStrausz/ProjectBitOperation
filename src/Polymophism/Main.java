package Polymophism;

public class Main {
    public static void main(String[] args) {

        I1 a1 = new Dog();
        a1.sound();

        Object a2 = new Horse();
        ((Horse) a2).sound();

    }
}
