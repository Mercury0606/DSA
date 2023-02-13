package Sort;

public class MergeSort {
    public static void main(String[] args) {
        int[] intArray ={20,25,14,-3,6,78};
        for (int i:
             intArray) {
            System.out.println(i);
        }

    }
    //20, 25, 14, -3, 6, 78
    public static void mergeSore( int[] input, int start , int end ){
        if(end-start<2){
            return;
        }
        int mid = (start + end)/2;
        mergeSore(input, start, mid);
    }
}
