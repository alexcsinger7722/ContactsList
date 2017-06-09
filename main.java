package contacts;

import java.io.*;


import java.util.ArrayList;
import java.awt.*;

//one instance of this class represents one the main function of our program which includes test cases
public class main{
	
	public static list contactList = new list();
	
	public static void main(String[] args) {
		
		
		loadFromDisk();
		
//		contactList.addContact("Stephen", "Knotts", "2279 St Francis Drive, Palo Alto, CA", "Stephkno@gmail.com", "6503873030", "me");
//		contactList.addContact("Jack", "Gaul", "232 Dwight Road, Burlingame, CA", "jack.tone.gaul@gmail.com", "6507737159", "jack");
//		contactList.addContact("Alex", "Singer", "211 Dayview Drive", "alexandersinger@outlook.com", "6505551234", "alex");

		//printList();
		
		//list.findByLastName("Knotts");

		//saveAndQuit();
	//	contactList = null;
		//loadFromDisk();
		contactList.returnList();
	}
	
	public static void saveAndQuit(){
	    FileOutputStream outFile;
	    ObjectOutputStream outObject;

		try  {
			
	         outFile = new FileOutputStream ("list");
	         outObject = new ObjectOutputStream(outFile);
	         
	         System.out.print(contactList.returnList());

	         outObject.writeObject(contactList);
	 		 outFile.close();
	         outObject.close();      
	         
	         System.out.print("Done");
	         
	      } catch (IOException ioe)  {
	      
	    	  System.out.println ("Error writing objects to the file: "+ ioe.toString());
	      
	      }
		
	}
	
	/**
	 * 
	 */
	public static void loadFromDisk(){
	
		FileInputStream inFile;
	    ObjectInputStream inObject;

	      try  {
	         inFile = new FileInputStream("list");      
	         inObject = new ObjectInputStream(inFile);
	         
	         contactList = (list)inObject.readObject();
	         
	         System.out.print(contactList);
	         
	         inFile.close();
	         inObject.close();
	         
	      } catch(IOException ioe)  {
	         System.out.println ("Error reading from the file: " + ioe.getMessage());
	      } catch (ClassNotFoundException cnfe)  {
	         System.out.println ("Error in casting to Rectangle: " + cnfe);
	      }                      
	      
	}
	
	public static void printList(){
		
		for(contacts c : contactList.returnList()){
		
			System.out.print(c.printList());
				
		}
	}
	public static void print(String str){
		System.out.print(str);
	}
	
}
	
/*
Contact no: 0
First Name: Stephen
Last Name: Knotts
Address: 2279 St Francis Drive, Palo Alto, CA
Email: Stephkno@gmail.com
Phone: 6503873030
Notes: me

Contact no: 1
First Name: Jack
Last Name: Gaul
Address: 232 Dwight Road, Burlingame, CA
Email: jack.tone.gaul@gmail.com
Phone: 6507737159
Notes: jack

Contact no: 2
First Name: Alex
Last Name: Singer
Address: 211 Dayview Drive
Email: alexandersinger@outlook.com
Phone: 6505551234
Notes: alex

Found contact with last name Knotts: 

Contact no: 0
First Name: Stephen
Last Name: Knotts
Address: 2279 St Francis Drive, Palo Alto, CA
Email: Stephkno@gmail.com
Phone: 6503873030
Notes: me
*/
