/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Azedclone
 */
public class Main {

    public static void main(String[] args) {
        Display display = new Display();
        GetData getData = new GetData();
        CandidateManager candidateManager = new CandidateManager();

        //Loop until user choose exit program
        while (true) {
            //1. Display menu
            display.displayMenu();

            //2. Ask user to choose function
            int choice = getData.getInt("Please choose one option: ", 1, 5);

            //3. Perform function user have chose
            switch (choice) {
                case 1: //Create Experience
                    candidateManager.createExperience();
                    break;
                case 2: //Create Fresher
                    candidateManager.createFresher();
                    break;
                case 3: //Create Internship
                    candidateManager.createIntern();
                    break;
                case 4: //Search candidate
                    candidateManager.search();
                    break;
                case 5: //Exit program
                    System.exit(0);
            }
        }
    }
}
