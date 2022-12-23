package String;

import java.util.ArrayList;

public class Dog {




//    public void foo(Dog someDog) {
////        someDog.setName("Max");     // AAA
////        someDog = new Dog("Fifi");  // BBB
////        someDog.setName("Rowlf");   // CCC
////    }
////
////    private void setName(String max) {
////    }

    public ArrayList<Object> changeObjectValue(ArrayList<Object> objectValue) {
        objectValue.clear();
        objectValue.add(999);
        return objectValue;

    }



    public String changeStr(String str) {
        str = "NewString";
        return str;
    }

    public int changeX(int x) {
        x = x*5;
        return x;
    }




}

