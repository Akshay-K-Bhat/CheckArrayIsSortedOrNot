

public class Recursion {
           public static boolean isSorted(int[] arr, int idx) {
           if (idx == arr.length - 1) {
               return true;
           }

           if (arr[idx] >= arr[idx + 1]) {
               return false;
           }
               return isSorted(arr,idx+1);

       }


        public static void main(String[] args) {
            int[] arr = {0, 1, 2, 3, 4, 5,5};
            boolean value = isSorted(arr,0);
            System.out.println(value);
        }

}