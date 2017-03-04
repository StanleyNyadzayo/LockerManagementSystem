package classes;

//import java.util.Calendar;
public class Admin extends Person {

    public final String adminId;
    public String jobTitle;
    public int number = 1000;
    //private Calendar bookedDate;

    // Constructors to initialize the Instance Variables
    // Default Constructor
    //	==> Called when a Name object is created as follows -
    //        Name n1 = new Name();
    public Admin() {
        super();
        adminId = "A11" + number++;
        jobTitle = "";
        //bookedDate =  Calendar.getInstance();
    }

    // Initialization Constructor
    // ==> Called when a Name object is created as follows -
    //       Name n2 = new Name("Mr","Joe","Cole");
    public Admin(String firstName, String surname, int age, String address, String jobTitle) throws IllegalArgumentException {
        super(firstName, surname, age, address);
        adminId = "A11" + number++;
        setJobTitle(jobTitle);
        //bookedDate = Calendar.getInstance();
    }

    /**
     * @return the firstName
     */
    public String getAdminId() {
        return adminId;
    }

    /**
     * @param jobTitle the jobTitle to set
     */
    public void setJobTitle(String jobTitle) throws IllegalArgumentException {
        if (jobTitle.equals("null") || (jobTitle.isEmpty()))
            throw new IllegalArgumentException("Input is Invalid. Please enter again");
        this.jobTitle = jobTitle;
    }

    /**
     * @return the firstName
     */
    public String getJobTitle() {
        return jobTitle;
    }
}
