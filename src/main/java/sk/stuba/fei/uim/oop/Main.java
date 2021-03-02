package sk.stuba.fei.uim.oop;

public class Main {
    public static void main(String[] args) {
        Auto skoda = new Auto();
        Auto bmw = new Auto();

        skoda.one = 1;
        bmw.one = 2;

        if(skoda.one == bmw.one){
            System.out.println("Rovnake");
        }else{
            System.out.println("Rozne");
        }
    }
}
