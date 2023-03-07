package com.company;

// Subclass for Formula 1 cars with advanced aerodynamics
public class AerodynamicFormula1Car extends TurbochargedFormula1Car {
    private int downforce;

    // Constructor
    public AerodynamicFormula1Car(String team, String driver, int topSpeed, int turboBoost, int downforce) {
        super(team, driver, topSpeed, turboBoost);
        this.downforce = downforce;
    }

    // Method to calculate top speed, taking into account turbo boost and downforce
    public int calculateTopSpeed() {
        return super.calculateTopSpeed() + downforce;
    }
}
