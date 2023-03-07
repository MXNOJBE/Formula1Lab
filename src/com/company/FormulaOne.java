package com.company;

public class FormulaOne {
    // Static variable
    private static int carCount = 0;

    // Static block
    static {
        System.out.println("Formula One season has started!");
    }

    // Static method
    public static void incrementCarCount() {
        carCount++;
    }

    // Static inner class
    static class Car {
        private String team;
        private String driver;

        public Car(String team, String driver) {
            this.team = team;
            this.driver = driver;
            incrementCarCount();
        }

        public void main(String a[]) {
            System.out.println("Team: " + team);
            System.out.println("Driver: " + driver);
        }
    }
}
