package Questions.Arrays;

public class ReverseArr {

    public static void main(String[] args) {
        int arr[] = {23,2,3,4,5,6,4,5,6,7,333,55};
        reverse(arr);
        
        
    }
    public static void reverse(int arr[]){
        int revArr[] = new int[arr.length];
        for (int i = 0; i <arr.length; i++) {
            
            

            // revArr[0]=arr[arr.length-1];    
            revArr[i]=arr[(arr.length)-(i+1)];
    
        
        



            
        }
        for (int i = 0; i < revArr.length; i++) {
            System.out.println(revArr[i]);
        }
    }
    
}
