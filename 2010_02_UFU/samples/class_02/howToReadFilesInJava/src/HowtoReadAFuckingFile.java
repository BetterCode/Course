import java.io.File;
import java.util.Scanner;


public class HowtoReadAFuckingFile {
	
	public static void main(String[] args) throws Exception {
		Scanner fileScanner = new Scanner(new File("fuckingFile"));
		while ( fileScanner.hasNextLine() ) {
			System.out.println( fileScanner.nextLine() );
		}
	}

}
