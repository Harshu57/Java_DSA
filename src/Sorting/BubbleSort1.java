package Sorting;

public class BubbleSort1 {
    public static void main(String[] args) {
        int arr[]={3,1,5,7,6};
        for(int i=0;i<arr.length ; i++){
            for(int j =1; j<arr.length;j++){
                if(arr[j-1]>arr[j]){
                    int temp =arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;

                }
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
