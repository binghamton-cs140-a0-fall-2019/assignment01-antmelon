package assignment01;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
public class SimpleDateTester {
	public static void main(String[] args) {
        try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR SimpleDate.java:");

            SimpleDate date1 = new SimpleDate(2000, 8, 1);
            SimpleDate date2 = new SimpleDate(2002, 4, 3);
            output.println(date1.before(date2));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
