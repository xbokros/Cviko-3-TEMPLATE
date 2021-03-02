package sk.stuba.fei.uim.oop;

public class Main {
    public static void main(String[] args) {
        Auto skoda = new Auto();

        skoda.stavNadrze = 100;
        skoda.drive(200);

        System.out.println(skoda.stavNadrze);



    }
}
