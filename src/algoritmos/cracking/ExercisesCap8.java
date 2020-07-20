package algoritmos.cracking;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.List;

/**
 * Cap 8 at book Cracking the coding interview
 */
class ExercisesCap8 {
    public static boolean isUniqueCharacter(String character) {
        boolean result = true;
        Map<Character, Character> characterIntegerMap = new Hashtable<>();
        char[] chars = new char[character.length()];
        for (int i = 0; i < character.length(); i++) {
            characterIntegerMap.put(character.charAt(i), character.charAt(i));
            chars[i] = character.charAt(i);
        }
        char temp = 0;
        for (int i = 0; i < chars.length; i++) {
            char value = characterIntegerMap.get(chars[i]); //a//b//a
            if (characterIntegerMap.containsKey(value)) { //true//true
                temp = value;
                characterIntegerMap.remove(value); //remove=a//remove=b
                if (characterIntegerMap.get(temp) != null) {
                    result = false;
                    break;
                }
            }
        }

        return result;
    }

    /**
     * Validate string with a unique char
     *
     * @param stringCharacters
     * @return result if validation is true or false
     */
    public static boolean isUniqueChar(String stringCharacters) {
        boolean result = true;
        for (int i = 0; i < stringCharacters.length(); i++) {
            char iChar = stringCharacters.charAt(i);
            for (int j = i + 1; j < stringCharacters.length(); j++) {
                char jChar = stringCharacters.charAt(j);
                if (iChar == jChar) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    /**
     * Validate string with a unique char
     *
     * @param stringCharacters
     * @return result if validation is true or false
     */
    public static boolean isUniqueCharacterSet(String stringCharacters) {
        boolean result = true;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < stringCharacters.length(); i++) {
            if (!set.add(stringCharacters.charAt(i))) {
                result = false;
            }
        }
        return result;
    }

    /**
     * Check permutation between two string
     *
     * @param stringOne
     * @param stringTwo
     * @return true if the condition is check, else false
     */
    public static boolean checkPermutation(String stringOne, String stringTwo) {
        if (stringOne.length() > stringTwo.length()) {
            throw new IllegalArgumentException("A string can't to be more length other");
        }
        Map<Character, Character> characterMap = new HashMap<>();
        for (int i = 0; i < stringOne.length(); i++) {
            characterMap.put(stringOne.charAt(i), stringOne.charAt(i));
        }
        for (int i = 0; i < stringTwo.length(); i++) {
            if (characterMap.containsValue(stringTwo.charAt(i))) {
                characterMap.put(characterMap.get(stringTwo.charAt(i)), '0');
            } else {
                characterMap.put(characterMap.get(stringTwo.charAt(i)), '1');
                break;
            }
        }
        return !characterMap.containsValue('1');
    }

    /**
     * Check permutation between two string
     *
     * @param stringOne
     * @param stringTwo
     * @return true if the condition is check, else false
     */
    public static boolean checkPermutationOrder(String stringOne, String stringTwo) {
        boolean result = true;
        if (stringOne.length() > stringTwo.length()) {
            throw new IllegalArgumentException("A string can't to be more length other");
        }
        String sortedStringOne = getStringSort(stringOne);
        String sortedStringTwo = getStringSort(stringTwo);

        for (int i = 0; i < sortedStringOne.length(); i++) {
            if (sortedStringOne.charAt(i) != sortedStringTwo.charAt(i)) {
                result = false;
                break;
            }
        }
        return result;
    }

    private static String getStringSort(String value) {
        char[] chars = value.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    /**
     * Replacer all space with string: "%20"
     *
     * @param string
     * @return the string with %20
     */
    public static String replaceAllSpace(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int beginIndex = 0;
        for (int i = 0; i < string.length() - 1; i++) { //Mr John Smith 13-1=12
            if (string.charAt(i) == ' ' && validateChar(string.charAt(i + 1))) {
                String first = string.substring(beginIndex, i);
                stringBuilder.append(first).append("%20");
                beginIndex = i + 1;
            } else if ((i + 1) == string.length() - 1) {
                String first = string.substring(beginIndex, i + 2);
                stringBuilder.append(first);
            }
        }
        return stringBuilder.toString();
    }

    private static boolean validateChar(char charAt) {
        return Character.toString(charAt).matches("^[a-zA-Z0-9]*$");
    }

    //    private static boolean palindromePermutation(String value) {
//    }
    private static boolean oneAway(String one, String two) {
        Map<Character, Character> secondChar = new HashMap<>();
        char[] chars = one.toCharArray();
        for (int i = 0; i < two.length(); i++) {
            secondChar.put(two.charAt(i), two.charAt(i));
        }
        //Nos servirá usar substring?
        for (int i = 0; i < one.length(); i++) {
            if (secondChar.get(chars[i]) != null) {
                chars[i] = 0;
            } else {
                chars[i] = 1;
            }
        }
        int found = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 1) {
                found++;
            }
        }
        return found <= 1;
    }

    public static void stringCompression(String input) {
        List<Character> characterList = new ArrayList<>();
        int count = '1';
        int index = 0;
        characterList.add(index, input.charAt(index));
        index++;
        characterList.add(index, (char) count);
        for (int i = 0; i < input.length() - 1; i++) {
            char firstValue = input.charAt(i);
            char nextValue = input.charAt(i + 1);
            if (firstValue == nextValue) {
                count++;
            } else {
                count = '1';
                index++;
                characterList.add(index, nextValue);
                index++;
                characterList.add(index, (char) count);
            }
            characterList.set(index, (char) count);
        }
        System.out.println(characterList);
    }

    public static int[][] zeroMatrix(int[][] arr) {
        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    integerMap.put(i, arr[i][j]);
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (integerMap.containsKey(i)) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = 0;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 0, 3}, {4, 5, 6}, {1, 0, 1},
                {1, 1, 1}, {2, 3, 6}, {1, 4, 1},
                {1, 2, 1}, {1, 1, 0}, {1, 9, 1}
        };
//        [0, 1];
//        [2, 1];
//        [7, 2];
        long startTime = System.nanoTime();
        //hola mundo
        replaceAllSpace("hola mundo ");
        long endTime = System.nanoTime();
        System.out.println("Tiempo de ejecución one " + (endTime - startTime));

//        char b= (char) 1;
//        System.out.println(b);
    }
}