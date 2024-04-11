package employee;

public class CompanyNameMisMatchException extends RuntimeException {
	public String toString()
	{
		return "CompanyName should be Wipro or TCS or HCL ot Infosys";
	}
}
