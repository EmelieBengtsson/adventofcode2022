import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Day6 {
    public static void main(String... args) throws URISyntaxException {
        File file = new File(Day6.class.getClassLoader().getResource("day6.txt").toURI());

        String datastream = "";
        int index = 4;
        boolean indexFound = false;

        try(Scanner sc = new Scanner(file)) {
            datastream = sc.nextLine();

            char one = datastream.charAt(0);
            char two = datastream.charAt(1);
            char three = datastream.charAt(2);
            char four = datastream.charAt(3);
            char five = datastream.charAt(4);
            char six = datastream.charAt(5);
            char seven = datastream.charAt(6);
            char eight = datastream.charAt(7);
            char nine = datastream.charAt(8);
            char ten = datastream.charAt(9);
            char eleven = datastream.charAt(10);
            char twelve = datastream.charAt(11);
            char thirteen = datastream.charAt(12);
            char fourteen = datastream.charAt(13);

            if (one != two && one != three && one != four && one != five && one != six && one != seven && one != eight
                    && one != nine && one != ten && one != eleven && one != twelve && one != thirteen
                    && one != fourteen && two != three && two != four && two != five && two != six && two != seven
                    && two != eight && two != nine && two != ten && two != eleven && two != twelve && two != thirteen
                    && two != fourteen && three!= four && three != five && three != six && three != seven &&
                    three != eight && three != nine && three != ten && three != eleven && three != twelve &&
                    three != thirteen && three != fourteen && four != five && four != six && four != seven &&
                    four != eight && four != nine && four != ten && four != eleven && four != twelve && four != thirteen
                    && four != fourteen && five != six && five !=seven && five != eight && five != nine &&
                    five != ten && five != eleven && five != twelve && five != thirteen && five != fourteen &&
                    six != seven && six != eight && six != nine && six != ten && six!= eleven && six != twelve &&
                    six != thirteen && six != fourteen && seven != eight && seven != nine && seven != ten &&
                    seven != eleven && seven != twelve && seven != thirteen && seven != fourteen && eight != nine &&
                    eight!= ten && eight != eleven && eight != twelve && eight!= thirteen && eight!= fourteen &&
                    nine != ten && nine!= eleven && nine != twelve && nine!= thirteen && nine!= fourteen && ten!= eleven
                    && ten!=twelve && ten!= thirteen && ten != fourteen && eleven!=twelve && eleven!= thirteen &&
                    eleven!= fourteen && twelve!= thirteen && twelve!= fourteen && thirteen != fourteen) {
                indexFound = true;
            }

            while (!indexFound) {
                for (int i = 14; i < datastream.length(); i++) {
                    one = datastream.charAt(i);
                    if (one != two && one != three && one != four && one != five && one != six && one != seven && one != eight
                            && one != nine && one != ten && one != eleven && one != twelve && one != thirteen
                            && one != fourteen && two != three && two != four && two != five && two != six && two != seven
                            && two != eight && two != nine && two != ten && two != eleven && two != twelve && two != thirteen
                            && two != fourteen && three!= four && three != five && three != six && three != seven &&
                            three != eight && three != nine && three != ten && three != eleven && three != twelve &&
                            three != thirteen && three != fourteen && four != five && four != six && four != seven &&
                            four != eight && four != nine && four != ten && four != eleven && four != twelve && four != thirteen
                            && four != fourteen && five != six && five !=seven && five != eight && five != nine &&
                            five != ten && five != eleven && five != twelve && five != thirteen && five != fourteen &&
                            six != seven && six != eight && six != nine && six != ten && six!= eleven && six != twelve &&
                            six != thirteen && six != fourteen && seven != eight && seven != nine && seven != ten &&
                            seven != eleven && seven != twelve && seven != thirteen && seven != fourteen && eight != nine &&
                            eight!= ten && eight != eleven && eight != twelve && eight!= thirteen && eight!= fourteen &&
                            nine != ten && nine!= eleven && nine != twelve && nine!= thirteen && nine!= fourteen && ten!= eleven
                            && ten!=twelve && ten!= thirteen && ten != fourteen && eleven!=twelve && eleven!= thirteen &&
                            eleven!= fourteen && twelve!= thirteen && twelve!= fourteen && thirteen != fourteen) {
                        index = i+1;
                        indexFound = true;
                        break;
                    }
                    two = datastream.charAt(i + 1);
                    if (one != two && one != three && one != four && one != five && one != six && one != seven && one != eight
                            && one != nine && one != ten && one != eleven && one != twelve && one != thirteen
                            && one != fourteen && two != three && two != four && two != five && two != six && two != seven
                            && two != eight && two != nine && two != ten && two != eleven && two != twelve && two != thirteen
                            && two != fourteen && three!= four && three != five && three != six && three != seven &&
                            three != eight && three != nine && three != ten && three != eleven && three != twelve &&
                            three != thirteen && three != fourteen && four != five && four != six && four != seven &&
                            four != eight && four != nine && four != ten && four != eleven && four != twelve && four != thirteen
                            && four != fourteen && five != six && five !=seven && five != eight && five != nine &&
                            five != ten && five != eleven && five != twelve && five != thirteen && five != fourteen &&
                            six != seven && six != eight && six != nine && six != ten && six!= eleven && six != twelve &&
                            six != thirteen && six != fourteen && seven != eight && seven != nine && seven != ten &&
                            seven != eleven && seven != twelve && seven != thirteen && seven != fourteen && eight != nine &&
                            eight!= ten && eight != eleven && eight != twelve && eight!= thirteen && eight!= fourteen &&
                            nine != ten && nine!= eleven && nine != twelve && nine!= thirteen && nine!= fourteen && ten!= eleven
                            && ten!=twelve && ten!= thirteen && ten != fourteen && eleven!=twelve && eleven!= thirteen &&
                            eleven!= fourteen && twelve!= thirteen && twelve!= fourteen && thirteen != fourteen) {
                        index = i+2;
                        indexFound = true;
                        break;
                    }
                    three = datastream.charAt(i + 2);
                    if (one != two && one != three && one != four && one != five && one != six && one != seven && one != eight
                            && one != nine && one != ten && one != eleven && one != twelve && one != thirteen
                            && one != fourteen && two != three && two != four && two != five && two != six && two != seven
                            && two != eight && two != nine && two != ten && two != eleven && two != twelve && two != thirteen
                            && two != fourteen && three!= four && three != five && three != six && three != seven &&
                            three != eight && three != nine && three != ten && three != eleven && three != twelve &&
                            three != thirteen && three != fourteen && four != five && four != six && four != seven &&
                            four != eight && four != nine && four != ten && four != eleven && four != twelve && four != thirteen
                            && four != fourteen && five != six && five !=seven && five != eight && five != nine &&
                            five != ten && five != eleven && five != twelve && five != thirteen && five != fourteen &&
                            six != seven && six != eight && six != nine && six != ten && six!= eleven && six != twelve &&
                            six != thirteen && six != fourteen && seven != eight && seven != nine && seven != ten &&
                            seven != eleven && seven != twelve && seven != thirteen && seven != fourteen && eight != nine &&
                            eight!= ten && eight != eleven && eight != twelve && eight!= thirteen && eight!= fourteen &&
                            nine != ten && nine!= eleven && nine != twelve && nine!= thirteen && nine!= fourteen && ten!= eleven
                            && ten!=twelve && ten!= thirteen && ten != fourteen && eleven!=twelve && eleven!= thirteen &&
                            eleven!= fourteen && twelve!= thirteen && twelve!= fourteen && thirteen != fourteen) {
                        index = i+3;
                        indexFound = true;
                        break;
                    }
                    four = datastream.charAt(i + 3);
                    if (one != two && one != three && one != four && one != five && one != six && one != seven && one != eight
                            && one != nine && one != ten && one != eleven && one != twelve && one != thirteen
                            && one != fourteen && two != three && two != four && two != five && two != six && two != seven
                            && two != eight && two != nine && two != ten && two != eleven && two != twelve && two != thirteen
                            && two != fourteen && three!= four && three != five && three != six && three != seven &&
                            three != eight && three != nine && three != ten && three != eleven && three != twelve &&
                            three != thirteen && three != fourteen && four != five && four != six && four != seven &&
                            four != eight && four != nine && four != ten && four != eleven && four != twelve && four != thirteen
                            && four != fourteen && five != six && five !=seven && five != eight && five != nine &&
                            five != ten && five != eleven && five != twelve && five != thirteen && five != fourteen &&
                            six != seven && six != eight && six != nine && six != ten && six!= eleven && six != twelve &&
                            six != thirteen && six != fourteen && seven != eight && seven != nine && seven != ten &&
                            seven != eleven && seven != twelve && seven != thirteen && seven != fourteen && eight != nine &&
                            eight!= ten && eight != eleven && eight != twelve && eight!= thirteen && eight!= fourteen &&
                            nine != ten && nine!= eleven && nine != twelve && nine!= thirteen && nine!= fourteen && ten!= eleven
                            && ten!=twelve && ten!= thirteen && ten != fourteen && eleven!=twelve && eleven!= thirteen &&
                            eleven!= fourteen && twelve!= thirteen && twelve!= fourteen && thirteen != fourteen) {
                        index = i+4;
                        indexFound = true;
                        break;
                    }
                    five = datastream.charAt(i+4);
                    if (one != two && one != three && one != four && one != five && one != six && one != seven && one != eight
                            && one != nine && one != ten && one != eleven && one != twelve && one != thirteen
                            && one != fourteen && two != three && two != four && two != five && two != six && two != seven
                            && two != eight && two != nine && two != ten && two != eleven && two != twelve && two != thirteen
                            && two != fourteen && three!= four && three != five && three != six && three != seven &&
                            three != eight && three != nine && three != ten && three != eleven && three != twelve &&
                            three != thirteen && three != fourteen && four != five && four != six && four != seven &&
                            four != eight && four != nine && four != ten && four != eleven && four != twelve && four != thirteen
                            && four != fourteen && five != six && five !=seven && five != eight && five != nine &&
                            five != ten && five != eleven && five != twelve && five != thirteen && five != fourteen &&
                            six != seven && six != eight && six != nine && six != ten && six!= eleven && six != twelve &&
                            six != thirteen && six != fourteen && seven != eight && seven != nine && seven != ten &&
                            seven != eleven && seven != twelve && seven != thirteen && seven != fourteen && eight != nine &&
                            eight!= ten && eight != eleven && eight != twelve && eight!= thirteen && eight!= fourteen &&
                            nine != ten && nine!= eleven && nine != twelve && nine!= thirteen && nine!= fourteen && ten!= eleven
                            && ten!=twelve && ten!= thirteen && ten != fourteen && eleven!=twelve && eleven!= thirteen &&
                            eleven!= fourteen && twelve!= thirteen && twelve!= fourteen && thirteen != fourteen) {
                        index = i+5;
                        indexFound = true;
                        break;
                    }
                    six = datastream.charAt(i + 5);
                    if (one != two && one != three && one != four && one != five && one != six && one != seven && one != eight
                            && one != nine && one != ten && one != eleven && one != twelve && one != thirteen
                            && one != fourteen && two != three && two != four && two != five && two != six && two != seven
                            && two != eight && two != nine && two != ten && two != eleven && two != twelve && two != thirteen
                            && two != fourteen && three!= four && three != five && three != six && three != seven &&
                            three != eight && three != nine && three != ten && three != eleven && three != twelve &&
                            three != thirteen && three != fourteen && four != five && four != six && four != seven &&
                            four != eight && four != nine && four != ten && four != eleven && four != twelve && four != thirteen
                            && four != fourteen && five != six && five !=seven && five != eight && five != nine &&
                            five != ten && five != eleven && five != twelve && five != thirteen && five != fourteen &&
                            six != seven && six != eight && six != nine && six != ten && six!= eleven && six != twelve &&
                            six != thirteen && six != fourteen && seven != eight && seven != nine && seven != ten &&
                            seven != eleven && seven != twelve && seven != thirteen && seven != fourteen && eight != nine &&
                            eight!= ten && eight != eleven && eight != twelve && eight!= thirteen && eight!= fourteen &&
                            nine != ten && nine!= eleven && nine != twelve && nine!= thirteen && nine!= fourteen && ten!= eleven
                            && ten!=twelve && ten!= thirteen && ten != fourteen && eleven!=twelve && eleven!= thirteen &&
                            eleven!= fourteen && twelve!= thirteen && twelve!= fourteen && thirteen != fourteen) {
                        index = i+6;
                        indexFound = true;
                        break;
                    }
                    seven = datastream.charAt(i + 6);
                    if (one != two && one != three && one != four && one != five && one != six && one != seven && one != eight
                            && one != nine && one != ten && one != eleven && one != twelve && one != thirteen
                            && one != fourteen && two != three && two != four && two != five && two != six && two != seven
                            && two != eight && two != nine && two != ten && two != eleven && two != twelve && two != thirteen
                            && two != fourteen && three!= four && three != five && three != six && three != seven &&
                            three != eight && three != nine && three != ten && three != eleven && three != twelve &&
                            three != thirteen && three != fourteen && four != five && four != six && four != seven &&
                            four != eight && four != nine && four != ten && four != eleven && four != twelve && four != thirteen
                            && four != fourteen && five != six && five !=seven && five != eight && five != nine &&
                            five != ten && five != eleven && five != twelve && five != thirteen && five != fourteen &&
                            six != seven && six != eight && six != nine && six != ten && six!= eleven && six != twelve &&
                            six != thirteen && six != fourteen && seven != eight && seven != nine && seven != ten &&
                            seven != eleven && seven != twelve && seven != thirteen && seven != fourteen && eight != nine &&
                            eight!= ten && eight != eleven && eight != twelve && eight!= thirteen && eight!= fourteen &&
                            nine != ten && nine!= eleven && nine != twelve && nine!= thirteen && nine!= fourteen && ten!= eleven
                            && ten!=twelve && ten!= thirteen && ten != fourteen && eleven!=twelve && eleven!= thirteen &&
                            eleven!= fourteen && twelve!= thirteen && twelve!= fourteen && thirteen != fourteen) {
                        index = i+7;
                        indexFound = true;
                        break;
                    }
                    eight = datastream.charAt(i + 7);
                    if (one != two && one != three && one != four && one != five && one != six && one != seven && one != eight
                            && one != nine && one != ten && one != eleven && one != twelve && one != thirteen
                            && one != fourteen && two != three && two != four && two != five && two != six && two != seven
                            && two != eight && two != nine && two != ten && two != eleven && two != twelve && two != thirteen
                            && two != fourteen && three!= four && three != five && three != six && three != seven &&
                            three != eight && three != nine && three != ten && three != eleven && three != twelve &&
                            three != thirteen && three != fourteen && four != five && four != six && four != seven &&
                            four != eight && four != nine && four != ten && four != eleven && four != twelve && four != thirteen
                            && four != fourteen && five != six && five !=seven && five != eight && five != nine &&
                            five != ten && five != eleven && five != twelve && five != thirteen && five != fourteen &&
                            six != seven && six != eight && six != nine && six != ten && six!= eleven && six != twelve &&
                            six != thirteen && six != fourteen && seven != eight && seven != nine && seven != ten &&
                            seven != eleven && seven != twelve && seven != thirteen && seven != fourteen && eight != nine &&
                            eight!= ten && eight != eleven && eight != twelve && eight!= thirteen && eight!= fourteen &&
                            nine != ten && nine!= eleven && nine != twelve && nine!= thirteen && nine!= fourteen && ten!= eleven
                            && ten!=twelve && ten!= thirteen && ten != fourteen && eleven!=twelve && eleven!= thirteen &&
                            eleven!= fourteen && twelve!= thirteen && twelve!= fourteen && thirteen != fourteen) {
                        index = i+8;
                        indexFound = true;
                        break;
                    }
                    nine = datastream.charAt(i + 8);
                    if (one != two && one != three && one != four && one != five && one != six && one != seven && one != eight
                            && one != nine && one != ten && one != eleven && one != twelve && one != thirteen
                            && one != fourteen && two != three && two != four && two != five && two != six && two != seven
                            && two != eight && two != nine && two != ten && two != eleven && two != twelve && two != thirteen
                            && two != fourteen && three!= four && three != five && three != six && three != seven &&
                            three != eight && three != nine && three != ten && three != eleven && three != twelve &&
                            three != thirteen && three != fourteen && four != five && four != six && four != seven &&
                            four != eight && four != nine && four != ten && four != eleven && four != twelve && four != thirteen
                            && four != fourteen && five != six && five !=seven && five != eight && five != nine &&
                            five != ten && five != eleven && five != twelve && five != thirteen && five != fourteen &&
                            six != seven && six != eight && six != nine && six != ten && six!= eleven && six != twelve &&
                            six != thirteen && six != fourteen && seven != eight && seven != nine && seven != ten &&
                            seven != eleven && seven != twelve && seven != thirteen && seven != fourteen && eight != nine &&
                            eight!= ten && eight != eleven && eight != twelve && eight!= thirteen && eight!= fourteen &&
                            nine != ten && nine!= eleven && nine != twelve && nine!= thirteen && nine!= fourteen && ten!= eleven
                            && ten!=twelve && ten!= thirteen && ten != fourteen && eleven!=twelve && eleven!= thirteen &&
                            eleven!= fourteen && twelve!= thirteen && twelve!= fourteen && thirteen != fourteen) {
                        index = i+9;
                        indexFound = true;
                        break;
                    }
                    ten = datastream.charAt(i + 9);
                    if (one != two && one != three && one != four && one != five && one != six && one != seven && one != eight
                            && one != nine && one != ten && one != eleven && one != twelve && one != thirteen
                            && one != fourteen && two != three && two != four && two != five && two != six && two != seven
                            && two != eight && two != nine && two != ten && two != eleven && two != twelve && two != thirteen
                            && two != fourteen && three!= four && three != five && three != six && three != seven &&
                            three != eight && three != nine && three != ten && three != eleven && three != twelve &&
                            three != thirteen && three != fourteen && four != five && four != six && four != seven &&
                            four != eight && four != nine && four != ten && four != eleven && four != twelve && four != thirteen
                            && four != fourteen && five != six && five !=seven && five != eight && five != nine &&
                            five != ten && five != eleven && five != twelve && five != thirteen && five != fourteen &&
                            six != seven && six != eight && six != nine && six != ten && six!= eleven && six != twelve &&
                            six != thirteen && six != fourteen && seven != eight && seven != nine && seven != ten &&
                            seven != eleven && seven != twelve && seven != thirteen && seven != fourteen && eight != nine &&
                            eight!= ten && eight != eleven && eight != twelve && eight!= thirteen && eight!= fourteen &&
                            nine != ten && nine!= eleven && nine != twelve && nine!= thirteen && nine!= fourteen && ten!= eleven
                            && ten!=twelve && ten!= thirteen && ten != fourteen && eleven!=twelve && eleven!= thirteen &&
                            eleven!= fourteen && twelve!= thirteen && twelve!= fourteen && thirteen != fourteen) {
                        index = i+10;
                        indexFound = true;
                        break;
                    }
                    eleven = datastream.charAt(i + 10);
                    if (one != two && one != three && one != four && one != five && one != six && one != seven && one != eight
                            && one != nine && one != ten && one != eleven && one != twelve && one != thirteen
                            && one != fourteen && two != three && two != four && two != five && two != six && two != seven
                            && two != eight && two != nine && two != ten && two != eleven && two != twelve && two != thirteen
                            && two != fourteen && three!= four && three != five && three != six && three != seven &&
                            three != eight && three != nine && three != ten && three != eleven && three != twelve &&
                            three != thirteen && three != fourteen && four != five && four != six && four != seven &&
                            four != eight && four != nine && four != ten && four != eleven && four != twelve && four != thirteen
                            && four != fourteen && five != six && five !=seven && five != eight && five != nine &&
                            five != ten && five != eleven && five != twelve && five != thirteen && five != fourteen &&
                            six != seven && six != eight && six != nine && six != ten && six!= eleven && six != twelve &&
                            six != thirteen && six != fourteen && seven != eight && seven != nine && seven != ten &&
                            seven != eleven && seven != twelve && seven != thirteen && seven != fourteen && eight != nine &&
                            eight!= ten && eight != eleven && eight != twelve && eight!= thirteen && eight!= fourteen &&
                            nine != ten && nine!= eleven && nine != twelve && nine!= thirteen && nine!= fourteen && ten!= eleven
                            && ten!=twelve && ten!= thirteen && ten != fourteen && eleven!=twelve && eleven!= thirteen &&
                            eleven!= fourteen && twelve!= thirteen && twelve!= fourteen && thirteen != fourteen) {
                        index = i+11;
                        indexFound = true;
                        break;
                    }
                    twelve = datastream.charAt(i + 11);
                    if (one != two && one != three && one != four && one != five && one != six && one != seven && one != eight
                            && one != nine && one != ten && one != eleven && one != twelve && one != thirteen
                            && one != fourteen && two != three && two != four && two != five && two != six && two != seven
                            && two != eight && two != nine && two != ten && two != eleven && two != twelve && two != thirteen
                            && two != fourteen && three!= four && three != five && three != six && three != seven &&
                            three != eight && three != nine && three != ten && three != eleven && three != twelve &&
                            three != thirteen && three != fourteen && four != five && four != six && four != seven &&
                            four != eight && four != nine && four != ten && four != eleven && four != twelve && four != thirteen
                            && four != fourteen && five != six && five !=seven && five != eight && five != nine &&
                            five != ten && five != eleven && five != twelve && five != thirteen && five != fourteen &&
                            six != seven && six != eight && six != nine && six != ten && six!= eleven && six != twelve &&
                            six != thirteen && six != fourteen && seven != eight && seven != nine && seven != ten &&
                            seven != eleven && seven != twelve && seven != thirteen && seven != fourteen && eight != nine &&
                            eight!= ten && eight != eleven && eight != twelve && eight!= thirteen && eight!= fourteen &&
                            nine != ten && nine!= eleven && nine != twelve && nine!= thirteen && nine!= fourteen && ten!= eleven
                            && ten!=twelve && ten!= thirteen && ten != fourteen && eleven!=twelve && eleven!= thirteen &&
                            eleven!= fourteen && twelve!= thirteen && twelve!= fourteen && thirteen != fourteen) {
                        index = i+12;
                        indexFound = true;
                        break;
                    }
                    thirteen = datastream.charAt(i+12);
                    if (one != two && one != three && one != four && one != five && one != six && one != seven && one != eight
                            && one != nine && one != ten && one != eleven && one != twelve && one != thirteen
                            && one != fourteen && two != three && two != four && two != five && two != six && two != seven
                            && two != eight && two != nine && two != ten && two != eleven && two != twelve && two != thirteen
                            && two != fourteen && three!= four && three != five && three != six && three != seven &&
                            three != eight && three != nine && three != ten && three != eleven && three != twelve &&
                            three != thirteen && three != fourteen && four != five && four != six && four != seven &&
                            four != eight && four != nine && four != ten && four != eleven && four != twelve && four != thirteen
                            && four != fourteen && five != six && five !=seven && five != eight && five != nine &&
                            five != ten && five != eleven && five != twelve && five != thirteen && five != fourteen &&
                            six != seven && six != eight && six != nine && six != ten && six!= eleven && six != twelve &&
                            six != thirteen && six != fourteen && seven != eight && seven != nine && seven != ten &&
                            seven != eleven && seven != twelve && seven != thirteen && seven != fourteen && eight != nine &&
                            eight!= ten && eight != eleven && eight != twelve && eight!= thirteen && eight!= fourteen &&
                            nine != ten && nine!= eleven && nine != twelve && nine!= thirteen && nine!= fourteen && ten!= eleven
                            && ten!=twelve && ten!= thirteen && ten != fourteen && eleven!=twelve && eleven!= thirteen &&
                            eleven!= fourteen && twelve!= thirteen && twelve!= fourteen && thirteen != fourteen) {
                        index = i+13;
                        indexFound = true;
                        break;
                    }
                    fourteen = datastream.charAt(i + 13);
                    if (one != two && one != three && one != four && one != five && one != six && one != seven && one != eight
                            && one != nine && one != ten && one != eleven && one != twelve && one != thirteen
                            && one != fourteen && two != three && two != four && two != five && two != six && two != seven
                            && two != eight && two != nine && two != ten && two != eleven && two != twelve && two != thirteen
                            && two != fourteen && three!= four && three != five && three != six && three != seven &&
                            three != eight && three != nine && three != ten && three != eleven && three != twelve &&
                            three != thirteen && three != fourteen && four != five && four != six && four != seven &&
                            four != eight && four != nine && four != ten && four != eleven && four != twelve && four != thirteen
                            && four != fourteen && five != six && five !=seven && five != eight && five != nine &&
                            five != ten && five != eleven && five != twelve && five != thirteen && five != fourteen &&
                            six != seven && six != eight && six != nine && six != ten && six!= eleven && six != twelve &&
                            six != thirteen && six != fourteen && seven != eight && seven != nine && seven != ten &&
                            seven != eleven && seven != twelve && seven != thirteen && seven != fourteen && eight != nine &&
                            eight!= ten && eight != eleven && eight != twelve && eight!= thirteen && eight!= fourteen &&
                            nine != ten && nine!= eleven && nine != twelve && nine!= thirteen && nine!= fourteen && ten!= eleven
                            && ten!=twelve && ten!= thirteen && ten != fourteen && eleven!=twelve && eleven!= thirteen &&
                            eleven!= fourteen && twelve!= thirteen && twelve!= fourteen && thirteen != fourteen) {
                        index = i+14;
                        indexFound = true;
                        break;
                    }
                }


            }
        }catch (FileNotFoundException fnf){
            System.out.println("File not found");
        }
        catch (StringIndexOutOfBoundsException sioob){
            System.out.println("String read");
        }

        System.out.println("Start of packet marker detected after " + index + " characters.");
    }
}
