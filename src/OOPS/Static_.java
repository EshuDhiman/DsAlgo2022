package OOPS;
//outer class
public class Static_ {
    int age;
    String fName;
    String lName;
    boolean _isEighteen;
    static int pop;// static member 

        // non static method which is dependent on object or instance of Static_ class
        void msg() {
        System.out.println("msg");

    }
    // constructor 
    Static_(int ageInt, String fnameString, String lnameString, boolean _isEighteenBool) {
        this._isEighteen = _isEighteenBool;
        this.fName = fnameString;
        this.lName = lnameString;
        Static_.pop += 1;// static mem is common everytime a object of Static_ will be created it will add 1 to pop variable

    }
    // inner class which is static 
       public static class Inner{
        //  static methods can be accessed without creating the instance or object of the class,u have to put static methods inside a static class only otherwise it will give error bcz non static classes are dependent on its objects but static methods are not dependent on thier objcets or instance , they can be accessed without creating a instace through class name
         static void msg2(){
            System.out.println("inncorect way but still works ,msg in static class");
        }
        static void msg3(){
            System.out.println("correct way ,msg in static class");
        }
        void msg4(){
            System.out.println("non static method");
        }

    }

    public static void main(String[] args) {
        // outer non static class objects
        Static_ obj = new Static_(pop, null, null, false); 
        Static_ obj2 = new Static_(pop, null, null, false);
        Static_ obj3 = new Static_(pop, null, null, false);
        Static_ obj4 = new Static_(pop, null, null, false);
        System.out.println(pop);
        
        Inner objInner = new Inner(); //inner class object
        objInner.msg2();// method one for accessing static method by making object of the class in which static method is present 
        Inner.msg3();// correct method for accessing static methods through class name
        objInner.msg4();// accessed with object of static class

    }

}
