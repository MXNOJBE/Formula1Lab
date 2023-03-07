package com.company;
public class Driver{
    public String firstName;
    public String driverNum;

    public String driverTeamName;
    public Driver(String firstName, String driverNum, String driverTeamName)
    {
        this.firstName = firstName;
        this.driverNum = driverNum;
        this.driverTeamName = driverTeamName;
    }
    public Driver(String driverNation, String driverTeamName)
    {

    }
    @Override
    public String toString()
    {
        return firstName + "  ||  " + driverNum;

    }


}

