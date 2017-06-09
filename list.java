package contacts;

import java.io.*;
import java.util.*;

//one instance of this class represents the list of contacts.

public class list implements Serializable {
	
	public static ArrayList<contacts> list = new ArrayList<contacts>();

	list(){
		
		
	}

	public static void addContact(String fname, String lname, String addr, String emailAddr, String phoneNumber, String note){

		int idNo = list.size();
		
		contacts newcontact = new contacts(fname, lname, addr, emailAddr, phoneNumber, note, idNo);
		list.add(newcontact);

		
			
	}
	
	public static void findByLastName(String lastName){
		contacts foundContact = null;
		
		for(contacts c : list){

			if(c.isLastName(lastName)){
				
				foundContact = c;
				
			}
			
		}
		
		if(foundContact != null){
			
			System.out.print("Found contact with last name " + lastName + ": ");
			System.out.print("\n\n" + foundContact.printList());
		
		}
		else{
		
			System.out.print("\nContact " + lastName + " not found.");
		
		}
		
		
	}
	
	public static ArrayList<contacts> returnList(){
		return list;
	}
	
}
