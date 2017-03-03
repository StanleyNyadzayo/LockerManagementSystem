package classes;

/*
 * LockerSize enum (Johnny O' Neill)
 * */
class Size {
    public enum LockerSize {
        STANDARD {
            public String toString() {
                return "Standard";
            }
        },
        LARGE {
            public String toString() {
                return "Large";
            }
        }
    }
}