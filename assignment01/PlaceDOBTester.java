package assignment01;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
public class PlaceDOBTester{
    public static void main(String[] args) {

        try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");

            DateAndPlaceOfBirth object1 = new DateAndPlaceOfBirth(2000, 1, 1, "Binghamton", "NY", "USA");
            DateAndPlaceOfBirth object2 = new DateAndPlaceOfBirth(2000, 1, 1, "Lynbrook", "NY", "USA");
            DateAndPlaceOfBirth object3 = new DateAndPlaceOfBirth(2001, 1, 1, "Vestal", "NY", "USA");
            DateAndPlaceOfBirth object4 = new DateAndPlaceOfBirth(2015, 12, 8, "Rome", "Italy");
            DateAndPlaceOfBirth object5 = new DateAndPlaceOfBirth(2009, 8, 15, "London", "England");

            //same birthday test
            output.println(object1.hasSameBirthDayAs(object2));
            output.println(object1.hasSameBirthDayAs(object3));
            output.println(object1.hasSameBirthDayAs(object4));
            output.println(object1.hasSameBirthDayAs(object5));
            output.println(object2.hasSameBirthDayAs(object3));
            output.println(object2.hasSameBirthDayAs(object4));
            output.println(object2.hasSameBirthDayAs(object5));
            output.println(object3.hasSameBirthDayAs(object4));
            output.println(object3.hasSameBirthDayAs(object5));
            output.println(object4.hasSameBirthDayAs(object5));






            //older than
            output.println("\nTesting older than");
            output.println(object1.olderThan(object2));
            output.println(object1.olderThan(object3));
            output.println(object1.olderThan(object4));
            output.println(object1.olderThan(object5));

            output.println(object2.olderThan(object1));
            output.println(object2.olderThan(object3));
            output.println(object2.olderThan(object4));
            output.println(object2.olderThan(object5));

            output.println(object3.olderThan(object1));
            output.println(object3.olderThan(object2));
            output.println(object3.olderThan(object4));
            output.println(object3.olderThan(object5));

            output.println(object4.olderThan(object1));
            output.println(object4.olderThan(object2));
            output.println(object4.olderThan(object3));
            output.println(object4.olderThan(object5));

            output.println(object5.olderThan(object1));
            output.println(object5.olderThan(object2));
            output.println(object5.olderThan(object3));
            output.println(object5.olderThan(object4));

            //younger than
            output.println("\nTesting younger than");
            output.println(object1.youngerThan(object2));
            output.println(object1.youngerThan(object3));
            output.println(object1.youngerThan(object4));
            output.println(object1.youngerThan(object5));

            output.println(object2.youngerThan(object1));
            output.println(object2.youngerThan(object3));
            output.println(object2.youngerThan(object4));
            output.println(object2.youngerThan(object5));

            output.println(object3.youngerThan(object1));
            output.println(object3.youngerThan(object2));
            output.println(object3.youngerThan(object4));
            output.println(object3.youngerThan(object5));

            output.println(object4.youngerThan(object1));
            output.println(object4.youngerThan(object2));
            output.println(object4.youngerThan(object3));
            output.println(object4.youngerThan(object5));

            output.println(object5.youngerThan(object1));
            output.println(object5.youngerThan(object2));
            output.println(object5.youngerThan(object3));
            output.println(object5.youngerThan(object4));

            //same birth birth date
            output.println("\nTesting same birth date");
            output.println(object1.hasSameBirthDateAs(object2));
            output.println(object1.hasSameBirthDateAs(object3));
            output.println(object1.hasSameBirthDateAs(object4));
            output.println(object1.hasSameBirthDateAs(object5));
            output.println(object2.hasSameBirthDateAs(object3));
            output.println(object2.hasSameBirthDateAs(object4));
            output.println(object2.hasSameBirthDateAs(object5));
            output.println(object3.hasSameBirthDateAs(object4));
            output.println(object3.hasSameBirthDateAs(object5));
            output.println(object4.hasSameBirthDateAs(object5));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

}

}
