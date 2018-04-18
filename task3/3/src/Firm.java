import java.util.*;
public class Firm {

	public static void main(String[] args) {
		
		
		Employee employee1 = new Employee("Tom", "Smith", "M", "Engineer");
		Employee employee2 = new Employee("John", "	Brown", "M", "Junior programmer");
		Employee employee3 = new Employee("Julia", "Miller", "F", "Senior programmer");
		Employee employee4 = new Employee("Rohn", "Morris", "M", "Business analyst");
		Employee employee5 = new Employee("Alex", "Martin", "M", "Tester");
		Employee employee6 = new Employee("Dick", "Watson", "M", "Director");
		
		employee1.setlogin("TOM", "qwerty");
		employee6.setlogin("DICK", "asdfg");
		employee1.info();
		System.out.println("And other employees..");
	
		employee1.setsalary(500);
		employee2.setsalary(200);
		employee3.setsalary(400);
		employee4.setsalary(400);
		employee5.setsalary(300);
		employee6.setsalary(600);
		
		int total = employee1.getsalary() + employee2.getsalary() + 
			employee3.getsalary() + employee4.getsalary() + 
				employee5.getsalary() + employee6.getsalary();
		
		
		System.out.println("\nTotal proceeds: " + total);

	}

	
	public static class Person{
		protected String name;
		protected String surname; 
		protected String gender;
		
		public String getname(){
        return name;
	}
		public String getsurname(){
        return surname;
    }
		public String getgender(){
        return gender;
	}
		public Person(String name, String surname, String gender) {
			
			this.name =name;
			this.surname = surname;
			this.gender = gender;
		}
		}
	
	
	public static class Employee extends Person{
		
		private String position;
		private Login login;
		private int salary;
				
		public Employee(String name, String surname, String gender, String position) {
			super(name, surname, gender);
			this.position = position;
			
		}
	
		public void setposition(String newposition){
			position = newposition;
		}
	
		public String getposition(){
			return position;
		}
		
		public void setlogin(String l, String p){
			login = new Login(l, p);
			
		}
	
		public Login getlogin(){
			return login;
		}
		
		public void setsalary(int newsalary){
			if (salary != 0)  
				salary = salary + newsalary;
				else salary = newsalary;
		}
		
		public int getsalary(){
			return salary;
		}
		
		public void info() {
			System.out.println("Name: " + super.getname() + "\nSurname: " + super.getsurname() 
			+ "\nGender: "+ super.getgender() + "\nProfession: " + this.position);
			
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
	
}
