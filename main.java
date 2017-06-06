package contactslist;

import java.io.*;

import java.util.ArrayList;

public class main {

	public static ArrayList<contacts> list;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//System.out.print(list.printList());
		
		list = new ArrayList<contacts>();

		loadFromDisk();
		
		//addContact("Stephen", "Knotts", "2279 St Francis Drive, Palo Alto, CA", "Stephkno@gmail.com", "6503873030", "me", list.size());
		//addContact("Jack", "Gaul", "232 Dwight Road, Burlingame, CA", "jack.tone.gaul@gmail.com", "6507737159", "jack", list.size());
		//addContact("Alex", "Singer", "211 Dayview Drive", "alexandersinger@outlook.com", "6505551234", "alex", list.size());

		printList();
		
		getContactByLastName("Knotts");

		//saveAndQuit();
	}
	
	public static void addContact(String fname, String lname, String addr, String email, String phone, String note, int idNo){
		
		contacts newcontact = new contacts(fname, lname, addr, email, phone, note, idNo);
		list.add(newcontact);
				
	}
	
	public static void getContactByLastName(String lname){
		
		contacts foundContact = null;
		String test1 = "False";
		//System.out.println(list);
		
		for(contacts c : list){
			//System.out.println(c.isLastName(lname));
			if(c.isLastName(lname)){
				
				print(c.printList());
				
				foundContact = c;
				test1 = "True";
				
			}
			
		}
		
		if(test1 == "True"){
			
			System.out.print("Found contact with last name " + lname + ": ");
			System.out.print("\n\n" + foundContact.printList());
		
		}
		else{
		
			System.out.print("\nContact " + lname + " not found.");
		
		}
		
	}
	
	public static void saveAndQuit(){
	    FileOutputStream outFile;
	    ObjectOutputStream outObject;

		try  {
	         outFile = new FileOutputStream ("/Users/stephen/list");      
	         outObject = new ObjectOutputStream(outFile);

	 		outObject.writeObject(list);

	 		 outFile.close();
	         outObject.close();      
	         
	         print("Done");
	         
	      } catch (IOException ioe)  {
	         System.out.println ("Error writing objects to the file: "+ ioe.toString());
	      }
		
	}
	
	public static void loadFromDisk(){
	
		FileInputStream inFile;
	    ObjectInputStream inObject;

	      try  {
	         inFile = new FileInputStream("/Users/stephen/list");      
	         inObject = new ObjectInputStream(inFile);
	         
	         list = (ArrayList<contacts>)inObject.readObject();
	         
	          inFile.close();
	         inObject.close();
	         
	      } catch(IOException ioe)  {
	         System.out.println ("Error reading from the file: " + ioe.getMessage());
	      } catch (ClassNotFoundException cnfe)  {
	         System.out.println ("Error in casting to Rectangle: " + cnfe);
	      }                      
	      
	}
	
	public static void printList(){
		
		for(contacts c : list){
		
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
