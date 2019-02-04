// In this assignment i need to make the java program calculate and print out the current time adjusted for timezone

import java.util.Scanner; //importing the scanner utility

public class CurrentTime {  //Defining the class
    public static void main(String[] args)    {

        Scanner input = new Scanner(System.in); //Activating the Scanner utillity

        System.out.print("Please enter, your current, timezone, ie. \" a number between -12 and +12: "); //prompting the user to read in the variable for the timezone
        long timezone = input.nextLong(); //The timezone value

        long totalSeconds = System.currentTimeMillis()/1000; //Calculating the time since 1970 in seconds
        long currentSecond = totalSeconds % 60; //Converting the seconds to current second

        long totalMinutes = totalSeconds / 60; //Converting the seconds to minutes
        long currentMinute = totalMinutes % 60; //Extracting the current minute

        long totalHours = totalMinutes / 60; //Converting the totalminutes to hours
        long currentHour = totalHours % 24 + timezone; //Extracting the current minute

        String postNotation = "x";

        if (currentHour >= 12)
            postNotation = " PM";
        else
            postNotation = " AM";

        if (currentHour >= 12)
            currentHour = currentHour - 12;


       System.out.println(
               "the time is: " + currentHour + ":" + currentMinute + ":" + currentSecond + postNotation
        ); // Printing out the result to screen

        // System.out.println(totalHours);
    }
}