import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please type 'a', 'b', 'c' or 'd' for your answer");

        System.out.println("\n 1. Which country held the 2016 Summer Olympics?");
        System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy\n");
        System.out.println("\t ...Please type 'a', 'b', 'c' or 'd' for your answer");
        String answer1 = scan.nextLine();
        //store answer 1

        System.out.println("\n2. Which planet is the hottest?");
        System.out.println("\ta) Venus\n\tb) Saturn\n\tc) Mercury\n\td) Mars\n");
        System.out.println("\t ...Please type 'a', 'b', 'c' or 'd' for your answer");
        String answer2 = scan.nextLine();
        //store answer 2

        System.out.println("\n3. What is the rarest blood type?");
        System.out.println("\ta) O\n\tb) A\n\tc) B\n\td) AB-Negative\n");
        System.out.println("\t ...Please type 'a', 'b', 'c' or 'd' for your answer");
        String answer3 = scan.nextLine();
        //store answer 3

        System.out.println("\n4. Which one of these characters is friends with Harry Potter?");
        System.out.println("\ta) Ron Weasley\n\tb) Hermione Granger\n\tc) Draco Malfoy\n");
        System.out.println("\t ...Please type 'a', 'b', 'c' or 'd' for your answer");
        String answer4 = scan.nextLine();
        //store answer 4

        int score = 0;
        //Task 2: Check each answer - For each correct answer, add 5 points to the score. 
        if (answer1.equals("a")) {
            score +=5;
        } else {
            score +=0;
        }
        if (answer2.equals("b")){
            score +=5;
        } else {
            score +=0;
        }
        if (answer3.equals("c")){
            score+=5;
        } else {
            score +=0;
        }
        if (answer4.equals("d")){
            score +=5;
        } else {
            score +=0;
        }
        
        System.out.println("Your final score is: " + score + "/20");

        //Task 3: print a message depending on the score
        if (score >= 15) {
            System.out.print("Wow, you know your"); // if the score is 15 or higher
        } else if (score > 5 && score < 15 ){
            System.out.print("Not bad");
        } else {
            System.out.println("Best luck next time");
        } 

        scan.close();

    }
}