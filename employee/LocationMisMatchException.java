package employee;

public class LocationMisMatchException extends RuntimeException {
	   public String toString()
	   {
		   return "Location must be in hyderabad or Banglore or Chennai";
	   }

}
