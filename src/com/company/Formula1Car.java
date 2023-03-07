package com.company;

// Superclass for all Formula 1 cars
public class Formula1Car {
    private String team;
    private String driver;
    private int topSpeed;

    // Constructor
    public Formula1Car(String team, String driver, int topSpeed) {
        this.team = team;
        this.driver = driver;
        this.topSpeed = topSpeed;
    }

    // Getters and setters for class fields
    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }
}

// Subclass for Formula 1 cars with advanced suspension systems
class SuspensionFormula1Car extends AerodynamicFormula1Car {
    private int suspensionAdjustment;

    // Constructor
    public SuspensionFormula1Car(String team, String driver, int topSpeed, int turboBoost, int downforce, int suspensionAdjustment) {
        super(team, driver, topSpeed, turboBoost, downforce);
        this.suspensionAdjustment = suspensionAdjustment;
    }

    // Method to calculate top speed, taking into account turbo boost, downforce, and suspension adjustment
    public int calculateTopSpeed() {
        return super.calculateTopSpeed() + suspensionAdjustment;
    }
}
