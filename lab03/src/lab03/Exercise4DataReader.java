package lab03;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class Exercise4DataReader {
	
	public static void main(String[] args) {


		// Declare output file 
		String sourceFile1 = "DailyRainfallDataDetailS1.txt";
		String sourceFile2 = "DailyRainfallDataDetailS2.txt";
		System.out.println("Reading data from " + sourceFile1 +" and " + sourceFile2 + "\n");

		try 
		{

			//Create stream to read data			
				System.out.println("6 Days Of Data Rainfall From Selected Station\n");
				
				DataInputStream dis1 = new DataInputStream(new FileInputStream(sourceFile1));
				DataInputStream dis2 = new DataInputStream(new FileInputStream(sourceFile2));
				
				// Variables for processing byte-based data
				int no = 0;
				double rainfall = 0;
				double total = 0;
				String s = "";
				
				//Display station ID1
				no = dis1.readInt();
				System.out.println("Station ID : " + no + "\n");
				System.out.println("Day\t" + "Districts\t" + "Station");
				
				//Process data until end-of-file
				while(dis1.available() > 0)
				{
					for (int day = 1; day < 7; day++) 
					{
						// Read data
						s = dis1.readUTF();
						rainfall = dis1.readDouble();
						System.out.println("Day " + day + "\t" + s + "\t" +rainfall );
						
						total+=rainfall;
						
					}
					
					//calculate average S1
					double average = 0;
					int noOfDay = 6;
					average = total/noOfDay;
					
					String av = String.format("%.1f", average);
					System.out.println("\nAvarage of station Ladang Lendu is " + av + "%" );
					
	
				}
				
				//Display station ID2
				no = dis2.readInt();
				System.out.println("\nStation ID : " + no + "\n");
				System.out.println("Day\t" + "Districts\t" + "Station");
				while(dis2.available() > 0) {
					
					for(int i = 1; i < 7; i++) {
					s = dis2.readUTF();
					rainfall = dis2.readDouble();
					System.out.println("Day " + i + "\t" + s + "\t" + rainfall );
					
					total +=rainfall;
					
					}
					//calculate average S2
					double average2 = 0;
					int noOfDay = 6;
					average2 = total/noOfDay;
					
					String av = String.format("%.1f", average2);
					System.out.println("\nAvarage of station Durian Tunggal is " + av + "%" );
				}
				
				
				dis1.close();
				dis2.close();
			
		}catch (Exception ex) {
			
			ex.printStackTrace();
		}

		// Indicate end of program - Could be successful
		System.out.println("\nEnd of program.");

	
	}
}