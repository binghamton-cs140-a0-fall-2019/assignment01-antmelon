package assignment01;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
public class ComputerOwnerTester {
	public static void main(String[] args) {

		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR ComputerOwner.java:");

            Person person1 = new Person("Anthony", "Longo", "111111111", new DateAndPlaceOfBirth(2000, 9, 25, "Lynbrook", "NY", "USA"), new StreetUSAddress("123 Sesame St", "", "Lynbrook", "NY", "11563"));
            ComputerOwner computerOwner1 = new ComputerOwner(person1);
            Computer Computer1 = new Computer("a", "a",8, 500, true, 1000);
			Computer Computer2 = new Computer("a", "a",8, 500, false, 1000);
			Computer Computer3 = new Computer("a", "a",8, 1500, true, 1000);
			Computer Computer4 = new Computer("a", "a",8, 1500, false, 1000);

            computerOwner1.addComputer(Computer1);
            computerOwner1.addComputer(Computer2);
            computerOwner1.addComputer(Computer3);
            computerOwner1.addComputer(Computer4);
            output.println(computerOwner1);

            computerOwner1.removeComputer(1);
            computerOwner1.removeComputer(2);
            output.println(computerOwner1);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
