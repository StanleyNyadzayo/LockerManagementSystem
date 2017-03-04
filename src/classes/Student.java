/*  
 * Student Class (Ravpreet Kaur)
 * */
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

    // Constructors to initialize the Instance Variables
    // Default Constructor 
    //	==> Called when a Name object is created as follows - 
    //        Name n1 = new Name();
    public Student() {
        super();
        lno = "";
        course = paymentStatus = "";
        year = 0;
        //holdDate =  Calendar.getInstance();
        quotaBalance = 0.0;
    }

    // Initialization Constructor
    // ==> Called when a Name object is created as follows - 
    //       Name n2 = new Name("Mr","Joe","Cole");
    public Student(String lno, String firstName, String surname, int age, String address, String course, int year, String paymentStatus, double quotaBalance) throws IllegalArgumentException {
        super(firstName, surname, address);
        //   setLNumber(lno);
        setCourse(course);
        setYear(year);
        //holdDate = Calendar.getInstance();
        setPaymentStatus(paymentStatus);
        setQuotaBalance(quotaBalance);
    }

    /**
     * @param lno the lno to set
     */
//    public void setLNumber(int lno) throws IllegalArgumentException {
//        if (lno == null) || (lno.isEmpty() == true)) {
//            throw new IllegalArgumentException("Input is Invalid. Please enter again");
//        }
//        this.lno = lno;
//    }

    /*
     * @param lno the lno to set
     *
//    public void setSQLLNumber(int lno) throws IllegalArgumentException {
//        if (lno.equals("null") || (lno.isEmpty() == true)) {
//            throw new IllegalArgumentException("Input is Invalid. Please enter again");
//        }
//        this.lno = lno;
//    }
*/

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
        if (course.equals("null") || (course.isEmpty())) {
            throw new IllegalArgumentException("Input is Invalid. Please enter again");
        }
        this.course = course;
    }

    /**
     * @return the course
     */
    public String getCourse() {
        return course;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) throws IllegalArgumentException {
        if (year < Calendar.YEAR) {
            throw new IllegalArgumentException("Input is Invalid. Please enter again");
        }
        this.year = year;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param paymentStatus the paymentStatus to set
     */
    public void setPaymentStatus(String paymentStatus) throws IllegalArgumentException {
        if (paymentStatus.equals("null") || (paymentStatus.isEmpty())) {
            throw new IllegalArgumentException("Input is Invalid. Please enter again");
        }
        this.paymentStatus = paymentStatus;
    }

    /**
     * @return the paymentStatus
     */
    public String getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * @param quotaBalance the quotaBalance to set
     */
    public void setQuotaBalance(double quotaBalance) throws IllegalArgumentException {
        if (quotaBalance <= 0.0) {
            throw new IllegalArgumentException("Quota is too low");
        }
        this.quotaBalance = quotaBalance;
    }

    /**
     * @return the quotaBalance
     */
    public double getQuotaBalance() {
        return quotaBalance;
    }

    /**
     * @return the full details of Person
     */
    @Override
    public String toString() {
        return "Student--> ID: " + lno + super.toString() + ",   PaymentStatus: " + paymentStatus + ",   QuotaBalance: " + quotaBalance;
    }
}