package employee;

public class ExperienceOutOfBoundsException extends RuntimeException {
	  public String toString()
	    {
	    	return "Experience should be in Range of 1 to 5 only";
	    }
}
