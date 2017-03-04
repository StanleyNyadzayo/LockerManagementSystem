/*  
 * Person Class (Ravpreet Kaur)
 * */
package classes;

public class Person {

    //instance variable
    public static String firstName;
    public static String surname;
    public static int age;
    public static String address;

    // Constructors to initialize the Instance Variables
    // Default Constructor
    //	==> Called when a Name object is created as follows -
    //        Name n1 = new Name();
    public Person() {
        firstName = surname = address = "";
        age = 0;

    }

    // Initialization Constructor
    // ==> Called when a Name object is created as follows -
    //       Name n2 = new Name("Mr","Joe","Cole");
    public Person(String firstName, String surname, int age, String address) throws IllegalArgumentException {
        setFirstName(firstName);
        setSurname(surname);
        setAge(age);
        setAddress(address);
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) throws IllegalArgumentException {
        if (firstName.equals("null") || (firstName.isEmpty() == true))
            throw new IllegalArgumentException("Input is Invalid. Please enter again");
        Person.firstName = firstName;
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
        if (surname.equals("null") || (surname.isEmpty() == true))
            throw new IllegalArgumentException("Input is Invalid. Please enter again");
        Person.surname = surname;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    public String getFullName() {
        return firstName + " " + surname;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) throws IllegalArgumentException {
        if (age <= 14 || age >= 95)
            throw new IllegalArgumentException("Input is Invalid. Please enter again");
        Person.age = age;
    }

    /**
     * @return the surname
     */
    public int getAge() {
        return age;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) throws IllegalArgumentException {
        if (address.equals("null") || (address.isEmpty() == true))
            throw new IllegalArgumentException("Input is Invalid. Please enter again");
        Person.address = address;
    }

    /**
     * @return the surname
     */
    public String getAddress() {
        return address;
    }


}
