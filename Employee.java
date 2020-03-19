package assignment2;

public class Employee extends Member{
	
	String Specialization;
	
	public void methodforEmployee() {
	Employee emp=new Employee();
	 emp.name="employee";
	 emp.age=100;
	 emp.phonenumber="+990765gtgtrnyn5446";
	 emp.address="tfyvuihihnigufyf";
	 emp.salary=11;

	 System.out.println(emp.name);
	 System.out.println(emp.age);
	 System.out.println("this is employee phone number"+emp.phonenumber);

}
	int salary;
	int hoursWorked;
	public void displaySalary() {
		System.out.println("This is your salary : "+salary);
	}
	public void getInfo(int salary, int hoursWorked) {
		this.hoursWorked = hoursWorked;
		this.salary = salary;
	}
	public void addSal() {
		if(salary<500) {
			this.salary += 10;
		}
	}
	public void addWork() {
		if((hoursWorked/5)>6) {
			this.salary += 5;
		}
	}
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.getInfo(450, 45);
		emp.addSal();
		emp.addWork();
		emp.displaySalary();
	}
}