package contactslist;

import java.util.ArrayList;

public class main {

	public static ArrayList<contacts> list;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//System.out.print(list.printList());
		list = new ArrayList<contacts>();

		loadFromDisk();
		
		addContact("Stephen", "Knotts", "2279 St Francis Drive, Palo Alto, CA", "Stephkno@gmail.com", "6503873030", "me", list.size());
		addContact("Jack", "Gaul", "232 Dwight Road, Burlingame, CA", "jack.tone.gaul@gmail.com", "6507737159", "jack", list.size());
		addContact("Alex", "Singer", "211 Dayview Drive", "alexandersinger@outlook.com", "6505551234", "alex", list.size());

		printList();
		
		getContactByLastName("Knotts");

		
	}
	
	public static void addContact(String fname, String lname, String addr, String email, String phone, String note, int idNo){
		
		contacts newcontact = new contacts(fname, lname, addr, email, phone, note, idNo);
		list.add(newcontact);
				
	}
	
	public static void getContactByLastName(String lname){
		
		contacts foundContact = null;
		
		for(contacts c : list){
			
			if(c.isLastName(lname)){
				
				foundContact = c;
				
			}
			
		}
		
		if(foundContact != null){
			
			System.out.print("Found contact with last name " + lname + ": ");
			System.out.print("\n\n" + foundContact.printList());
		
		}
		else{
		
			System.out.print("\nContact " + lname + " not found.");
		
		}
		
	}
	
	public static void saveAndQuit(){
		
	}
	
	public static void loadFromDisk(){
		
	}
	
	public static void printList(){
		
		for(contacts c : list){
		
			System.out.print(c.printList());
				
		}
	}
}
