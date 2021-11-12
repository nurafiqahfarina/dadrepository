package lab03;


import java.io.DataOutputStream;
import java.io.FileOutputStream;


public class Exercise3InputData {
	
	public static void main(String[] args) {
	
	// Declare output file
		String outFile = "DailyRainfallData.txt";
		
	// Data declaration
	String date[] = {"05/11/2021", "06/11/2021", "07/11/2021", "08/11/2021", 
			"09/11/2021", "10/11/2021"};
	double utilizations[] = {0.0, 0.0, 4.0, 0.0, 2.0, 4.0};
	
	try {
		
		//Create stream to read data
		DataOutputStream output = new DataOutputStream(new FileOutputStream(outFile));
		
		//Write data into buffer
		for (int index = 0; index < date.length; index++) {
			
			output.writeUTF(date[index]);
			output.writeDouble(utilizations[index]);
			
			//Flush for each writing
			output.flush();
		}
		
		//Close stream
		output.close();
		
	} catch (Exception ex) {
		
		ex.printStackTrace();
	}
	
	//Indicate end of program - Could be successful
	System.out.println("Data has been aded successfully. Check out " + outFile); 
}

}