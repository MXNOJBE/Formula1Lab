package com.company;

public class Times {
    private String track_name;
    private String fastest_lap;
    private String driver_name;
    private int year;

    public Times(String track_name, String fastest_lap, String driver_name, int year) {
        this.fastest_lap = fastest_lap;
        this.track_name = track_name;
        this.driver_name = driver_name;
        this.year = year;
    }

    public static void main(String[] args) {
        for(int i=0;i<4;i++)
        {
            System.out.println("The best time at "+""+ args[0]+" " + "is " + args[1] + " set by " +args[2]+" in the year and season of " + args[3]);
            return;
        }

    }
}