package Concepts.DesignPatterns;

class A{
    private static A objA = new A(); /*private static instance of class A*/
    private A(){}; // private constructor so that no one can create its instance
        void showMessage(){
        System.out.println("called through instance of class A");
    }
    public static A getInstance(){ // pubilc access point or method to all the classes which can be accessesd by classname.method name coz its static  
        return objA; // will return instance of class A
    }

}
public class SingletonPattern {
    public static void main(String[] args) {
        A.getInstance().showMessage();
        
        
    }
    
}
