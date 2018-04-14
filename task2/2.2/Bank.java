//import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Bank {


public static void main(String[] args) {

	Client first = new Client("Tom", 1, "123456");
	Account acc1 = new Account(1, "14.04.2018");
	acc1.setbalance(500);
	first.setaccount(acc1);
	System.out.println("Name: " + first.getname() + "\nPhone: " + first.getphone() + 
		"\nBalance: " + first.getaccount().getbalance());
	Branch Sber1 = new Branch("Qwer 1");
	Branch Sber2 = new Branch("Qwer 2");
	Sber1.addclients(first);
	System.out.println("Opened an account in: " + first.getbranch().getname());
	first.setlogin("TOM", "qwerty");
	System.out.println("Username: " + first.getlogin().getusername() + "\n" 
	+ "Password: " + first.getlogin().getpassword());
	Client second = new Client("John", 2, "789456");
	Sber1.addclients(second);
	Account acc2 = new Account(2, "12.03.2018");
	acc2.setbalance(1500);
	second.setaccount(acc2);
	System.out.println("Name: " + second.getname() + "\nPhone: " + second.getphone() + 
		"\nBalance: " + second.getaccount().getbalance());
	second.setlogin("JOHN", "wwwwwwwww");
	System.out.println("Username: " + second.getlogin().getusername() + "\n" 
	+ "Password: " + second.getlogin().getpassword());
	State state = new State();
	Client clients[] = new Client[5];
	clients[0] = first;
	clients[1] = second;
	state.showphones(clients); //номера телефонов
	System.out.println(Sber1.getclientscount() + " clients in " + 
		Sber1.getname()); 
}	

	public static class Client {
	
		private String name;
		private String phone;
		private int id;
		private Account account;
		private Branch branch;
		private Login login;
				
		public Client(String n, int ids, String p) {
			name = n;
			id = ids;
			phone = p;
		}
	
		public String getname(){
			return name;
		}
	
		public void setphone(String newphone){
			phone = newphone;
		}
	
		public String getphone(){
			return phone;
		}
	
	
		public void setaccount(Account a){
			account = a;
		}
	
		public Account getaccount(){
			return account;
		}
		
		public void setlogin(String l, String p){
			login = new Login(l, p);
			
		}
	
		public Login getlogin(){
			return login;
		}
		
		public void setbranch(Branch b){
			branch = b;
		}
		
		public  Branch getbranch(){
			return branch;
		}
	
	
	}
	
	private static class Login{
		private String username = "USERNAME";
		private String password = "PASSWORD";
		
		public Login(String l, String p){
			username = l;
			password = p;
		}
		
		public void setusername(String u){
			username = u;
		}
		
		public String getusername(){
			return username;
		}
		
		public void setpassword(String p){
			password = p;
		}
		
		public String getpassword(){
			return password;
		}
	}
	
	public static class Account { 
	
		private int balance;
		private String creationdate;
		private int Id;
	
		public Account(int id, String d){
		
			Id = id;
			creationdate = d;
		}
		public void setbalance(int newbalance) {
			if (balance != 0) 
				balance = balance + newbalance;
			else balance = newbalance;
		}
		private float getbalance(){
		
			return balance;
		}
	
	
	}
	
	public static class Branch implements Unit{
		private String name;
		private Set clients = new HashSet();
		
		public Branch(String n){
			name = n;
		}
		
		public void setname(String newname){
			name = newname;
		}
		
		public String getname(){
			return name;
		}
		
		public void addclients(Client newclient){
			clients.add(newclient);
			 // связываем клиента с определённым отделом банка
			newclient.setbranch(this);
		}
		
		public Set getclients(){
			return clients;
		}
		
		public int getclientscount(){
			return getclients().size();
		}
	}
	
	public static class State{
		private static int i = 0;
		public static void showphones(Client[] clients){
			System.out.println("List with clients' numbers: ");
			for (i=0; i<clients.length; i++){
				if (clients[i] instanceof Client) {
					System.out.println(clients[i].getname() + ": " + clients[i].getphone());
				}
			}
		}
	}
	
	public interface Unit{
		int getclientscount();
	}
}