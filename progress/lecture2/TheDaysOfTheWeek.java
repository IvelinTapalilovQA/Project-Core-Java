package progress.lecture2;

import java.util.Scanner;

public class TheDaysOfTheWeek {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String day = input.next();

        switch (day){
            case "Monday":
                System.out.println(day + " is the first day of the week!");
                break;
            case "Tuesday":
                System.out.println(day + " is the second day of the week!");
                break;
            case "Wednesday":
                System.out.println(day + " is the third day of the week!");
                break;
            case "Thursday":
                System.out.println(day + " is the fourth day of the week!");
                break;
            case "Friday":
                System.out.println(day + " is the fifth day of the week!");
                break;
            case "Saturday":
                System.out.println(day + " is the sixth day of the week!");
                break;
            case "Sunday":
                System.out.println(day + " is the seventh day of the week!");
                break;
            default:
                System.out.println("You are entering an invalid day of the week!");
        }
    }
}


