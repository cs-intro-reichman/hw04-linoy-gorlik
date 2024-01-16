public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
    }

    public static String capVowelsLowRest (String string) {
        String result = "";
        String vowels = "aeiouAEIOU";
    
        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);
            
            if (vowels.indexOf(character) != -1) {
                // Convert to uppercase with ASCII
                if (character >= 'a' && character <= 'z') {
                    result += (char)(character - 32); 
                }
                else {result += character;}
            } else {
                if (character >= 'A' && character <= 'Z') {
                    result += (char)(character + 32);
                } else {result += (char) (character);}
            }
        }
        return result;
    }

    public static String camelCase (String string) {
        String result = "";
        boolean firstLetter = true;
        boolean thrFirstLetter = true;
    
        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);
    
            if (currentChar != ' ') {
                if (thrFirstLetter) {
                    // convert first letter of first word to lowercase
                    thrFirstLetter = false;
                    firstLetter = false;
                    if (currentChar >= 'a' && currentChar <= 'z') {
                        result += currentChar;
                    } else {
                        result += (char) (currentChar + 32);
                    }
                } else if (firstLetter) {
                    // convert first letter of non first word to upperCase
                    firstLetter = false;
                    if (currentChar >= 'a' && currentChar <= 'z') {
                        result += (char) (currentChar - 32);
                    } else {
                        result += currentChar;
                    }
                } else {
                    // convert all other words to lowercase
                    if (currentChar >= 'a' && currentChar <= 'z') {
                        result += currentChar;
                    } else {
                        result += (char) (currentChar + 32);
                    }
                }
            } else {
                firstLetter = true;
            }
        }
    
        return result;
    }

    public static int[] allIndexOf (String string, char chr) {
        int counter = 0;
        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) == chr){
                counter++;
            }
        }
        int arrIndex = 0;
           int [] arr = new int[counter];
                for (int i = 0; i < string.length(); i++){
                   if (string.charAt(i) == chr) {
                       arr[arrIndex] = i;
                       arrIndex++;
            }
        }
        return arr;
    }
}
