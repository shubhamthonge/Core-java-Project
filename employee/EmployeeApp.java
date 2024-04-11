package employee;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.ListIterator;

public class EmployeeApp {
    Scanner sc = new Scanner(System.in);
    ArrayList<EmployeeObject> al = new ArrayList<EmployeeObject>();
    
    //Adding Employee Details
	 public void addEmployeeDetails(EmployeeObject e)
	 {
		 al.add(e);
		 System.out.println("Employee Details Added Successfully");
	 }
	 
	 //display details
	 public void displayEmployeeDeatils()
	 {
		 if(al.isEmpty()) {
			 System.out.println("*******No Employee Details********");
		 }
		 else {
			 for(EmployeeObject e : al)
			 {
				 System.out.println("*******Employee Details********");
				 System.out.println("Employee Name : "+e.getEmp_name());
				 System.out.println("Employee Id : "+e.getEmp_id());
				 System.out.println("Employee Salary : "+e.getSalary());
				 System.out.println("Employee Experience : "+e.getExperience());
				 System.out.println("Employee Location : "+e.getLocation());
				 System.out.println("Employee Comapany Name : "+e.getCompany_name());
				 System.out.println("Employee Designation : "+e.getDesignation());
			 }
		 }

	 }
	 //Search Employee Based On Experience
	 public void searchEmployeeBasedOnExperience(double exp)
	 {
		 boolean status = false;
		 if(al.isEmpty())
		 {
			 System.out.println("No Employees Details are there");
		 }
		 else
		 {
			 for(EmployeeObject e : al)
			 {
				 if(e.getExperience() == exp)
				 {
					 e.display();
					 status = true;
				 }
			 }
		 }
		 if(status == false)
		 {
			 System.out.println("No Employee Found with the given Experience");
		 }
	 }
	 
	 //search an employee based on salary and Designation
	 public void searchEmployeeBasedOnSalaryAndDesignation(int salary,String designation)
	 {
		 boolean status = false;
		 if(al.isEmpty())
		 {
			 System.out.println("No Employees Details are there");
		 }
		 else
		 {
			 for(EmployeeObject e : al)
			 {
				 if(e.getSalary() == salary && e.getDesignation().equalsIgnoreCase(designation))
				 {
					 e.display();
					 status = true;
				 }
			 }
		 }
		 if(status == false)
		 {
			 System.out.println("No Employee Found with the given Salary and designation");
		 }
	 }
	 
	 //update employee salary and Experience
	 public void updateEmployeeSalaryBasedOnExperience(double experience)
	 {
		 boolean status = false;
		 if(al.isEmpty())
		 {
			 System.out.println("No Employees Details are there");
		 }
		 else
		 {
			 for(EmployeeObject e : al)
			 {
				 if(e.getExperience() == experience)
				 {
					 System.out.println("Enter the Salary that you want to Update");
					 int salary = sc.nextInt();
					 while(true)
					 {
						 try
						 {
							e.setSalary(salary);
							status=true;
							System.out.println("Employee salary is updated");
							break;
						 }
						 catch(SalaryOutOfBoundsException e1)
						 {
							 System.out.println("Enter the Valid Salary");
							 salary = sc.nextInt();
						 }
					 }
				 }
			 }
		 }
		 if(status == false)
		 {
			 System.out.println("No Employee Found with the given Experience");
		 }
	 }
	 
	 //Update Company Name Based on Salary
	 public void updateCompanyNameBasedOnSalary(int salary)
	 {
		 boolean status = false;
		 if(al.isEmpty())
		 {
			 System.out.println("No Employees Details are there");
		 }
		 else
		 {
			 for(EmployeeObject e : al)
			 {
				 if(e.getSalary() == salary)
				 {
					 System.out.println("Enter the Comapany Name that you want to Update");
					 String companyName = sc.next();
					 while(true)
					 {
						 try
						 {
							 e.setCompany_name(companyName);
							 status = true;
							 break;
						 }
						 catch(CompanyNameMisMatchException e1)
						 {
							 System.out.println("Enter the Valid CompanyName");
							 salary = sc.nextInt();
						 }
					 }
					 System.out.println("Enter the Employee Id after updatating the Company Name");
					 String id = sc.next();
					 while(true)
					 {
						 try
						 {
							 e.setEmp_id(id, companyName);
							 status = true;
							 break;
						 }
						 catch(EmployeeMisMatchException e1)
						 {
							 System.out.println("Enter the Valid Employee Id");
							 salary = sc.nextInt();
						 }
					 }
				 }
			 }
		 }
		 if(status == false)
		 {
			 System.out.println("No Employee Found with the given Salary");
		 }
	 }
	 
	 //Remove the Employee Based on Employee id
	 public void removeTheEmployeeBasedOnEmployeeId(String id)
	 {
		 boolean status = false;
		 if(al.isEmpty())
		 {
			 System.out.println("No Employees Details are there");
		 }
		 else
		 {
			 ListIterator<EmployeeObject> li = al.listIterator();
			 while(li.hasNext())
			 {
				 EmployeeObject empId = li.next();
				 String cid=empId.getEmp_id();				 
				 if(cid.equalsIgnoreCase(id));
				 {
					 li.remove();
					 status = true;
					 System.out.println("----------Employees Details are removed----------");
				 }
			 }
		 }
		 if(!status)
		 {
			 System.out.println("No Employee Deatils is Removed");
		 }
	 }
	 
    public static void main(String[] args) 
    {
      // ArrayList<EmployeeObject> al = new ArrayList<EmployeeObject>();
		Scanner s = new Scanner(System.in);
		EmployeeApp emp = new EmployeeApp();
		
		boolean status = true;
		while(status)
		{
			System.out.println("Select Which Opertaion you want to Perform");
			System.out.println("1.Add Employee Details");
			System.out.println("2.Display Employee Details");
			System.out.println("3.Search Employee Based on Experience ");
			System.out.println("4.Search an Experience Based on Salary and Designation");
			System.out.println("5.Update Employee Salary Based on Experience");
			System.out.println("6.Update CompanyName Based on Salary");
			System.out.println("7.Remove the Employee Based on Employee id");
			System.out.println("8.Exit");
			System.out.println("Select any Option");
			int option = s.nextInt();
			switch(option)
			{
			case 1:
			{
				     System.out.println("Enter the Employee Name ");
				     String name = s.next();
				     System.out.println("Enter the Employee Id");
				     String id = s.next();
					 System.out.println("Enter the Employee Salary");
					 int salary = s.nextInt();
					 System.out.println("Enter the Experience");
					 double experience = s.nextDouble();
					 System.out.println("Enter the Location");
					 String location = s.next();
					 System.out.println("Enter the Comapany Name");
					 String companyName = s.next();
					 System.out.println("Enter the Designation");
					 String designation = s.next();
					 while(true)
					 {
						 try
						 {
							 emp.addEmployeeDetails(new EmployeeObject(name,id,salary,experience,location,companyName,designation));
							 break;
						 }
						 catch(InvalidName e1)
						 {
			                 System.out.println("Enter the Valid Name");
			                 name = s.next();
						 }
						 catch(EmployeeMisMatchException e2)
						 {
							 System.out.println("Enter the Valid Employee Id");
							 id = s.next();
						 }
						 catch(SalaryOutOfBoundsException e3)
						 {
							 System.out.println("Enter the Valid Salary");
							 salary = s.nextInt();
						 }
						 catch(ExperienceOutOfBoundsException e4)
						 {
							 System.out.println("Enter the Valid Experience ");
							 experience = s.nextInt();
						 }
						 catch(LocationMisMatchException e)
						 {
							 System.out.println("Enter the Valid Location ");
							 location = s.next();
						 }
						 catch(CompanyNameMisMatchException e)
						 {
							 System.out.println("Entre the Valid Comapny Name ");
							 companyName = s.next();
						 }
						 catch(DesignationMisMatchException e)
						 {
							 System.out.println("Enter the Valid Designation");
							 designation = s.next();
					     }
				   }
				   
				break;
		    }
			case 2:
			{
				emp.displayEmployeeDeatils();
				System.out.println("---------------------------------");
				break;
			}
			case 3:
			{
				System.out.println("Entre the Experience");
				int experience = s.nextInt();
				emp.searchEmployeeBasedOnExperience(experience);
				System.out.println("--------------------------------");
				break;
			}
			case 4:
			{
				System.out.println("Enter the Salary");
				int salary = s.nextInt();
				System.out.println("Enter the Designation");
				String designation = s.next();
				emp.searchEmployeeBasedOnSalaryAndDesignation(salary, designation);
				System.out.println("--------------------------------");
				break;
			}
			case 5:
			{
				System.out.println("Enter the Experience");
				double	 exp = s.nextInt();
				EmployeeObject e = new EmployeeObject();
			    emp.updateEmployeeSalaryBasedOnExperience(exp);
			    System.out.println("--------------------------------");
				break;
			}
			case 6:
			{
				System.out.println("Enter the Salary");
				int salary = s.nextInt();
				while(true)
				{
					try
					{
						EmployeeObject e = new EmployeeObject();
						e.setSalary(salary);
						break;
					}
					catch(SalaryOutOfBoundsException e1)
					{
						System.out.println("Entre the Valid Salary");
						salary = s.nextInt();
					}
				}
				emp.updateCompanyNameBasedOnSalary(salary);
				System.out.println("----------------------------------");
				break;
			}
			case 7:
			{
				System.out.println("Enter the Employee Id to remove");
				String id = s.next();
				emp.removeTheEmployeeBasedOnEmployeeId(id);
				break;
			}
			case 8:
			{
				status = false;
				System.out.println("Thank You");
				break;
			}
			}
		}
    }


}
