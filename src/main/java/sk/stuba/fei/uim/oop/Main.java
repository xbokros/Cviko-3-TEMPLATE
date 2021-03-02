package sk.stuba.fei.uim.oop;

public class Main {
    public static void main(String[] args) {
        Auto skoda = new Auto();
        Auto bmw = new Auto();

        if(skoda == bmw){
            System.out.println("Rovnake");
        }else{
            System.out.println("Rozne");
        }

    }
}
