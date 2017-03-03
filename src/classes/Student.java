package classes;

import java.util.Calendar;

public class Student extends Person {
    //instance variable
    private String lno;
    private String course;
    private int year;
    /*@SuppressWarnings("unused")
    private Calendar holdDate;*/
    private String paymentStatus;
    private double quotaBalance;
    private int number = 10600;

    // Constructors to initialize the Instance Variables
    // Default Constructor
    //	==> Called when a Name object is created as follows -
    //        Name n1 = new Name();
    public Student() {
        super();
        lno = "L00" + number++;
        course = paymentStatus = "";
        year = 0;
        //holdDate =  Calendar.getInstance();
        quotaBalance = 0.0;
    }

    // Initialization Constructor
    // ==> Called when a Name object is created as follows -
    //       Name n2 = new Name("Mr","Joe","Cole");
    public Student(String firstName, String surname, int age, String address, String lno, String course, int year, String paymentStatus, double quotaBalance) throws IllegalArgumentException {
        super(firstName, surname, age, address);
        lno = "L00" + number++;
        setCourse(course);
        setYear(year);
        //holdDate = Calendar.getInstance();
        setPaymentStatus(paymentStatus);
        setQuotaBalance(quotaBalance);
    }

    /**
     * @return the firstName
     */
    public String getLNumber() {
        return lno;
    }

    /**
     * @param course the course to set
     */
    public void setCourse(String course) throws IllegalArgumentException {
        if (course.equals("null") || (course.isEmpty() == true))
            throw new IllegalArgumentException("Input is Invalid. Please enter again");
        this.course = course;
    }

    /**
     * @return the firstName
     */
    public String getCourse() {
        return course;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) throws IllegalArgumentException {
        if (year < Calendar.YEAR)
            throw new IllegalArgumentException("Input is Invalid. Please enter again");
        this.year = year;
    }

    /**
     * @return the firstName
     */
    public int getYear() {
        return year;
    }

    /**
     * @param paymentStatus the paymentStatus to set
     */
    public void setPaymentStatus(String paymentStatus) throws IllegalArgumentException {
        if (paymentStatus.equals("null") || (paymentStatus.isEmpty() == true))
            throw new IllegalArgumentException("Input is Invalid. Please enter again");
        this.paymentStatus = paymentStatus;
    }

    /**
     * @return the firstName
     */
    public String getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * @param quotaBalance the quotaBalance to set
     */
    public void setQuotaBalance(double quotaBalance) throws IllegalArgumentException {
        if (quotaBalance <= 0.0)
            throw new IllegalArgumentException("Quota is too low");
        this.quotaBalance = quotaBalance;
    }

    /**
     * @return the firstName
     */
    public double getQuotaBalance() {
        return quotaBalance;
    }
}
