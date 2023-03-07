package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TeamImport {
    public static void main(String[] args) throws IOException
    {

        ArrayList<Teams> teams = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("src/com/company/dataFiles/season22_teams.csv"));
        String currentLine;
        while ((currentLine = br.readLine())!=null)
        {
            String[] team_data = currentLine.split(",");
            String teamName = team_data[1];
            String teamBase = team_data[2];
            teams.add(new Teams(teamName, teamBase));
        }
        System.out.println(teams);
    }
}