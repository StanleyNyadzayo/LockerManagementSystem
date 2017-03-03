// Locker Class (Johnny O' Neill)

package classes;


public class Locker {

    private int lockerNo = 0;
    private String location = "";
    private String size = "";
    private Student lockerOwner = new Student();
    private String status = "";

    public Locker(int lockerNumIn, String locationIn, String sizeIn, Student lockerOwnerIn, String statusIn) {
        setLockerNo(lockerNumIn);
        setLocation(locationIn);
        setSize(sizeIn);
        setLockerOwner(lockerOwnerIn);
        setStatus(statusIn);
    }

    public int getLockerNo() {
        return lockerNo;
    }

    // to do once DB hooked up, need to ensure we won't be overwriting a locker when saving this...
    // i.e. we should not arbitrarily set these IDs for new lockers
    public void setLockerNo(int lockerNo) {
        this.lockerNo = lockerNo;
    }

    public String getLocation() {
        return location;
    }

    public Boolean setLocation(String locationIn) {
        Boolean locationSet = false;
        for (Location.LockerLocation ll : Location.LockerLocation.values()) {
            if (ll.name().equals(locationIn)) {
                this.location = locationIn;
                locationSet = true;
                break;
            }
        }
        return locationSet;
    }

    public String getSize() {
        return size;
    }

    public Boolean setSize(String sizeIn) {
        Boolean sizeSet = false;
        for (Size.LockerSize ls : Size.LockerSize.values()) {
            if (ls.name().equals(sizeIn)) {
                this.size = sizeIn;
                sizeSet = true;
                break;
            }
        }
        return sizeSet;
    }

    public Student getLockerOwner() {
        return lockerOwner;
    }

    public void setLockerOwner(Student lockerOwner) {
        this.lockerOwner = lockerOwner;
    }

    public String getStatus() {
        return status;
    }

    // only set the locker status if it is one of those defined for locker.
    public Boolean setStatus(String statusIn) {
        Boolean statusSet = false;
        for (Status.LockerStatus ls : Status.LockerStatus.values()) {
            if (ls.name().equals(statusIn)) {
                this.status = statusIn;
                statusSet = true;
                break;
            }
        }
        return statusSet;
    }

    public void bookLocker() {
        this.status = Status.LockerStatus.BOOKED.toString();
    }

    public void cancelLocker() {
        this.status = Status.LockerStatus.AVAILABLE.toString();
    }

    public void payForLocker() {
        this.status = Status.LockerStatus.PAID.toString();
    }

}

