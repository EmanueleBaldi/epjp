package b08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class S84 {
	public static void main(String[] args) {
		File f = new File("/tmp/hello.txt");

		try {
			PrintWriter pw = new PrintWriter(new FileWriter(f));
			// PrintWriter pw = new PrintWriter(new FileWriter(f, true)); per non sovrascrivere cosa è già sul file, 
																		// ma iniziare a scrivere da dopo il testo 
																		// già presente
			pw.println("hello");
			pw.flush();
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(f));
			String line = br.readLine();
			System.out.println(">" + line + "<");

			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
