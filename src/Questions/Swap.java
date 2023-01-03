package Questions;

public class Swap {
    public static void main(String[] args) {
        swapNo(4, 90);
        
    }
    public static void swapNo(int n1 , int n2){
        n1 = n1+n2;
        n2=n1-n2;
        n1=n1-n2;
        System.out.println("value of n1 =" + n1 + " " +"value of n1 =" + n2);



    }
    
}
