package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class USAddressTester{
	public static void main(String[] args) {
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR StreetUSAAddress.java:");

            StreetUSAddress address1 = new StreetUSAddress("123 Sesame st", "", "City", "NY", "11111");
            StreetUSAddress address2 = new StreetUSAddress("111 other st", "Apartment 2", "City", "NJ", "12345");

            output.println(address1);
            output.println(address2);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
