package lab03;

import java.io.Reader;
import java.io.FileReader;

public class Exercise5Reader {

	    public static void main(String[] args) { 
	    	
	        try {  
	        	
	            Reader reader = new FileReader("Exercise5.txt");  
	            System.out.println("Reading from file " + "Exercise5.txt" + "\n");
	            
	            int data = reader.read();
	            
	            while (data != -1) {  
	            	
	                System.out.print((char) data);  
	                data = reader.read();  
	            } 
	            
	            reader.close();  
	            
	        } catch (Exception ex) {
	        	
	            System.out.println(ex.getMessage());  
	        }  
	    }  
	}  