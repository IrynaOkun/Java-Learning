package GetterSetter;

public class Car {
        String type;

        public Car() {
        }

        //getter
        public String getType() {
            return type;
        }

        //setter
        public void setType(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "\n===============\n" +
                    "Car:" +
                    "\nType:" + type +
                    "\n===============\n";
        }
}
