import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) throws URISyntaxException {
        File file = new File(Day3.class.getClassLoader().getResource("day3.txt").toURI());
        int priority = 0;
        //char duplicate = 0;
        char badge = 0;

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                String rucksackOne = sc.nextLine();
                String rucksackTwo = sc.nextLine();
                String rucksackThree = sc.nextLine();

                for (int i = 0; i < rucksackOne.length(); i++) {
                    for (int j = 0; j < rucksackTwo.length(); j++) {
                        for (int k = 0; k < rucksackThree.length(); k++) {
                            if (rucksackOne.charAt(i) == rucksackTwo.charAt(j) && rucksackTwo.charAt(j) == rucksackThree.charAt(k)) {
                                badge = rucksackOne.charAt(i);
                            }
                        }
                    }
                }


                System.out.println("The badge is " + badge);
                priority += calculatePriorityOfChar(badge);
                //System.out.println("Priority is now: " + priority);
            }
        } catch (FileNotFoundException fnf) {
            System.out.println("File not found");
        } catch (NoSuchElementException nse) {
            System.out.println("File read");
        }

        System.out.println("Total priority is " + priority);
    }

    public static int calculatePriorityOfChar(char c) {
        int priority = -1;
        int correspondingValue = c;

        if (Character.isUpperCase(c)) {
            priority = correspondingValue - 38;
        }
        if (Character.isLowerCase(c)) {
            priority = correspondingValue - 96;
        }

        return priority;
    }

}


