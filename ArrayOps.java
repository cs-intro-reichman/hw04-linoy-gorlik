import java.util.Arrays;
public class ArrayOps {
    public static void main(String[] args) {
    }
    public static int findMissingInt (int [] array) {
        Arrays.sort(array);
        if (array.length == 0) {return -1;}
           else if (array.length == 1) {return array[0]+1;}
               for (int i = 1; i < array.length; i++) {
            if (array[i] - array[i-1] == 1) {}
         else {return array[i-1] + 1;}
        }
        return array[0]-1;
     }
                
        
    

    public static int secondMaxValue(int [] array) {
        if (array.length == 0) {return -1;}
          else if (array.length == 1) {return array[0];}
            int firstMax = array[0], secondMax = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > secondMax) {
                secondMax = array[i];
            }

            if (array[i] > firstMax) {
                secondMax = firstMax;
                firstMax = array[i];
                
            }

        }

        return secondMax;
        
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
