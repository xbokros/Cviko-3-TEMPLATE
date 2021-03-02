package sk.stuba.fei.uim.oop;

public class Auto {
    private static final double FUEL_PER_KM = 0.2;

    private double kapacitaNadrze;
    private double stavNadrze;
    private boolean neojazdene;



    public Auto(double kapacitaNadrze){
        this.neojazdene = true;
        this.kapacitaNadrze = kapacitaNadrze;
    }

    public Auto(){
        this(100);
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

    public double dotankovat(){
        double diff = kapacitaNadrze - stavNadrze;
        this.stavNadrze = this.kapacitaNadrze;
        return diff;
    }

    public boolean isNeojazdene(){
        return neojazdene;
    }

    public String currentState(){
        String result = "";
        if(this.neojazdene){
            result = "Auto je nove";
            neojazdene = false;
        }else{
            result = "Auto je ojazdene";
        }
        result += "\n"+stavNadrze+"/"+kapacitaNadrze;
        return result;
    }
}
