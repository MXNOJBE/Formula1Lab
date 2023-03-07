package com.company;

import java.util.Scanner;

public class Formula1Driver {
    private String name;
    private int age;
    private StringBuffer team;

    public Formula1Driver(String name, int age, String team) {
        this.name = name;
        this.age = age;
        this.team = new StringBuffer(team);
    }

    // Method to get the driver's name
    public String getName() {
        return name;
    }

    // Method to get the driver's age
    public int getAge() {
        return age;
    }

    // Method to get the driver's team
    public String getTeam() {
        return team.toString();
    }

    // Method to set the driver's team
    public void setTeam(String team) {
        this.team.setLength(0);  // Clear the StringBuffer
        this.team.append(team);
    }

    // Method to print the driver's details
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Team: " + team);
    }

    public static void main(String[] args) {
        // Creating a driver object
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the driver Name: ");
        String driverName = inp.nextLine();
        System.out.println("Enter the driver Team: ");
        String driverTeam = inp.nextLine();
        System.out.println("Enter the driver Age: ");
        int driverAge = inp.nextInt();
        Formula1Driver driver = new Formula1Driver(driverName,driverAge,driverTeam);

        // Using String methods
        System.out.println("Length of the driver name is:"+driver.getName().length());  // Length of the driver's name
        System.out.println("Upper case of the driver name is: " +driver.getName().toUpperCase());  // Uppercase version of the driver's name
        System.out.println(driver.getTeam().equals("Mercedes"));  // Check if the driver's team is Mercedes
        System.out.println(driver.getTeam().startsWith("Merc"));  // Check if the driver's team starts with Merc
        System.out.println(driver.getName().replace("Replacing the first Name of Lewis"+"Lewis", "Max"));  // Replace the driver's first name

        // Using StringBuffer methods
        driver.setTeam("Red Bull Racing");  // Set the driver's team to Red Bull Racing
        driver.printDetails();  // Print the driver's details with the updated team
    }
}

