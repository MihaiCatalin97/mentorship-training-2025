package week_2.ch7.ex_10_enums_abstract_method;

public enum SeasonWithTimes {
    WINTER {
        @Override
        public String getHours() {
            return "10am-11am";
        }
    }, SPRING {
        @Override
        public String getHours() {
            return "11am-12am";
        }
    }, SUMMER {
        @Override
        public String getHours() {
            return "12am-13am";
        }

        @Override
        public boolean isEasyToLearn() {
            return false;
        }
    }, FALL {
        @Override
        public String getHours() {
            return "13am-14am";
        }

    };

    //being abstract it should be defined in subclasses
    //here, each enum value behaves as a subclass
    //FOR ABSTRACT METHODS - each value should implement it
    public abstract String getHours();

    //However, if we define a simple method- the override is optional
    public boolean isEasyToLearn(){
        return true;
    }
}
