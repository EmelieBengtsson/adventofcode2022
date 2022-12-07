import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) throws URISyntaxException {
        File file = new File(Day4.class.getClassLoader().getResource("day4.txt").toURI());
        int overlap = 0;

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                String set = sc.nextLine();
                String[] setAsArray = set.split(",", 2);
                String elfOneAssignment = setAsArray[0];
                String elfTwoAssignment = setAsArray[1];

                String[] elfOneStartAndStop = elfOneAssignment.split("-", 2);

                int elfOneStart = Integer.parseInt(elfOneStartAndStop[0]);
                int elfOneStop = Integer.parseInt(elfOneStartAndStop[1]);

                int elfOneNumberOfSections = elfOneStop - elfOneStart + 1;

                int[] elfOne = new int[elfOneNumberOfSections];

                elfOne[0] = elfOneStart;

                for (int i = 1; i < (elfOneStop - elfOneStart + 1); i++) {
                    elfOne[i] = elfOneStart + i;
                }

                //System.out.println("elfOne:" );

                //for(int i=0; i<elfOne.length; i++){
                //    System.out.print(elfOne[i] + " ");
                //}

                //System.out.println(" ");

                String[] elfTwoStartAndStop = elfTwoAssignment.split("-", 2);

                int elfTwoStart = Integer.parseInt(elfTwoStartAndStop[0]);
                int elfTwoStop = Integer.parseInt(elfTwoStartAndStop[1]);
                int elfTwoNumberOfSections = elfTwoStop - elfTwoStart + 1;

                int[] elfTwo = new int[elfTwoNumberOfSections];
                elfTwo[0] = elfTwoStart;

                for (int i = 1; i < (elfTwoStop - elfTwoStart + 1); i++) {
                    elfTwo[i] = elfTwoStart + i;
                }
                //System.out.println("elfTwo:"  );

                //for(int i=0; i<elfTwo.length; i++){
                //    System.out.print(elfTwo[i] + " ");
                //}

                //System.out.println(" ");

                boolean twoStartInOne = false;
                boolean twoStopInOne = false;
                boolean oneStartInTwo = false;
                boolean oneStopInTwo = false;

                for (int i = 0; i < elfOne.length; i++) {
                    if (elfOne[i] == elfTwo[0]) {
                        twoStartInOne = true;
                    }
                    if (elfOne[i] == elfTwo[elfTwo.length-1]) {
                        twoStopInOne = true;
                    }
                }

                if (twoStartInOne && twoStopInOne) {
                    overlap++;
                }
                else {
                    for (int i = 0; i < elfTwo.length; i++) {
                        if (elfTwo[i] == elfOne[0]) {
                            oneStartInTwo = true;
                        }
                        if (elfTwo[i] == elfOne[elfOne.length-1]) {
                            oneStopInTwo = true;
                        }
                    }
                    if (oneStartInTwo && oneStopInTwo){
                        overlap++;
                    }
                }

            }

        } catch (FileNotFoundException fnf) {
            System.out.println("File not found");
        } catch (NoSuchElementException nse) {
            System.out.println("File read");
        } catch (ArrayIndexOutOfBoundsException aioob) {
            System.out.println("Inga problem?");
        }
        System.out.println("Number of overlaps is " + overlap);
    }

}
