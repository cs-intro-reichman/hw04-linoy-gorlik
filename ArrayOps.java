import java.util.Arrays;
public class ArrayOps {
    public static void main(String[] args) {
        // int [] array1 = {1, 2, 1, 2};
        // int [] array2 = {2, 1};
        // boolean m = containsTheSameElements(array1, array2);
        // System.out.println(m);

        int [] array2 = {0, 1, 2, 1};
        boolean m = isSorted(array2);
        System.out.println(m);

    }
    public static int findMissingInt (int [] array) {
        // {9,6,7}
        if (array.length == 1) {
            return array[0] + 1;
        }
        Arrays.sort(array);
        for ( int index = 1; index <= array.length; index++ ){
            if (array[index] - array[index-1] != 1) {
                return array[index] - 1;
            }
                
        }

        return -1;
    }

    public static int secondMaxValue(int [] array) {
       int firstMax = array[0];
       int secoundMax = array [0];
        for ( int i = 1; i < array.length; i++){
            if (array[i] > firstMax){
                firstMax = array[i];
            } 
            if (secoundMax < array[i] && array[i] < firstMax) {
                secoundMax = array[i];
           }
        }
        return secoundMax;
        
    }
    // {1, 2, 3, 1, 2}, new int[] {2, 1});
    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean notEquels = true;
        for ( int i = 0; i < array1.length; i++){
            notEquels = true;
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]){
                    notEquels = false;
                    break;
                }
            }
            if (notEquels){
               return false;
            }
        }

        for ( int i = 0; i < array2.length; i++){
            notEquels = true;
            for ( int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]){
                    notEquels = false;
                    break;
                }
            }
            if (notEquels){
               return false;
            }
        }
        
         return true;
    }

    public static boolean isSorted(int [] array) {
        boolean ascending = true;
        boolean descending = true;

        // check if array goes up (ascending)
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i-1]) {
                ascending = false;
            }
        }

        // check if array goes down (descending)
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i-1]) {
                descending = false;
            }
        }

        if (ascending == true || descending == true) {
            return true;
        }

        return false;
        // return ascending || descending;
    }

}
