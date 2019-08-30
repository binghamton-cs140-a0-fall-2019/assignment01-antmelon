package assignment01;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
public class PersonTester {
	public static void main(String[] args) {

		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Person.java:");

            Person person1 = new Person("Anthony", "Longo", "111111111", new DateAndPlaceOfBirth(2000, 9, 25, "Lynbrook", "NY", "USA"), new StreetUSAddress("123 Sesame St", "", "Lynbrook", "NY", "11563"));
            output.println(person1);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
