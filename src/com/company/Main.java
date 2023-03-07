package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException
    {
        ArrayList<Driver> drivers = new ArrayList<>();
        ArrayList<Teams> teams = new ArrayList<>();
        ArrayList<Calendar> calendars = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("src/com/company/dataFiles/season22_drivers.csv"));
        String currentLine;
        while ((currentLine = br.readLine())!=null)
        {
            int count = 0;
            String[] driver_data = currentLine.split(",");
            String[] team_data = currentLine.split(",");

            String firstName = driver_data[0];
            String driverNum = driver_data[2];
            String driverTeamName = driver_data[3];
            drivers.add(new Driver(firstName,driverNum,driverTeamName));


        }
        System.out.println(drivers);


    }
    }


