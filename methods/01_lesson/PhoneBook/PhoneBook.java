import javax.swing.*;
import java.util.*;
import java.io.*;

//This was created by Stephen "Saybaw" Sabaugh
public class PhoneBook {

	public static void main(String[] args) {
		try {
			menu();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
	public static void addName(ArrayList <String> names, String name){
		names.add(name);
	}
	public static void addPhone(ArrayList <String> phones, String phone){
		phones.add(phone);
	}
	public static void addMail(ArrayList <String> mails, String mail){
		mails.add(mail);
	}
	public static ArrayList <String> getContactData() throws FileNotFoundException {
		Scanner readData = new Scanner(new FileReader("names.txt")).useDelimiter(",");
		String dataStr;
		ArrayList <String> list = new ArrayList <String>();
		
		while(readData.hasNext()) {
			dataStr = readData.next();
			addName(list, dataStr);
		}
		readData.close();
		return list;
	}
	public static ArrayList <String> getPhoneData() throws FileNotFoundException {
		Scanner readData = new Scanner(new FileReader("numbers.txt")).useDelimiter(",");
		String dataStr;
		ArrayList <String> list = new ArrayList <String>();
		
		while(readData.hasNext()) {
			dataStr = readData.next();
			addPhone(list, dataStr);
		}
		readData.close();
		return list;
	}
	public static ArrayList <String> getMailData() throws FileNotFoundException {
		Scanner readData = new Scanner(new FileReader("addresses.txt")).useDelimiter(",");
		String dataStr;
		ArrayList <String> list = new ArrayList <String>();
		
		while(readData.hasNext()) {
			dataStr = readData.next();
			addMail(list, dataStr);
		}
		readData.close();
		return list;
	}
	public static void 
	addContact(ArrayList <String> contacts, ArrayList <String> numbers, ArrayList <String> addresses)
			throws IOException {
		String answerStr = JOptionPane.showInputDialog("Enter contact's name:");
		addName(contacts, answerStr);
		saveData(answerStr,"names.txt");
		answerStr = JOptionPane.showInputDialog("Enter contact's number:");
		addPhone(numbers, answerStr);
		saveData(answerStr,"numbers.txt");
		answerStr = JOptionPane.showInputDialog("Enter contact's address:");
		addMail(addresses, answerStr);
		saveData(answerStr,"addresses.txt");
		
	}
	public static void saveData(String data, String file) throws IOException {
		FileWriter fw = new FileWriter(file, true);
		BufferedWriter dataWriter = new BufferedWriter(fw);
		dataWriter.write("," + data);
		dataWriter.close();
		fw.close();
	}
	public static void menu() throws IOException {
		ArrayList <String> contacts = getContactData();
		ArrayList <String> numbers = getPhoneData();
		ArrayList <String> addresses = getMailData();
		String userChoice = "";
		int userChoiceInt;
		
		do {
			for(int i = 0;i < contacts.size();i++) {
				System.out.println("" + (i + 1) + " : " + contacts.get(i));
			}
			printSpace(5);
			userChoice = JOptionPane.showInputDialog("Enter the number next to the contact name for"
					+ "contact info or enter 'a' to add a new contact");
			
			if (userChoice.equals("a")) {
				addContact(contacts, numbers, addresses);
				contacts = getContactData();
				numbers = getPhoneData();
				addresses = getMailData();
				printSpace(5);
				
				for(int i = 0;i < contacts.size();i++) {
					System.out.println("" + (i + 1) + " : " + contacts.get(i));
				}
			}
			userChoiceInt = userChoice.equals("a") ? contacts.size() : Integer.parseInt(userChoice);
			
			JOptionPane.showMessageDialog(null, "Name: " + contacts.get(userChoiceInt - 1) 
			+ "\n" + "Number: " + numbers.get(userChoiceInt - 1)
			+ "\n" + "Address: " + addresses.get(userChoiceInt - 1));
			printSpace(5);
			
		} while ((userChoiceInt > 0 && userChoiceInt < contacts.size() + 1)
				|| (userChoice == "a"));
		
	}
	public static void printSpace(int lines) {
		for(int i = 0;i < lines + 1;i++) {
			System.out.println();
		}
	}
	//ArrayList <String> contacts, ArrayList <String> numbers, ArrayList <String> addresses

}
