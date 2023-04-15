
package familysearchtree;

import java.io.*;
import java.util.*;

public class CreateFiles {
	
	public void familydata() {
		
		try {
			FileWriter myWriter = new FileWriter("familydata.csv",false);
			
			myWriter.write("Steffon,Baratheon,man\n");
			myWriter.write("Cassana,Estermont,woman\n");
			myWriter.write("Robert,Baratheon,man\n");
			myWriter.write("Cersei,Lannister,woman\n");
			myWriter.write("Stannis,Baratheon,man\n");
			myWriter.write("Selyse,Baratheon,woman\n");
			myWriter.write("Renly,Baratheon,man\n");
			myWriter.write("Margaery,Tyrell,woman\n");
			myWriter.write("Gendry,man\n");
			myWriter.write("Joffrey,Baratheon,man\n");
			myWriter.write("Myrcella,Baratheon,woman\n");
			myWriter.write("Tommen,Baratheon,man\n");
			myWriter.write("Shireen,Baratheon,man\n");
			myWriter.close();
			//Creating a csv file

		}
		catch (IOException e) {
			System.out.println("\n\n ERROR: An error occured \n\n");//Catching exceptions
			e.printStackTrace();//Fimding the error
			
		}
    }
	
	public void sortfamily() {
		String list[] = {"Steffon,male","Cassana,female","Robert,male","Cersei,female",
				"Stannis,male","Selyse,female","Renly,male","Margaery,female","Gendry,male",
				"Joffrey,male","Myrcella,female","Tommen,male","Shireen,male"};//The array where the names of the family are stored
		
		Arrays.sort(list);//Sorting the list
		
		try {
			FileWriter myWriter2 = new FileWriter("familysort.csv",false);//Creating another file
			String temp;//Useful variable
			
			for(int i = 0; i < list.length; i++) {
				temp = list[i];
				myWriter2.write(temp + "\n");//Writing in the file
			}
			myWriter2.close();//Closing file
			
		}
		catch (IOException e) {
			System.out.println("\n\n ERROR: An error occured \n\n");
			e.printStackTrace();//Catching Exceptions
			
		}
	}
}

