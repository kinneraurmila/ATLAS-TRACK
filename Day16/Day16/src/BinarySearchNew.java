public class BinarySearchNew {
    public int search(int[] arr, int toFind) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == toFind) {
                return mid;
            } else if (arr[mid] < toFind) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        BinarySearchNew bsn =new BinarySearchNew();

        int[] arr ={2,3,4,5,6,7,8,9,10};
       // int toFind =5;
        //int result= binarySearchNew.binarySearch(arr,toFind);
        int result =bsn.search(arr,6);
            System.out.println("found at position  : " + result);


    }
}


