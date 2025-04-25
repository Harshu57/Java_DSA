package Array;

public class FindTheMissingNum {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6,7};
        int n =7; //n = last number;
        int total = n*(n+1) /2;
        int sum =0;
        for(int num: arr){
            sum +=num;

        }
        System.out.println("the missing number is :" + (total - sum));
    }
}