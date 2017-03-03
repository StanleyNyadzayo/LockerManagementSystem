/*  
 * LockerCollection Class (Johnny O' Neill)
 * */

package classes;

import java.util.ArrayList;

public class LockerCollection {

    // to do: this will need to be set using a get to the data access layer
    private ArrayList<Locker> allLockers = new ArrayList<Locker>();

    public ArrayList<Locker> viewAvailableLockers() {

        ArrayList<Locker> availLockers = new ArrayList<Locker>();

        for (Locker l : allLockers) {
            if (l.getStatus() == Status.LockerStatus.AVAILABLE.toString()) {
                availLockers.add(l);
            }
        }

        return availLockers;
    }

    public ArrayList<Locker> viewBookedLockers() {

        ArrayList<Locker> bookedLockers = new ArrayList<Locker>();

        for (Locker l : allLockers) {
            if (l.getStatus() == Status.LockerStatus.BOOKED.toString()) {
                bookedLockers.add(l);
            }
        }

        return bookedLockers;
    }

}
