/*  
 * Person Class (Ravpreet Kaur)
 * */
package classes;

public class Person {

    //instance variable
    private String firstName;
    private String surname;
    private String address;

    // Constructors to initialize the Instance Variables
    // Default Constructor
    //	==> Called when a Name object is created as follows -
    //        Name n1 = new Name();
    public Person() {
        firstName = surname = address = "";

    }

    // Initialization Constructor
    // ==> Called when a Name object is created as follows -
    //       Name n2 = new Name("Mr","Joe","Cole");
    public Person(String firstName, String surname, String address) throws IllegalArgumentException {
        setFirstName(firstName);
        setSurname(surname);
        setAddress(address);
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) throws IllegalArgumentException {
        if (firstName.equals("null") || (firstName.isEmpty())) {
            throw new IllegalArgumentException("Input is Invalid. Please enter again");
        }
        this.firstName = firstName;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) throws IllegalArgumentException {
        if (surname.equals("null") || (surname.isEmpty())) {
            throw new IllegalArgumentException("Input is Invalid. Please enter again");
        }
        this.surname = surname;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }


    /**
     * @param address the address to set
     */
    public void setAddress(String address) throws IllegalArgumentException {
        if (address.equals("null") || (address.isEmpty())) {
            throw new IllegalArgumentException("Input is Invalid. Please enter again");
        }
        this.address = address;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @return the address
     */
    public String getFullName() {
        return firstName + " " + surname;
    }

    /**
     * @return the full details of Person
     */
    @Override
    public String toString() {
        return " Firstname: " + firstName + ",   Secondname: " + surname + ",   Address: " + address;
    }
}