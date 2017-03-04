/*  
 * Admin Class (Ravpreet Kaur)
 * */
package classes;

//import java.util.Calendar;
public class Admin extends Person {

    private String adminId;
    private String jobTitle;
//	private Calendar bookedDate;

    // Constructors to initialize the Instance Variables
    // Default Constructor
    //	==> Called when a Name object is created as follows -
    //        Name n1 = new Name();
    public Admin() {
        super();
        adminId = jobTitle = "";
        //bookedDate =  Calendar.getInstance();
    }

    // Initialization Constructor
    // ==> Called when a Name object is created as follows -
    //       Name n2 = new Name("Mr","Joe","Cole");
    public Admin(String firstName, String surname, int age, String address, String adminId, String jobTitle) throws IllegalArgumentException {
        super(firstName, surname, address);
        setAdminId(adminId);
        setJobTitle(jobTitle);
        //bookedDate = Calendar.getInstance();
    }

    /**
     * @param adminId the adminId to set
     */
    public void setAdminId(String adminId) throws IllegalArgumentException {
        if (adminId.equals("null") || (adminId.isEmpty())) {
            throw new IllegalArgumentException("Input is Invalid. Please enter again");
        }
        this.adminId = adminId;
    }

    /**
     * @return the adminId
     */
    public String getAdminId() {
        return adminId;
    }

    /**
     * @param jobTitle the jobTitle to set
     */
    public void setJobTitle(String jobTitle) throws IllegalArgumentException {
        if (jobTitle.equals("null") || (jobTitle.isEmpty())) {
            throw new IllegalArgumentException("Input is Invalid. Please enter again");
        }
        this.jobTitle = jobTitle;
    }

    /**
     * @return the jobTitle
     */
    public String getJobTitle() {
        return jobTitle;
    }
}
