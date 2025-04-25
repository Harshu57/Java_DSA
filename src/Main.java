import java.util.*;
class K_aryStrings{
    int[] A;

    //corrected construcor name
    public K_aryStrings(int n){
        A = new int[n];
    }
    public void base_K_strings(int n,int k){
        if(n<=0)
            System.out.println(Arrays.toString(A));
        else {
            for(int j =0; j<k; j++){
                A[n-1]=j;
                base_K_strings(n-1, k);
            }
        }
    }

    public static void main(String[] args) throws java.lang.Exception{
        int n =4;
        K_aryStrings obj = new K_aryStrings(n);
        obj.base_K_strings(n,3);

    }
}