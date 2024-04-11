package employee;

public class EmployeeObject {
	 private String emp_name;
	    private String emp_id;
	    private int salary;
	    private double experience;
	    private String location;
	    private String company_name;
	    private String designation;
	    
	    public EmployeeObject()
	    {
	    	
	    }
	    
	    
	    public EmployeeObject(String emp_name, String emp_id, int salary, double experience, String location,
				String company_name, String designation) throws InvalidName 
	    {
	    	
	    	boolean result = name(emp_name);
			boolean result1 = salary(salary);
			boolean result2 = experience(experience);
			boolean result3 = location(location);
			boolean result4 = companyName(company_name);
			boolean result5 = designation(designation);
			boolean result6 = employeId(emp_id,company_name);
			
			
			if(result)
			{
				this.emp_name = emp_name;
			}
			else
			{
				throw new InvalidName();
			}
			
			if(result1)
			{
				this.salary = salary;
			}
			else
			{
				throw new SalaryOutOfBoundsException();
			}
			
			if(result2)
			{
				this.experience = experience;
			}
			else
			{
				throw new ExperienceOutOfBoundsException();
			}
			
			if(result3)
			{
				this.location = location;
			}
			else
			{
				throw new LocationMisMatchException();
			}
			
			if(result4)
			{
				this.company_name = company_name;
			}
			else
			{
				throw new CompanyNameMisMatchException();
			}
			
			if(result5)
			{
				this.designation = designation;
			}
			else
			{
				throw new DesignationMisMatchException();
			}
			
			if(result6)
			{
				this.emp_id = emp_id;
	 		}
			else
			{
				throw new EmployeeMisMatchException();
			}
		}
	    
	    //Name Verification
	    private boolean name(String name)
	    {
	    	boolean status = false;
	    	for(int i=0;i<name.length();i++)
	    	{
	    	    char ch = name.charAt(i);
	    	    if(Character.isAlphabetic(ch))
	    	    {
	    	    	status = true;
	    	    }
	    	    else
	    	    {
	    	    	status = false;
	    	    	break;
	    	    }
	    	}
	    	if(status)
	    	{
	    		return true;
	    	}
	    	else
	    	{
	    		return false;
	    	}
	    }

	    //salaryVerification
	    private boolean salary(int salary)
	    {
			if(salary >= 15000 && salary <= 90000)
			{
				return true;
			}
			else
			{
				return false;
			}
	    }
		
		//ExperienceVerification
		private boolean experience(double experience)
		{
			if(experience>=1 && experience<=5)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		//LocationVerification
		private boolean location(String location)
		{
			if(location.equalsIgnoreCase("Hyderabad") || location.equalsIgnoreCase("Banglore") ||location.equalsIgnoreCase("Chennai"))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		//CompanyNameVerification
		private boolean companyName(String company)
		{
			if(company.equalsIgnoreCase("Wipro") || company.equalsIgnoreCase("TCS") || company.equalsIgnoreCase("Infosys") || company.equalsIgnoreCase("HCL"))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		//DesignationVerfication
		private boolean designation(String designation)
		{
			if(designation.equalsIgnoreCase("JavaDeveloper") || designation.equalsIgnoreCase("PegaDeveloper") || designation.equalsIgnoreCase("DBA") || designation.equalsIgnoreCase("Tester"))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		//Employee Id Verification
		private boolean employeId(String id,String companyName)
		{
			boolean status = false;
			String empId = companyName.substring(0, 3);
			String Comapanyname = id.substring(0, 3);
			if(Comapanyname.equalsIgnoreCase(empId))
			{
				for(int i=3;i<id.length();i++)
				{
					char c = id.charAt(i);
					if(Character.isDigit(c))
					{
						status = true;
					}
					else
					{
						status = false;
						break;
					}
				}
			}
			if(status)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		//Employee Information
		public void display()
		{
			System.out.println("********Employee Details***********");
			System.out.println("Employee Name : "+emp_name);
			System.out.println("Employee Id : "+emp_id);
			System.out.println("Employee Salary : "+salary);
			System.out.println("Employee Experience : "+experience);
			System.out.println("Employee Location : "+location);
			System.out.println("Employee CompanyName : "+company_name);
			System.out.println("Employee Designation : "+designation);
		}


		//Getter and Setter Method
		public String getEmp_name() {
			return emp_name;
		}
		
		

		public void setEmp_id(String emp_id,String companyName) 
		{
			boolean status = false;
			String empId = companyName.substring(0, 3);
			String Comapanyname = emp_id.substring(0, 3);
			if(Comapanyname.equalsIgnoreCase(empId))
			{
				for(int i=3;i<emp_id.length();i++)
				{
					char c = emp_id.charAt(i);
					if(Character.isDigit(c))
					{
						status = true;
					}
					else
					{
						status = false;
						break;
					}
				}
			}
			if(status)
			{
				this.emp_id = emp_id;
			}
			else
			{
				throw new EmployeeMisMatchException();
			}
			
		}


		public String getEmp_id() {
			return emp_id;
		}

		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) 
		{
			if(salary >= 15000 && salary <= 90000)
			{
				this.salary = salary;
			}
			else
			{
				throw new SalaryOutOfBoundsException();
			}
		}


		public double getExperience() {
			return experience;
		}


		public void setExperience(double experience) 
		{
			if(experience>=1 && experience<=5)
			{
				this.experience = experience;
			}
			else
			{
				throw new ExperienceOutOfBoundsException();
			}
			
		}


		public String getLocation() {
			return location;
		}


		public void setLocation(String location) {
			this.location = location;
		}


		public String getCompany_name() 
		{
			return company_name;
		}


		public void setCompany_name(String company_name) 
		{
			if(company_name.equalsIgnoreCase("Wipro") || company_name.equalsIgnoreCase("TCS") || company_name.equalsIgnoreCase("Infosys") || company_name.equalsIgnoreCase("HCL"))
			{
				this.company_name = company_name;
			}
			else
			{
				throw new CompanyNameMisMatchException();
			}
			
		}


		public String getDesignation() {
			return designation;
		}


		public void setDesignation(String designation) {
			this.designation = designation;
		}
		


}
