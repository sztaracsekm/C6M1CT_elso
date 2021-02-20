package ht;
import java.io.*;

public class Titkosit {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader("input\\inputfile.txt"));
		PrintWriter printWriter = new PrintWriter("output\\outputfile.txt");
		
		String secretText = "";
		String line = bufferedReader.readLine();
		System.out.println("Beolvasott szöveg: ");
		while(line!=null) {
			System.out.println(line);
			for(int i=0; i<line.length();i++) {
				char c = line.charAt(i);
				int value = Integer.valueOf(c);
				if(value != 32) value++; //szokoz kihagyasa
				secretText = secretText + (char) value;
			}
			secretText += "\n";
			line = bufferedReader.readLine();
		}
		
		System.out.println("Titkosított szöveg:\n" + secretText);
		printWriter.println(secretText);
		
		printWriter.flush();
		printWriter.close();
		bufferedReader.close();
	}

}
