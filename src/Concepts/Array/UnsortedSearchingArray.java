package Concepts.Array;

class ArrSearch{
    int arrSearch(int arr[],int n , int x){
        //index = n-1 where n is the size 
        for(int i = 0; i<arr.length;i++){
            if(arr[i]==x){
                System.out.println(i);
                return i;
            }
            
        }
        return -1;
    }


}


public interface UnsortedSearchingArray {
    public static void main(String[] args) {
        int arr[] = {20,5,7,25};
        ArrSearch obj = new ArrSearch();
        obj.arrSearch(arr, 4, 25);
        
    }
    
}
