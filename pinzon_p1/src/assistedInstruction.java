import java.security.SecureRandom;
import java.util.Scanner;


public class assistedInstruction {

    private static float answer;
    private static int correctAnswers;
    private static int difficulty;
    private static float userAnswer;



    private static String getResponseIfCorrect() {
        SecureRandom rand = new SecureRandom();
        int num = rand.nextInt(4) + 1;
        String rightResponse = "";


        switch (num) {
            case 1:
                rightResponse = "Very good!";
                break;
            case 2:
                rightResponse = "Excellent!";
                break;
            case 3:
                rightResponse = "Nice work!";
                break;
            case 4:
                rightResponse = "Keep up the good work!";
                break;

        }
        return rightResponse;
    }


    private static String getResponseIfWrong() {
        SecureRandom rand = new SecureRandom();
        int num = rand.nextInt(4) + 1;
        String wrongResponse = "";

        switch (num) {
            case 1:
                wrongResponse = "No. Please try again.";
                break;
            case 2:
                wrongResponse = "Wrong. Try once more.";
                break;
            case 3:
                wrongResponse = "Don't give up!";
                break;
            case 4:
                wrongResponse = "No. Keep trying.";
                break;
        }

        return wrongResponse;
    }


    private static String gradeResponse() {
        String response = "";
        double grade = ( (double)correctAnswers / 10.0);

        if (grade <= .75) {
            response = "Please ask teacher for extra help.";
        }
        else if(grade >=.75) {
            response = "Congratulations, you are ready to go to the next level!";
        }


        return response;

    }




    private static String multiplication() {
        SecureRandom rand = new SecureRandom();
        int num1;
        int num2;
        String problem;

        if(difficulty == 1){
            num1 = rand.nextInt(10);
            num2 = rand.nextInt(10);
            answer = num1 * num2;
            problem = "How much is " + num1 + " times " + num2 + "?";
        }
        else if(difficulty == 2){
            num1 = rand.nextInt(90) + 10;
            num2 = rand.nextInt(90) + 10;
            answer = num1 * num2;
            problem = "How much is " + num1 + " times " + num2 + "?";
        }
        else if(difficulty == 3){
            num1 = rand.nextInt(900) + 100;
            num2 = rand.nextInt(900) + 100;
            answer = num1 * num2;
            problem = "How much is " + num1 + " times " + num2 + "?";
        }
        else if(difficulty == 4){
            num1 = rand.nextInt(9000) + 1000;
            num2 = rand.nextInt(9000) + 1000;
            answer = num1 * num2;
            problem = "How much is " + num1 + " times " + num2 + "?";
        }
        else{
            problem = "";
        }
        return problem;
    }

    private static String Addition(){
        SecureRandom rand = new SecureRandom();
        String addQuestion = "";
        int num1;
        int num2;

        if(difficulty == 1){
            num1 = rand.nextInt(10);
            num2 = rand.nextInt(10);
            answer = num1 + num2;
            addQuestion = "How much is " + num1 + " plus " + num2 + "?";
        }
        else if(difficulty == 2){
            num1 = rand.nextInt(90) + 10;
            num2 = rand.nextInt(90) + 10;
            answer = num1 + num2;
            addQuestion = "How much is " + num1 + " plus " + num2 + "?";
        }
        else if(difficulty == 3){
            num1 = rand.nextInt(900) + 100;
            num2 = rand.nextInt(900) + 100;
            answer = num1 + num2;
            addQuestion = "How much is " + num1 + " plus " + num2 + "?";
        }
        else if(difficulty == 4){
            num1 = rand.nextInt(9000) + 1000;
            num2 = rand.nextInt(9000) + 1000;
            answer = num1 + num2;
            addQuestion = "How much is " + num1 + " plus " + num2 +"?";
        }
        return addQuestion;
    }

    private static String Subtraction(){
        SecureRandom rand = new SecureRandom();
        String subQuestion = "";
        int num1;
        int num2;

        if(difficulty == 1){
            num1 = rand.nextInt(10);
            num2 = rand.nextInt(10);
            answer = num1 - num2;
            subQuestion = "How much is " + num1 + " minus " + num2 + "?";
        }
        else if(difficulty == 2){
            num1 = rand.nextInt(90) + 10;
            num2 = rand.nextInt(90) + 10;
            answer = num1 - num2;
            subQuestion = "How much is " + num1 + " minus " + num2 + "?";
        }
        else if(difficulty == 3){
            num1 = rand.nextInt(900) + 100;
            num2 = rand.nextInt(900) + 100;
            answer = num1 - num2;
            subQuestion = "How much is " + num1 + " minus " + num2 + "?";
        }
        else if(difficulty == 4){
            num1 = rand.nextInt(9000) + 1000;
            num2 = rand.nextInt(9000) + 1000;
            answer = num1 - num2;
            subQuestion = "How much is " + num1 + " minus " + num2 +"?";
        }
        return subQuestion;
    }

    private static String division(){
        SecureRandom rand = new SecureRandom();
        String divQuestion = "";
        float num1;
        float num2;

        switch(difficulty){
            case 1:
            num1 = rand.nextInt(10);
            num2 = rand.nextInt(9) + 1;
            answer = num1/num2;
            divQuestion = "How much is " + num1 + " divided by " + num2 + "?";
                if(Math.abs(answer - userAnswer) < 0.001){
                    getResponseIfCorrect();
                }
                else{
                    getResponseIfWrong();
                }
            break;

            case 2:
            num1 = rand.nextInt(90) + 10;
            num2 = rand.nextInt(90) + 10;
            answer = num1/num2;
            divQuestion = "How much is " + num1 + " divided by " + num2 + "?";
                if(Math.abs(answer - userAnswer) < 0.001){
                    getResponseIfCorrect();
                }
                else{
                    getResponseIfWrong();
                }
            break;

        case 3:
            num1 = rand.nextInt(900) + 100;
            num2 = rand.nextInt(900) + 100;
            answer = num1/num2;
            divQuestion = "How much is " + num1 + " divided by " + num2 + "?";
            if(Math.abs(answer - userAnswer) < 0.001){
                getResponseIfCorrect();
            }
            else{
                getResponseIfWrong();
            }
            break;

        case 4:
            num1 = rand.nextInt (9000) + 1000;
            num2 = rand.nextInt(9000) + 1000;
            answer = num1/num2;
            divQuestion = "How much is " + num1 + " divided by " + num2 +"?";
            if(Math.abs(answer - userAnswer) < 0.001){
                getResponseIfCorrect();
            }
            else{
                getResponseIfWrong();
            }
            break;
        }



        return divQuestion;
    }


    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();
        String question = "";
        boolean correct = true;
        int[] questionsAsked = new int[10];




        while (true) {
            correctAnswers = 0;
            int wrongAnswers = 0;

            System.out.println("Choose difficulty: ");
            difficulty = scnr.nextInt();
            System.out.println("Choose type of questions to answer: " +
                    "1(addition) 2(multiplication) 3(subtraction)" +
                    " 4(division) 5(random)");

           int problemType = scnr.nextInt();

            for (int i = 0; i < 10; i++) {
                questionsAsked[i]++;
                if(correct) {
                    switch (problemType) {
                        case 1:
                            question = Addition();
                            break;
                        case 2:
                            question = multiplication();
                            break;
                        case 3:
                            question = Subtraction();
                            break;
                        case 4:
                            question = division();
                            break;
                        case 5:
                            int choice = rand.nextInt(4) + 1;
                            if (choice == 1) {
                                question = Addition();
                            } else if (choice == 2) {
                                question = multiplication();
                            } else if (choice == 3) {
                                question = Subtraction();
                            } else if (choice == 4) {
                                question = division();
                            }
                            break;
                    }
                }

                    System.out.println(question);
                userAnswer = scnr.nextFloat();


                if (userAnswer == answer) {
                    correct = true;
                    System.out.println(getResponseIfCorrect());
                    correctAnswers++;


                }
                else if (userAnswer != answer){
                    correct = false;
                    System.out.println(getResponseIfWrong());
                    wrongAnswers++;
                }



            }
                System.out.println(gradeResponse());
                System.out.println("Number of correct responses: " + correctAnswers);
                System.out.println("Number of wrong responses: " + wrongAnswers);
            System.out.println("Do you want to take the quiz again? (y or n)");
            char option = scnr.next().charAt(0);

            if(option == 'y' && questionsAsked[9] != answer){
                questionsAsked[0] = 0;
            }

            else if(option == 'n'){
                break;
            }
        }
    }
}






















