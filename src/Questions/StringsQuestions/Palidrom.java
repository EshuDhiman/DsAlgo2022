package Questions.StringsQuestions;

public class Palidrom {
    public static void main(String[] args) {
        String s = "aaaaaaa";
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        int i =0;
        int start = 0;
        int end = arr.length-1;
        while(arr[start]==arr[end]){
            arr[start]+=1;
            arr[end]-=1-i; 
            i+=1;
            if(arr[start]!=arr[end]){
                System.out.println("false");
            }

        }
        System.out.println("palidrom");
    }
    
}
    