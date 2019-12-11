import java.io.*;
import java.util.*;

public class CUSIP {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			File dataFile = new File("C:\\Users\\Mohsen\\Downloads\\CUSIP.txt");
			File outputFile = new File("C:\\Users\\Mohsen\\Downloads\\outputPrices.txt");
			Scanner scanner = new Scanner(dataFile);
			BufferedWriter output = new BufferedWriter(new FileWriter(outputFile));
			String prev = null;
			
			for(int i=0; scanner.hasNext(); i++) {
				String lineOfText = scanner.nextLine();
				if(lineOfText.contains("\"") && lineOfText.length()==10) {
					String cusip = lineOfText;
					if(prev!=null) {output.write(prev); output.newLine(); System.out.println(prev);}
					output.write(cusip + ": "); System.out.print(cusip + ": "); 
					// if(!scanner.hasNextLine()) System.out.println(lineOfText);
				}
				prev = lineOfText;
				
			}
			System.out.println(prev);
			
			output.write(prev);
	        output.close();
	        scanner.close();
		
		}
		catch (FileNotFoundException e){
			e.printStackTrace();
		}
	}
}
