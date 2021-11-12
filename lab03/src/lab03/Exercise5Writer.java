package lab03;

import java.io.BufferedOutputStream;
import java.io.Writer;
import java.io.FileWriter;

public class Exercise5Writer {
	
	public static void main(String[] args) {
		
		// Declare output file
		String outFile = "Exercise5.txt";
		
		// Data declaration
		int StationID1 = 2321006;
		int StationID2 = 2222002;
		String district = "Alor Gajah";
		double rainfallS1[] = { 0.0, 6.0, 2.0, 5.0, 9.0, 5.0};
		double rainfallS2[] = {0.0, 2.0, 0.0, 3.0, 4.0, 2.0 };
		double totalS1 = 0;
		double totalS2 = 0;
		
		try {
			
			//Create stream to read data
				Writer file = new FileWriter(outFile);
				
				file.write("\nStation id:\t" + 2222002 + "\n");
				file.write("Districts:\t" + district + "\n");
				file.write("Station Name:\t" + "Ladang Lendu" + "\n");
				
				for(int i = 0; i < rainfallS1.length; i++) {
					
					file.write("Day " + (i+1) + "\t" + rainfallS1[i] + "\n");
					totalS1 += rainfallS1[i];
				
				}
				double average = 0;
				average = totalS1 / 6;
				String av = String.format("%.1f", average);
				file.write("\nAverage for station  Ladang Lendu is " + av + "%" );
				
				file.write("\nStation id:\t" + 2321006 + "\n");
				file.write("Districts:\t" + district + "\n");
				file.write("Station Name:\t" + "Durian Tungal" + "\n");
				
				for(int i = 0; i < rainfallS2.length; i++) {
					
					file.write("Day " + (i+1) + "\t" + rainfallS2[i] +"\n");
					totalS2 += rainfallS2[i];
				}
				double average2;
				average2 = totalS2 / 6;
				String av2 = String.format("%.1f", average2);
				file.write("\nAverage for station Durian Tunggal is " + av2 + "%" );
				
				
				
				file.flush();
				file.close();
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			System.out.println("The data has been succesfully created ! Checkout " + outFile);
		}

	}