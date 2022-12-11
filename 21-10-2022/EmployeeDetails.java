class Employee
{
	private String employeeName;
	private int yearOfJoining;
	private int employeeSalary;
	private String employeeAddress;
    public String name;
    public String address;
	public void getEmployee()
	{	
		employeeName = name;
		yearOfJoining = year;
		employeeSalary = salary;
		employeeAddress = address;
	}
	public void showEmployee()
	{
		System.out.println(employeeName+""+yearOfJoining+""+employeeSalary+""+employeeAddress);
	}
}
public class EmployeeDetails
{
	private Employee[] employee;
	public void getEmployeeDetails()
	{
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		Employee[] emp = new Employee[number];
		for(int i =0;i<number;i++)
		{
			System.out.println("Enter Employee "+i+1+" Details :");
			Employee emp = new Employee();
			emp.getEmployee();
			employee[i] = emp;
		}
		this.emp = emp;
	}
	public void showEmployeeDetails()
	{
		
	}
}