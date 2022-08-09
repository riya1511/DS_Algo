package array;

public class BiggestNumber {

	public static void main(String[] args) {
		String[] a = {"3","30","34","5","9"};
		System.out.println(printLargest(a));
	}
	
	static String printLargest(String[] arr) {
        String ans = arr[0];
        
        for(int i = 1; i < arr.length; i++){
            ans = myCompare(ans,arr[i]);
        }
        // ans = arr[(int)0];
        return ans;
    }
    
    static String myCompare(String x, String y){
        String xy = x + y;
        String yx = y + x;
        
        int a = Integer.parseInt(xy);
        int b = Integer.parseInt(yx);
 
        
        if(a > b) return xy;
        else return yx;
    }

}
