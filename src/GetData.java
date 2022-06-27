/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Azedclone
 */
public class GetData {

    Scanner sc = new Scanner(System.in);

    int getInt(String msg, int min, int max) {
        String input;
        int num;

        //Loop until user enter valid input
        while (true) {
            System.out.print(msg);
            input = sc.nextLine();

            try {
                num = Integer.parseInt(input);

                //Check input must in range (min, max)
                if (num >= min && num <= max) {
                    return num;
                } else {
                    System.out.println("Input must in range (" + min + ", " + max + ")");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input must be an integer");
            }
        }
    }

    String getString(String msg, String regex, String requirement) {
        String input;

        //Loop until user enter valid input
        while (true) {
            System.out.print(msg);
            input = sc.nextLine();

            if (input.isEmpty()) {
                System.out.println("Input could not be empty!");
            } else if (input.matches(regex) || regex.isEmpty()) {
                return input;
            } else {
                System.out.println(requirement);
            }
        }
    }

    String getEmail(String msg) {
        String input;

        //Loop until user enter valid input
        while (true) {
            System.out.print(msg);
            input = sc.nextLine();

            if (input.isEmpty()) {
                System.out.println("Input could not be empty!");
            } else if (input.matches("^[\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$")) {
                return input;
            } else {
                System.out.println("Email is not valid");
            }
        }
    }

    Date getDate(String msg) {
        String input;
        Date date;

        while (true) {
            System.out.print(msg);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            dateFormat.setLenient(false);
            input = sc.nextLine();

            if (input.isEmpty()) {
                System.out.println("Input could not be empty");
            } else {
                try {
                    date = dateFormat.parse(input);
                    if (date.before(new Date())) {
                        return date;
                    } else {
                        System.out.println("Date must before this year!");
                    }
                } catch (ParseException e) {
                    System.out.println("Date is not valid!");
                }
            }
        }
    }

    String getRank(String msg) {
        String input;

        while (true) {
            System.out.print(msg);
            input = sc.nextLine();

            if (input.isEmpty()) {
                System.out.println("Input could not be empty");
            } else {
                if (!(input.matches("Excellence") || input.matches("Good") || input.matches("Fair") || input.matches("Poor"))) {
                    System.out.println("Rank must be one of four type: Excellence, Good, Fair, Poor");
                } else {
                    return input;
                }
            }
        }
    }

}
