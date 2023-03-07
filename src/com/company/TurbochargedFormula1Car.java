package com.company;

// Subclass for Formula 1 cars with turbocharged engines
public class TurbochargedFormula1Car extends Formula1Car {
    private int turboBoost;

    // Constructor
    public TurbochargedFormula1Car(String team, String driver, int topSpeed, int turboBoost) {
        super(team, driver, topSpeed);
        this.turboBoost = turboBoost;
    }

    // Method to calculate top speed, taking into account turbo boost
    public int calculateTopSpeed() {
        return getTopSpeed() + turboBoost;
    }
}
