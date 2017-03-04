/*  
 * WaitingList Class (Johnny O' Neill)
 * */
package classes;

import java.util.ArrayList;

public class WaitingList {
    // an array list where students will be added and removed as needed
    public ArrayList<Student> waitingListArray;

// is the database going to have a copy of the waiting list? If so, then we need to populate the waiting list
// on opening application and logging in and then save it when logging out

    public WaitingList() {
        // TO DO: populate waitingListArray from DB
        waitingListArray = new ArrayList<Student>();
    }

    public void addToWaitingList(Student studentIn) {
        waitingListArray.add(studentIn);
    }

    // returns the next student from top of waiting list and removes them from list
// returns null if list is empty
    public Student retrieveNextStudent() {
        if (waitingListArray.size() > 0) {
            Student nextStudent = waitingListArray.get(0);
            waitingListArray.remove(0);

            return nextStudent;
        } else {
            return null;
        }
    }

    // this should be called before retrieving students from waiting list
    public int getWaitingListSize() {
        return waitingListArray.size();
    }

    public Student peekNextStudent() {
        if (waitingListArray.size() > 0) {
            return waitingListArray.get(0);
        } else {
            return null;
        }
    }

}

