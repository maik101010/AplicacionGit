package algoritmos.cracking;

import java.util.*;

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
    public static boolean isUnique(String stringCharacters) {
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
        boolean result = false;
        int back = stringTwo.length() - 1;
        for (int i = 0; i < stringOne.length(); i++) {
            String charTwo = stringTwo.substring(back);
            back--;
            if (charTwo.charAt(0) == stringOne.charAt(i)) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
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
        for (int i = 0; i < string.length()-1; i++) { //Mr John Smith 13-1=12
            if (string.charAt(i) == ' ' && validateChar(string.charAt(i+1))){
                String first = string.substring(beginIndex, i);
                stringBuilder.append(first).append("%20");
                beginIndex = i + 1;
            } else if ((i + 1) == string.length()-1) {
                String first = string.substring(beginIndex, i + 2);
                stringBuilder.append(first);
            }
        }
        return stringBuilder.toString();
    }

    private static boolean validateChar(char charAt) {
        return Character.toString(charAt).matches("^[a-zA-Z0-9]*$");
    }

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        System.out.println(replaceAllSpace("Mr John Smith"));
        long endTime = System.nanoTime();
        System.out.println("Tiempo de ejecución isUniqueCharacterSet " + (endTime - startTime));

//        System.out.println(replaceAllSpace("Mr John Smith"));
    }
}