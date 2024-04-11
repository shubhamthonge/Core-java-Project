package employee;

public class DesignationMisMatchException extends RuntimeException {
    public String toString()
    {
   	 return "Designation should be JavaDeveloper or UI developer";
    }

}
