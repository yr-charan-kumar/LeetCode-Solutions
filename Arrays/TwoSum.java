package Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int a[]={2,3,4,5,6};
        int target=6;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==target){
                    System.out.println("The two numbers are: "+a[i]+" and "+a[j]);
                }
            }
        }
    }
}
