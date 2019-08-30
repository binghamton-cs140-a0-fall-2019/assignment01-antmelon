package assignment01;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
public class ComputerTester {
	public static void main(String[] args) {
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Computer.java:");

			Computer Computer12 = new Computer("a", "a",8, 500, true, 1000);
			Computer Computer22 = new Computer("a", "a",8, 500, false, 1000);
			Computer Computer32 = new Computer("a", "a",8, 1500, true, 1000);
			Computer Computer42 = new Computer("a", "a",8, 1500, false, 1000);

			output.println(Computer12);
			output.println(Computer22);
			output.println(Computer32);
			output.println(Computer42);

		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
