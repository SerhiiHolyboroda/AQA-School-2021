package enums;

public enum WeekDays {

    MONDAY {

        public String getDay() {
            return "TUESDAY";
        }
    },  TUESDAY {

        public String getDay() {
            return " WEDNESDAY";
        }
    },  WEDNESDAY {

        public String getDay() {
            return "THURSDAY";
        }
    },  THURSDAY {

        public String getDay() {
            return " FRIDAY";
        }
    },   FRIDAY {

        public String getDay() {
            return "SATURDAY";
        }
    }, SATURDAY {

        public String getDay() {
            return " SUNDAY";
        }
    }, SUNDAY {

        public String getDay() {
            return "MONDAY";
        }
    };

    public abstract String getDay();
}
