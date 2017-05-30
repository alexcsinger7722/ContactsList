package contactslist;

public class contacts {

	private String firstName = "A";
	private String lastName;
	private String address;
	private String email;
	private String phone;
	private String notes;
	private int id;
	
	contacts(String fname, String lname, String addr, String emailAddr, String phoneNumber, String note, int idNo){
		
		firstName = fname;
		lastName = lname;
		address = addr;
		email = emailAddr;
		phone = phoneNumber;
		notes = note;
		id = idNo;
	
	}
	public String printList(){
	
		return "Contact no: " + id + "\nFirst Name: " + firstName + "\nLast Name: " + lastName + "\nAddress: " + address + "\nEmail: " + email + "\nPhone: " + phone + "\nNotes: " + notes + "\n\n";
		
	}
	
	public boolean isLastName(String name){
	
		if(name == lastName){
			return true;
		}
		else{
			return false;
		}
	}
	
}
