package Array;

public class LestRotateByKPostion {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        int k = 2;
        k = k % arr.length;
        int[] temp = new int[arr.length];
        for(int i =0; i<arr.length;i++){
            temp[i] = arr[(i+k) % arr.length];
        }
        for(int num : temp){
            System.out.println(num + " "); // gap
        }
    }
}
