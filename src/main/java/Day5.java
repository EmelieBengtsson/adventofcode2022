import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Day5 {
    public static void main(String[] args) throws URISyntaxException {
        File file = new File(Day5.class.getClassLoader().getResource("day5.txt").toURI());

        ArrayList<String> stackOne = new ArrayList<String>(
                Arrays.asList("D", "M", "S", "Z", "R", "F", "W", "N"));
        ArrayList<String> stackTwo = new ArrayList<String>(
                Arrays.asList("W", "P", "Q", "G", "S"));
        ArrayList<String> stackThree = new ArrayList<String>(
                Arrays.asList("W", "R", "V", "Q", "F", "N", "J", "C"));
        ArrayList<String> stackFour = new ArrayList<String>(
                Arrays.asList("F", "Z", "P", "C", "G", "D", "L"));
        ArrayList<String> stackFive = new ArrayList<String>(
                Arrays.asList("T", "P", "S"));
        ArrayList<String> stackSix = new ArrayList<String>(
                Arrays.asList("H", "D", "F", "W", "R", "L"));
        ArrayList<String> stackSeven = new ArrayList<String>(
                Arrays.asList("Z", "N", "D", "C"));
        ArrayList<String> stackEight = new ArrayList<String>(
                Arrays.asList("W", "N", "R", "F", "V", "S", "J", "Q"));
        ArrayList<String> stackNine = new ArrayList<String>(
                Arrays.asList("R", "M", "S", "G", "Z", "W", "V"));

        String trash = "";
        int crates = 0;
        int moveFrom = 0;
        int moveTo = 0;


        try (Scanner sc = new Scanner(file)) {
            //Släng bort första pusseldelarna
            for (int i = 0; i < 10; i++) {
                trash = sc.nextLine();
            }
            while (sc.hasNextLine()) {
                trash = sc.next();
                crates = sc.nextInt();
                trash = sc.next();
                moveFrom = sc.nextInt();
                trash = sc.next();
                moveTo = sc.nextInt();

                if (moveTo == 1) {
                    if (moveFrom == 2) {
                        for (int i = 0; i < crates; i++) {
                            stackOne.add(stackTwo.get(stackTwo.size() - 1));
                            stackTwo.remove(stackTwo.size() - 1);
                        }
                    }

                    if (moveFrom == 3) {
                        for (int i = 0; i < crates; i++) {
                            stackOne.add(stackThree.get(stackThree.size() - 1));
                            stackThree.remove(stackThree.size() - 1);
                        }
                    }
                    if (moveFrom == 4) {
                        for (int i = 0; i < crates; i++) {
                            stackOne.add(stackFour.get(stackFour.size() - 1));
                            stackFour.remove(stackFour.size() - 1);
                        }
                    }
                    if (moveFrom == 5) {
                        for (int i = 0; i < crates; i++) {
                            stackOne.add(stackFive.get(stackFive.size() - 1));
                            stackFive.remove(stackFive.size() - 1);
                        }
                    }
                    if (moveFrom == 6) {
                        for (int i = 0; i < crates; i++) {
                            stackOne.add(stackSix.get(stackSix.size() - 1));
                            stackSix.remove(stackSix.size() - 1);
                        }
                    }
                    if (moveFrom == 7) {
                        for (int i = 0; i < crates; i++) {
                            stackOne.add(stackSeven.get(stackSeven.size() - 1));
                            stackSeven.remove(stackSeven.size() - 1);
                        }
                    }
                    if (moveFrom == 8) {
                        for (int i = 0; i < crates; i++) {
                            stackOne.add(stackEight.get(stackEight.size() - 1));
                            stackEight.remove(stackEight.size() - 1);
                        }
                    }
                    if (moveFrom == 9) {
                        for (int i = 0; i < crates; i++) {
                            stackOne.add(stackNine.get(stackNine.size() - 1));
                            stackNine.remove(stackNine.size() - 1);
                        }
                    }
                } else if (moveTo == 2) {
                    if (moveFrom == 1) {
                        for (int i = 0; i < crates; i++) {
                            stackTwo.add(stackOne.get(stackOne.size() - 1));
                            stackOne.remove(stackOne.size() - 1);
                        }
                    }

                    if (moveFrom == 3) {
                        for (int i = 0; i < crates; i++) {
                            stackTwo.add(stackThree.get(stackThree.size() - 1));
                            stackThree.remove(stackThree.size() - 1);
                        }
                    }

                    if (moveFrom == 4) {
                        for (int i = 0; i < crates; i++) {
                            stackTwo.add(stackFour.get(stackFour.size() - 1));
                            stackFour.remove(stackFour.size() - 1);
                        }
                    }
                    if (moveFrom == 5) {
                        for (int i = 0; i < crates; i++) {
                            stackTwo.add(stackFive.get(stackFive.size() - 1));
                            stackFive.remove(stackFive.size() - 1);
                        }
                    }
                    if (moveFrom == 6) {
                        for (int i = 0; i < crates; i++) {
                            stackTwo.add(stackSix.get(stackSix.size() - 1));
                            stackSix.remove(stackSix.size() - 1);
                        }
                    }
                    if (moveFrom == 7) {
                        for (int i = 0; i < crates; i++) {
                            stackTwo.add(stackSeven.get(stackSeven.size() - 1));
                            stackSeven.remove(stackSeven.size() - 1);
                        }
                    }
                    if (moveFrom == 8) {
                        for (int i = 0; i < crates; i++) {
                            stackTwo.add(stackEight.get(stackEight.size() - 1));
                            stackEight.remove(stackEight.size() - 1);
                        }
                    }
                    if (moveFrom == 9) {
                        for (int i = 0; i < crates; i++) {
                            stackTwo.add(stackNine.get(stackNine.size() - 1));
                            stackNine.remove(stackNine.size() - 1);
                        }
                    }
                } else if (moveTo == 3) {
                    if (moveFrom == 1) {
                        for (int i = 0; i < crates; i++) {
                            stackThree.add(stackOne.get(stackOne.size() - 1));
                            stackOne.remove(stackOne.size() - 1);
                        }
                    }

                    if (moveFrom == 2) {
                        for (int i = 0; i < crates; i++) {
                            stackThree.add(stackTwo.get(stackTwo.size() - 1));
                            stackTwo.remove(stackTwo.size()-1);
                        }
                    }

                    if (moveFrom == 4) {
                        for (int i = 0; i < crates; i++) {
                            stackThree.add(stackFour.get(stackFour.size() - 1));
                            stackFour.remove(stackFour.size() - 1);
                        }
                    }
                    if (moveFrom == 5) {
                        for (int i = 0; i < crates; i++) {
                            stackThree.add(stackFive.get(stackFive.size() - 1));
                            stackFive.remove(stackFive.size() - 1);
                        }
                    }
                    if (moveFrom == 6) {
                        for (int i = 0; i < crates; i++) {
                            stackThree.add(stackSix.get(stackSix.size() - 1));
                            stackSix.remove(stackSix.size() - 1);
                        }
                    }
                    if (moveFrom == 7) {
                        for (int i = 0; i < crates; i++) {
                            stackThree.add(stackSeven.get(stackSeven.size() - 1));
                            stackSeven.remove(stackSeven.size() - 1);
                        }
                    }
                    if (moveFrom == 8) {
                        for (int i = 0; i < crates; i++) {
                            stackThree.add(stackEight.get(stackEight.size() - 1));
                            stackEight.remove(stackEight.size() - 1);
                        }
                    }
                    if (moveFrom == 9) {
                        for (int i = 0; i < crates; i++) {
                            stackThree.add(stackNine.get(stackNine.size() - 1));
                            stackNine.remove(stackNine.size() - 1);
                        }
                    }
                } else if (moveTo == 4) {
                    if (moveFrom == 1) {
                        for (int i = 0; i < crates; i++) {
                            stackFour.add(stackOne.get(stackOne.size() - 1));
                            stackOne.remove(stackOne.size() - 1);
                        }
                    }

                    if (moveFrom == 2) {
                        for (int i = 0; i < crates; i++) {
                            stackFour.add(stackTwo.get(stackTwo.size() - 1));
                            stackTwo.remove(stackTwo.size() - 1);
                        }
                    }

                    if (moveFrom == 3) {
                        for (int i = 0; i < crates; i++) {
                            stackFour.add(stackThree.get(stackThree.size() - 1));
                            stackThree.remove(stackThree.size() - 1);
                        }
                    }

                    if (moveFrom == 5) {
                        for (int i = 0; i < crates; i++) {
                            stackFour.add(stackFive.get(stackFive.size() - 1));
                            stackFive.remove(stackFive.size() - 1);
                        }
                    }
                    if (moveFrom == 6) {
                        for (int i = 0; i < crates; i++) {
                            stackFour.add(stackSix.get(stackSix.size() - 1));
                            stackSix.remove(stackSix.size() - 1);
                        }
                    }
                    if (moveFrom == 7) {
                        for (int i = 0; i < crates; i++) {
                            stackFour.add(stackSeven.get(stackSeven.size() - 1));
                            stackSeven.remove(stackSeven.size() - 1);
                        }
                    }
                    if (moveFrom == 8) {
                        for (int i = 0; i < crates; i++) {
                            stackFour.add(stackEight.get(stackEight.size() - 1));
                            stackEight.remove(stackEight.size() - 1);
                        }
                    }
                    if (moveFrom == 9) {
                        for (int i = 0; i < crates; i++) {
                            stackFour.add(stackNine.get(stackNine.size() - 1));
                            stackNine.remove(stackNine.size() - 1);
                        }
                    }
                } else if (moveTo == 5) {
                    if (moveFrom == 1) {
                        for (int i = 0; i < crates; i++) {
                            stackFive.add(stackOne.get(stackOne.size() - 1));
                            stackOne.remove(stackOne.size() - 1);
                        }
                    }

                    if (moveFrom == 2) {
                        for (int i = 0; i < crates; i++) {
                            stackFive.add(stackTwo.get(stackTwo.size() - 1));
                            stackTwo.remove(stackTwo.size() - 1);
                        }
                    }

                    if (moveFrom == 3) {
                        for (int i = 0; i < crates; i++) {
                            stackFive.add(stackThree.get(stackThree.size() - 1));
                            stackThree.remove(stackThree.size() - 1);
                        }
                    }

                    if (moveFrom == 4) {
                        for (int i = 0; i < crates; i++) {
                            stackFive.add(stackFour.get(stackFour.size() - 1));
                            stackFour.remove(stackFour.size() - 1);
                        }
                    }
                    if (moveFrom == 6) {
                        for (int i = 0; i < crates; i++) {
                            stackFive.add(stackSix.get(stackSix.size() - 1));
                            stackSix.remove(stackSix.size() - 1);
                        }
                    }
                    if (moveFrom == 7) {
                        for (int i = 0; i < crates; i++) {
                            stackFive.add(stackSeven.get(stackSeven.size() - 1));
                            stackSeven.remove(stackSeven.size() - 1);
                        }
                    }
                    if (moveFrom == 8) {
                        for (int i = 0; i < crates; i++) {
                            stackFive.add(stackEight.get(stackEight.size() - 1));
                            stackEight.remove(stackEight.size() - 1);
                        }
                    }
                    if (moveFrom == 9) {
                        for (int i = 0; i < crates; i++) {
                            stackFive.add(stackNine.get(stackNine.size() - 1));
                            stackNine.remove(stackNine.size() - 1);
                        }
                    }
                } else if (moveTo == 6) {
                    if (moveFrom == 1) {
                        for (int i = 0; i < crates; i++) {
                            stackSix.add(stackOne.get(stackOne.size() - 1));
                            stackOne.remove(stackOne.size() - 1);
                        }
                    }

                    if (moveFrom == 2) {
                        for (int i = 0; i < crates; i++) {
                            stackSix.add(stackTwo.get(stackTwo.size() - 1));
                            stackTwo.remove(stackTwo.size() - 1);
                        }
                    }

                    if (moveFrom == 3) {
                        for (int i = 0; i < crates; i++) {
                            stackSix.add(stackThree.get(stackThree.size() - 1));
                            stackThree.remove(stackThree.size() - 1);
                        }
                    }
                    if (moveFrom == 4) {
                        for (int i = 0; i < crates; i++) {
                            stackSix.add(stackFour.get(stackFour.size() - 1));
                            stackFour.remove(stackFour.size() - 1);
                        }
                    }

                    if (moveFrom == 5) {
                        for (int i = 0; i < crates; i++) {
                            stackSix.add(stackFive.get(stackFive.size() - 1));
                            stackFive.remove(stackFive.size() - 1);
                        }
                    }

                    if (moveFrom == 7) {
                        for (int i = 0; i < crates; i++) {
                            stackSix.add(stackSeven.get(stackSeven.size() - 1));
                            stackSeven.remove(stackSeven.size() - 1);
                        }
                    }
                    if (moveFrom == 8) {
                        for (int i = 0; i < crates; i++) {
                            stackSix.add(stackEight.get(stackEight.size() - 1));
                            stackEight.remove(stackEight.size() - 1);
                        }
                    }
                    if (moveFrom == 9) {
                        for (int i = 0; i < crates; i++) {
                            stackSix.add(stackNine.get(stackNine.size() - 1));
                            stackNine.remove(stackNine.size() - 1);
                        }
                    }
                } else if (moveTo == 7) {
                    if (moveFrom == 1) {
                        for (int i = 0; i < crates; i++) {
                            stackSeven.add(stackOne.get(stackOne.size() - 1));
                            stackOne.remove(stackOne.size() - 1);
                        }
                    }

                    if (moveFrom == 2) {
                        for (int i = 0; i < crates; i++) {
                            stackSeven.add(stackTwo.get(stackTwo.size() - 1));
                            stackTwo.remove(stackTwo.size() - 1);
                        }
                    }

                    if (moveFrom == 3) {
                        for (int i = 0; i < crates; i++) {
                            stackSeven.add(stackThree.get(stackThree.size() - 1));
                            stackThree.remove(stackThree.size() - 1);
                        }
                    }
                    if (moveFrom == 4) {
                        for (int i = 0; i < crates; i++) {
                            stackSeven.add(stackFour.get(stackFour.size() - 1));
                            stackFour.remove(stackFour.size() - 1);
                        }
                    }

                    if (moveFrom == 5) {
                        for (int i = 0; i < crates; i++) {
                            stackSeven.add(stackFive.get(stackFive.size() - 1));
                            stackFive.remove(stackFive.size() - 1);
                        }
                    }

                    if (moveFrom == 6) {
                        for (int i = 0; i < crates; i++) {
                            stackSeven.add(stackSix.get(stackSix.size() - 1));
                            stackSix.remove(stackSix.size() - 1);
                        }
                    }
                    if (moveFrom == 8) {
                        for (int i = 0; i < crates; i++) {
                            stackSeven.add(stackEight.get(stackEight.size() - 1));
                            stackEight.remove(stackEight.size() - 1);
                        }
                    }
                    if (moveFrom == 9) {
                        for (int i = 0; i < crates; i++) {
                            stackSeven.add(stackNine.get(stackNine.size() - 1));
                            stackNine.remove(stackNine.size() - 1);
                        }
                    }
                } else if (moveTo == 8) {
                    if (moveFrom == 1) {
                        for (int i = 0; i < crates; i++) {
                            stackEight.add(stackOne.get(stackOne.size() - 1));
                            stackOne.remove(stackOne.size() - 1);
                        }
                    }

                    if (moveFrom == 2) {
                        for (int i = 0; i < crates; i++) {
                            stackEight.add(stackTwo.get(stackTwo.size() - 1));
                            stackTwo.remove(stackTwo.size() - 1);
                        }
                    }

                    if (moveFrom == 3) {
                        for (int i = 0; i < crates; i++) {
                            stackEight.add(stackThree.get(stackThree.size() - 1));
                            stackThree.remove(stackThree.size() - 1);
                        }
                    }
                    if (moveFrom == 4) {
                        for (int i = 0; i < crates; i++) {
                            stackEight.add(stackFour.get(stackFour.size() - 1));
                            stackFour.remove(stackFour.size() - 1);
                        }
                    }

                    if (moveFrom == 5) {
                        for (int i = 0; i < crates; i++) {
                            stackEight.add(stackFive.get(stackFive.size() - 1));
                            stackFive.remove(stackFive.size() - 1);
                        }
                    }
                    if (moveFrom == 6) {
                        for (int i = 0; i < crates; i++) {
                            stackEight.add(stackSix.get(stackSix.size() - 1));
                            stackSix.remove(stackSix.size() - 1);
                        }
                    }
                    if (moveFrom == 7) {
                        for (int i = 0; i < crates; i++) {
                            stackEight.add(stackSeven.get(stackSeven.size() - 1));
                            stackSeven.remove(stackSeven.size() - 1);
                        }
                    }

                    if (moveFrom == 9) {
                        for (int i = 0; i < crates; i++) {
                            stackEight.add(stackNine.get(stackNine.size() - 1));
                            stackNine.remove(stackNine.size() - 1);
                        }
                    }
                } else if (moveTo == 9) {
                    if (moveFrom == 1) {
                        for (int i = 0; i < crates; i++) {
                            stackNine.add(stackOne.get(stackOne.size() - 1));
                            stackOne.remove(stackOne.size() - 1);
                        }
                    }

                    if (moveFrom == 2) {
                        for (int i = 0; i < crates; i++) {
                            stackNine.add(stackTwo.get(stackTwo.size() - 1));
                            stackTwo.remove(stackTwo.size() - 1);
                        }
                    }

                    if (moveFrom == 3) {
                        for (int i = 0; i < crates; i++) {
                            stackNine.add(stackThree.get(stackThree.size() - 1));
                            stackThree.remove(stackThree.size() - 1);
                        }
                    }
                    if (moveFrom == 4) {
                        for (int i = 0; i < crates; i++) {
                            stackNine.add(stackFour.get(stackFour.size() - 1));
                            stackFour.remove(stackFour.size() - 1);
                        }
                    }

                    if (moveFrom == 5) {
                        for (int i = 0; i < crates; i++) {
                            stackNine.add(stackFive.get(stackFive.size() - 1));
                            stackFive.remove(stackFive.size() - 1);
                        }
                    }
                    if (moveFrom == 6) {
                        for (int i = 0; i < crates; i++) {
                            stackNine.add(stackSix.get(stackSix.size() - 1));
                            stackSix.remove(stackSix.size() - 1);
                        }
                    }
                    if (moveFrom == 7) {
                        for (int i = 0; i < crates; i++) {
                            stackNine.add(stackSeven.get(stackSeven.size() - 1));
                            stackSeven.remove(stackSeven.size() - 1);
                        }
                    }

                    if (moveFrom == 8) {
                        for (int i = 0; i < crates; i++) {
                            stackNine.add(stackEight.get(stackEight.size() - 1));
                            stackEight.remove(stackEight.size() - 1);
                        }
                    }
                }
            }
        } catch (
                FileNotFoundException fnf) {
            System.out.println("File not found");
        } catch (
                NoSuchElementException nse) {
            System.out.println("Fixed?");
        }


        System.out.println("Last crates are: " + stackOne.get(stackOne.size() - 1) + stackTwo.get(stackTwo.size() - 1) + stackThree.get(stackThree.size() - 1) + stackFour.get(stackFour.size()-1) + stackFive.get(stackFive.size()-1) + stackSix.get(stackSix.size()-1) + stackSeven.get(stackSeven.size()-1) + stackEight.get(stackEight.size()-1) + stackNine.get(stackNine.size()-1));

    }

}
