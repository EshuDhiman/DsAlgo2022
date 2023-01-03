package Concepts.Recursion;

public class Recursion {
public static void main(String[] args) {
    
       System.out.println(recCAll(6)); 
}
static int recCAll(int n){
    
    if(n<2){
        return n;
    }
    return recCAll(n-1)+ recCAll(n-2);

   


}
}
