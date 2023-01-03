package Questions.Arrays;
class GfG
{
	public static int palinArray(int[] a)
           {boolean temp= true;
           int temp1=0;
           int temp2=0;
           
                  for(int i =0 ; i<a.length;i++){
                    while(temp){
                        temp1 = a[i]/10;
                        temp2 = a[i]%10;
                        if(temp1==0){
                            temp = false;
                        }
                    }   
                    if(temp2!=a[i]){
                        System.out.println("1");
                        return 0;
                    }
                    
                  }
                  return 1;
                   
                  
           }
}
public class PalindromicArray {
    public static void main(String[] args) {
        int[] arr = {
                121, 131, 20
        };
        GfG.palinArray(arr);

}
}