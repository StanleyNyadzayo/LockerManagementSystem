package classes;

/*  
 * LockerLocation enum (Johnny O' Neill)
 * */
class Location {
    public enum LockerLocation {
        FIRST_FLOOR {
            public String toString() {
                return "First Floor";
            }
        },
        SECOND_FLOOR {
            public String toString() {
                return "Second Floor";
            }
        },
        THIRD_FLOOR {
            public String toString() {
                return "Third Floor";
            }
        }
    }

}