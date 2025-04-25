package Array;

public class findTheSecondLargestElement {
    public static void main(String[] args) {
        int temp, size;
        int arr[]= {10,20,25,21,20,63,96};
        size = arr.length;
        for(int i =0;i<size;i++){
            for(int j=i+1; j<size;j++){

                if(arr[i]>arr[j]){
                        temp= arr[i];
                        arr[i]= arr[j];
                        arr[j]=temp;


                }
            }

        }
        System.out.println("sceond largest elemnt in this this array is:" + arr[size-2]);
    }
}
