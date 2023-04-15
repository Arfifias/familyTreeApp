
package familysearchtree;

import java.io.*;
import java.util.*;

public class FamilySearchTree {

	public static void main(String[] args) {
		CreateFiles files = new CreateFiles();//Creating three new files
		files.familydata();//Data file
		files.sortfamily();//Sort file
                FamilySearch search = new FamilySearch();//Family search file
		
        int n;//Variable 
		
		do {
			n = menu();
			
			if (n == 1) {
				listFamilyMembers();
			}
			if (n == 2) {
				Sortlist();
			}
                        if (n == 3) {
                            search.FamilyToFind();
                        }
						//Setting files to menu
		}
		while (n != 4);

	}
	
	public static int menu() {
		
		System.out.println("Family Members.");
		System.out.println("<======================>");
		System.out.println("1 |> Show Family Members.");
		System.out.println("2 |> Show Family Members in alphabetical order.");
                System.out.println("3 |> Search the relationship between family members.");
		System.out.println("4 |> Exit.");
		System.out.println();
		System.out.print("Choose a number: ");

		//Creating the menu

		
		Scanner input = new Scanner(System.in);//Input
		int number = input.nextInt();
		
		return number;//Variable

	}
	
	public static void listFamilyMembers() {
		
		System.out.println("\n\n List of Family Members.");//Cretaing the list
		System.out.println("<==============================>");
		
		try {
			File myObj = new File("familydata.csv");//Setting a file to csv file
			Scanner myReader = new Scanner(myObj);//Reader
			
			while(myReader.hasNextLine()) {
				
				String data = myReader.nextLine();
				System.out.println(data);//Printing on screen the data included in the file the names
				
			}
			myReader.close();//Closing reader
		}
		catch (FileNotFoundException e) {
			System.out.println("An error occured");//Catching Exceptions
			e.printStackTrace();
		}
		
		System.out.println();
		System.out.println();
	}
	
	public static void Sortlist() {
		
		System.out.println("\n\n List of Family Members in alphabetical order.");
		System.out.println("<====================================================>");//Aphabetical order of names
		
		
		try {
			File Obj = new File("familysort.csv");
			Scanner myReader = new Scanner(Obj);
			
			while(myReader.hasNextLine()) {
				
				String data = myReader.nextLine();
				System.out.println(data);

				//Setting the names in alphabetical order
				
			}
			myReader.close();//Closing reader
		}
		catch (FileNotFoundException e) {
			System.out.println("An error occured");//Catching Exceptions
			e.printStackTrace();
		}
		
		System.out.println();
		System.out.println();
		
	}

}