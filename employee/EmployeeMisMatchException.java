package employee;

public class EmployeeMisMatchException extends RuntimeException
	{
	    public String toString()
	    {
	    	return "First 3 Character Must be Same characters of Company Name";
	    }

}
