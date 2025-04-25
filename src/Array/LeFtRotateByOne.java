package Array;

public class LeFtRotateByOne {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        int first = arr[0];
        for(int i=0; i <arr.length -1; i++){
            arr[i]=arr[i+1];// it means that the second position assign to first element
        }
        arr[arr.length - 1]= first ;
        for(int num : arr)
        {
            System.out.print( num + " ");

        }

    }
}
