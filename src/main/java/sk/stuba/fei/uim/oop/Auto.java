package sk.stuba.fei.uim.oop;

public class Auto {
    private static final double FUEL_PER_KM = 0.5;

    private double kapacitaNadrze;
    private double stavNadrze;
    private boolean neojazdene;

    public Auto(){
        neojazdene = true;
    }

    public void drive(double distanceInKm){
        stavNadrze -= distanceInKm * FUEL_PER_KM;

        if(stavNadrze < 0){
            stavNadrze = 0;
        }
    }

    public double getStavNadrze(){
        return stavNadrze;
    }

    public void setStavNadrze(double stavNadrze) {
        this.stavNadrze = stavNadrze;
    }

    public boolean isNeojazdene(){
        return neojazdene;
    }

    public String currentState(){
        String result = "";
        if(this.neojazdene){
            result = "Auto je nove\n";
        }else{
            result = "Auto je ojazdene\n";
        }
        result += "\n"+stavNadrze+"/"+kapacitaNadrze;
        return result;
    }
}
