package classes;

/*  
 * LockerStatus enum (Johnny O' Neill)
 * */

class Status {
    public enum LockerStatus {
        AVAILABLE {
            public String toString() {
                return "Available";
            }
        },
        BOOKED {
            public String toString() {
                return "Booked";
            }
        },
        PAID {
            public String toString() {
                return "Paid";
            }
        }
    }
}