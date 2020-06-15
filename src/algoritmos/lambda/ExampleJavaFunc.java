package algoritmos.lambda;

import java.util.*;
import java.util.stream.Collectors;

class ExampleJavaFunc {

    public String words() {
        StringBuffer builder = new StringBuffer();

        List<String> words = Arrays.asList("Hola", "2", "3", "que", "tal");
        words.stream()
                .filter(this::isValidNumber)
                .map(Integer::valueOf)
//                .collect(Collectors.joining(", ", "(", ")"));
                .forEach(builder::append);
        return builder.toString();
    }

    public boolean isValidNumber(String number) {
        try {
            Integer value =  Integer.valueOf(number);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        ExampleJavaFunc javaFunc = new ExampleJavaFunc();
        System.out.println(javaFunc.words());
    }

}