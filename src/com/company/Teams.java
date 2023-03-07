package com.company;
public class Teams{
    private String teamName;
    private String teamBase;

    public Teams(String teamName)
    {
        this.teamName = teamName;

    }
    public Teams(String teamName, String teamBase)
    {
        this.teamName = teamName;
        this.teamBase = teamBase;
    }

    @Override
    public String toString()
    {
        return teamName +"||"+teamBase;

    }

}