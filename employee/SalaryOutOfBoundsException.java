package employee;

public class SalaryOutOfBoundsException extends RuntimeException {
	public String toString()
    {
   	 return "Salary should be in Range of 15k to 90k";
    }

}
