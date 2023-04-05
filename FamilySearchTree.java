
package familysearchtree;

import java.io.*;
import java.util.*;

public class FamilySearchTree {

	public static void main(String[] args) {
		CreateFiles files = new CreateFiles();
		files.familydata();
		files.sortfamily();
                FamilySearch search = new FamilySearch();
		
        int n;
		
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
		
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		return number;

	}
	
	public static void listFamilyMembers() {
		
		System.out.println("\n\n List of Family Members.");
		System.out.println("<==============================>");
		
		try {
			File myObj = new File("familydata.csv");
			Scanner myReader = new Scanner(myObj);
			
			while(myReader.hasNextLine()) {
				
				String data = myReader.nextLine();
				System.out.println(data);
				
			}
			myReader.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
		
		System.out.println();
		System.out.println();
	}
	
	public static void Sortlist() {
		
		System.out.println("\n\n List of Family Members in alphabetical order.");
		System.out.println("<====================================================>");
		
		
		try {
			File Obj = new File("familysort.csv");
			Scanner myReader = new Scanner(Obj);
			
			while(myReader.hasNextLine()) {
				
				String data = myReader.nextLine();
				System.out.println(data);
				
			}
			myReader.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
		
		System.out.println();
		System.out.println();
		
	}

}