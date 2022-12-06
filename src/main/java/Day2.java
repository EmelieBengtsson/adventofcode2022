import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Day2 {
    public static void main(String... args) throws URISyntaxException {
        String filename = "day2.txt";
        File file = new File(Day2.class.getClassLoader().getResource("day2.txt").toURI());
        int score = 0;
        int opponentChoiceInt = -1;
        int myChoiceInt = -1;

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                String opponentsChoice = sc.next();
                if (opponentsChoice.equalsIgnoreCase("A")) {
                    opponentChoiceInt = 0;
                } else if (opponentsChoice.equalsIgnoreCase("B")) {
                    opponentChoiceInt = 2;
                } else if (opponentsChoice.equalsIgnoreCase("C")) {
                    opponentChoiceInt = 1;
                }

                String myChoice = sc.next();
                if (myChoice.equalsIgnoreCase("X")) {
                    myChoiceInt = 0;
                } else if (myChoice.equalsIgnoreCase("Y")) {
                    myChoiceInt = 2;
                } else if (myChoice.equalsIgnoreCase("Z")) {
                    myChoiceInt = 1;
                }

                //System.out.println("mychoice is " + myChoiceInt + " opponentschoice is " + opponentChoiceInt);
                if (myChoice.equalsIgnoreCase("X")) {
                    score += 0;
                } else if (myChoice.equalsIgnoreCase("Y")) {
                    score += 3;
                } else if (myChoice.equalsIgnoreCase("Z")) {
                    score += 6;
                }

                //score += determineRoundOutcome(myChoiceInt, opponentChoiceInt);

                System.out.println("Score för utkomst är " + score);

                if (opponentsChoice.equalsIgnoreCase("A")) {
                    if (myChoice.equalsIgnoreCase("X")) {
                        score += 3;
                    }
                    if (myChoice.equalsIgnoreCase("Y")) {
                        score += 1;
                    }
                    if (myChoice.equalsIgnoreCase("Z")) {
                        score += 2;
                    }
                }
                if (opponentsChoice.equalsIgnoreCase("B")) {
                    if (myChoice.equalsIgnoreCase("X")) {
                        score += 1;
                    }
                    if (myChoice.equalsIgnoreCase("Y")) {
                        score += 2;
                    }
                    if (myChoice.equalsIgnoreCase("Z")) {
                        score += 3;
                    }
                }
                if (opponentsChoice.equalsIgnoreCase("C")) {
                    if (myChoice.equalsIgnoreCase("X")) {
                        score += 2;
                    }
                    if (myChoice.equalsIgnoreCase("Y")) {
                        score += 3;
                    }
                    if (myChoice.equalsIgnoreCase("Z")) {
                        score += 1;
                    }
                }
            }
            /** if (myChoice.equalsIgnoreCase("X")) {
             score += 1;
             }
             if (myChoice.equalsIgnoreCase("Y")) {
             score += 2;
             }
             if (myChoice.equalsIgnoreCase("Z")) {
             score += 3;
             }
             **/
            System.out.println("Totalscore är " + score);
        } catch (
                FileNotFoundException fnf) {
            System.out.println("Hittar inte filen.");
        } catch (
                NoSuchElementException nse) {
            System.out.println("File read.");
        }

        System.out.println("The total score is " + score);


    }
/**
 * static int determineRoundOutcome(int userChoice, int opponentsChoice) {
 * int outcome;
 * //draw
 * if (userChoice == opponentsChoice) {
 * outcome = 3;
 * }
 * //user won
 * <p>
 * else if ((userChoice + 1) % 3 == opponentsChoice) {
 * outcome = 6;
 * }
 * //computer won
 * else {
 * outcome = 0;
 * }
 * return outcome;
 * }
 */
}
