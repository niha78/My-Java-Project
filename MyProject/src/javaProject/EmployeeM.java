package javaProject;
import java.util.ArrayList;
import java.util.Scanner;
class Employee1 {
	private int id;
	private String name;
	private String designation;
	private int age;
	private double salary;
	private String email;
	public Employee1(int id, String name, String designation, int age, double salary, String email) {
		this.id = id;
		this.name = name;
		this.designation=designation;
		this.age=age;
		this.salary = salary;
		this.email=email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation=designation;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
//  @Override
//  	public String toString() {
//	  return "Employee [Id=" + id + ", Name=" + name + ", Designation=" + designation + ", Age=" + age + ", Salary=" + salary + ", Email=" + email + "]";
//  		}
}
class EmployeeManagementSystem {
	private ArrayList<Employee1> employees = new ArrayList<Employee1>();
	Scanner sc = new Scanner(System.in);
		public void addEmployee() {
			System.out.print("Enter Employee ID: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter Employee Name: ");
			String name = sc.nextLine();
			System.out.print("Enter Employee Age: ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter Employee Designation: ");
			String designation = sc.nextLine();
			System.out.print("Enter Employee Salary: ");
			double salary = sc.nextDouble();
			System.out.print("Enter Employee Email: ");
			String email = sc.next();
			sc.nextLine();
			Employee1 em = new Employee1(id, name, designation, age, salary, email);
			employees.add(em);
			System.out.println("Employee added successfully!");
		}
		public void deleteEmployee() {
			System.out.print("Enter Employee ID to delete : ");
			int deleteId = sc.nextInt();
			sc.nextLine();
			for(Employee1 employee:employees) {
				if(employee.getId()==deleteId) {
					employees.remove(employee);
					System.out.println("Employee deleted successfully");
					return;
				}
			}
			System.out.println("Employee with the given ID = " +deleteId+" not found.\nEnter valid ID");
		}
		public void updateEmployee() {
			System.out.print("Enter Employee ID to update: ");
            int updateId = sc.nextInt();
            sc.nextLine();
			int flag=1;
	        for(Employee1 em : employees) {
	        	if(em.getId()==updateId) {
	    			System.out.println("Enter new details");
	                System.out.print("Enter Employee Salary: ");
	                em.setSalary(sc.nextDouble());
	                sc.nextLine();
	                System.out.print("Enter Employee Designation: ");
	                em.setDesignation(sc.nextLine());
	                System.out.println("Employee updated successfully!");
	                flag=0;
	                break;
	        	}
	       }
			if(flag==1) {
				System.out.println("Employee with the given ID= " +updateId+" not found.\nEnter valid ID");
			}
		}
		public void viewWithId() {
			System.out.println("Enter ID to view the employee");
			int viewId = sc.nextInt();
			sc.nextLine();
			int flag=1;
			for(int i=0; i< employees.size();i++) {
				Employee1 em = employees.get(i);
				if(em.getId()==viewId) {
					System.out.println(" _______________________________________________________________________________________________________ ");
					System.out.println();
				    System.out.printf("| %-5s | %-20s | %-20s | %-10s | %-5s | %-25s |\n", "ID", "Name", "Designation", "Age", "Salary", "Email");
				    System.out.println(" _______________________________________________________________________________________________________ ");
				    
				    // Display each employee's details in the table
				    System.out.println();
				    System.out.printf("| %-5d | %-20s | %-20s | %-5d | %-10.2f | %-25s |\n",
				                           em.getId(), em.getName(), em.getDesignation(), em.getAge(), em.getSalary(), em.getEmail());

				    System.out.println(" _______________________________________________________________________________________________________ ");
				    System.out.println();
				    flag=0;
				    break;
				}
			}
			if(flag==1) {
				System.out.println("Employee with the given ID= " +viewId+" not found.\nEnter valid ID");
			}
		}
//		public void displayEmployees() {
//			for (Employee1 em : employees) {
//				System.out.println(em);
//			}
//		}
		 public void addDummyData() {
		        Employee1 emp1 = new Employee1(101, "vyshu", "Manager", 22, 60000.00, "vyshu123@gmail.com");
		        Employee1 emp2 = new Employee1(102, "Niharika", "Web Developer", 22, 52000.00, "niharika23@gmail.com");
		        Employee1 emp3 = new Employee1(103, "Akshara", "Analyst", 22, 55000.00, "akshara56@gmail.com");
		        Employee1 emp4 = new Employee1(104, "Bhargavi", "HR Specialist", 21, 52000.00, "bhargavi78@gmail.com");
		        Employee1 emp5 = new Employee1(105, "Chandana", "Developer", 23, 52000.00, "chandana98@gmail.com");
		        // Add employees to the employees list
		        employees.add(emp1);
		        employees.add(emp2);
		        employees.add(emp3);
		        employees.add(emp4);
		        employees.add(emp5);
		    }
		public void displayEmployees() {
			System.out.println("List of Employees :");
		    // Table header
		    System.out.println(" _______________________________________________________________________________________________________ ");
		    System.out.println();
		    System.out.printf("| %-5s | %-20s | %-20s | %-10s | %-5s | %-25s |\n", "ID", "Name", "Designation", "Age", "Salary", "Email");
		    System.out.println(" _______________________________________________________________________________________________________ ");

		    // Display each employee's details in the table
		    for (Employee1 em : employees) {
		    	System.out.println();
		        System.out.printf("| %-5d | %-20s | %-20s | %-5d | %-10.2f | %-25s |\n",
		                           em.getId(), em.getName(), em.getDesignation(), em.getAge(), em.getSalary(), em.getEmail());
		    }

		    System.out.println(" _______________________________________________________________________________________________________ ");
		    System.out.println();
		}

	}
public class EmployeeM {
	public static void main(String[] args) {
		EmployeeManagementSystem ems = new EmployeeManagementSystem();
		ems.addDummyData();
		Scanner read = new Scanner(System.in);
			
			while(true) {
				System.out.println("\n************** Employee Management System **************");
				System.out.println("              1. Add Employee                       ");
				System.out.println("              2. Delete Employee                    ");
				System.out.println("              3. View a Specific Employee           ");
				System.out.println("              4. Display All Employees              ");
				System.out.println("              5. Update Employees                   ");
				System.out.println("              6. Exit                               ");
				System.out.println("*********************************************************");
				System.out.print("Enter your choice: ");
				int ch=read.nextInt();
				switch (ch) {
				case 1:
					ems.addEmployee();
					break;
				case 2:
					ems.deleteEmployee();
					break;
				case 3:
					ems.viewWithId();
					break;
				case 4:
					ems.displayEmployees();
					break;
				case 5:
                    ems.updateEmployee();
                    break;
				case 6:
					System.out.println("Thank You For Accessing Our Application. Kindly visit again..");
					System.out.println("----------------------------- Exit ----------------------------------");
					System.exit(0);
				default:
					System.out.println("Invalid choice. Please enter a valid option");
					break;
				}
			}
		}
	}

