package lab03;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Exercise4DataGenerator {

	public static void main(String[] args) {
		
		// Declare output file
		String outFile = "DailyRainfallDataDetailS1.txt";
		String outFile2 = "DailyRainfallDataDetailS2.txt";
		
		// Data declaration
		int StationID1 = 2321006;
		int StationID2 = 2222002;
		String district = "Alor Gajah";
		double rainfallS1[] = { 0.0, 6.0, 2.0, 5.0, 9.0, 5.0};
		double rainfallS2[] = {0.0, 2.0, 0.0, 3.0, 4.0, 2.0 };
		
		
		try {
			
			//Create stream to read data
				DataOutputStream dos = new DataOutputStream(new FileOutputStream(outFile));
				DataOutputStream dos2 = new DataOutputStream(new FileOutputStream(outFile2));
				
				dos.writeInt(StationID1);
				dos2.writeInt(StationID2);
				
				
				//Write data into buffer	
				for(int i = 0; i < rainfallS1.length; i++) {
					dos.writeUTF(district + "\tLadang Lendu");	
					dos.writeDouble(rainfallS1[i]);
					
				}
				
				for(int i = 0; i < rainfallS2.length; i++) {
					dos2.writeUTF(district + "\tDurian Tunggal");	
					dos2.writeDouble(rainfallS2[i]);
					
				}
				
				//Flush for each writing
				dos.flush();
				//Close stream
				dos.close();
				
			}catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Data has been created succesfully! Checkout the " + outFile + " and " + outFile2 + ".");
	}
}