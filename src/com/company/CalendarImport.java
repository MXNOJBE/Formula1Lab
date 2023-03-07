package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CalendarImport {

    public static void main(String[] args) throws IOException
    {
        ArrayList<Calendar> calendars = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("src/com/company/dataFiles/season22_calendar.csv"));
        String currentLine;
        while ((currentLine = br.readLine())!=null)
        {

            String[] calendar_data = currentLine.split(",");
            String gpName = calendar_data[1];
            calendars.add(new Calendar(gpName));
        }
        System.out.println(calendars);
    }
}
