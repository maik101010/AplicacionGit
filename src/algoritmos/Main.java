package algoritmos;


import java.util.*;

public class Main {

    public static int misterio(int uno, int dos){
        int calculo =1;
        for (int x=0; x<dos; x++){
            calculo *=uno;

        }
        return calculo;
    }



    public static String findNumber(List<Integer> arr, int k) {
        Object[] arreglo =  arr.toArray();
//        int arrs [] = new int[arrs.length];

        Arrays.sort(arreglo);
        if (Arrays.binarySearch(arreglo, k) > 0) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
//        int resultado = misterio(2, 3);
//        System.out.println(resultado);
        for (double y=0.1;y!=1.0;y+=0.1){
            System.out.println(y);
        }



//        String value1 = "holla";
//        String value2 = "aloha";
//        Map<Character, Integer> map = convertToMap(value1);
//        Map<Character, Integer> map2 = convertToMap(value2);
//        System.out.println(map);
//        System.out.println(map2);
//        System.out.println(map.equals(map2));
//        String value = "abcde";
//        substring(value);
    }

//    private static String substring(String value) {
//
//    }

    private static Map<Character, Integer> convertToMap(String value1) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < value1.length(); i++) {
            int cont = 0;
            if (map.containsKey(value1.charAt(i))) {
                cont = 1 + map.get(value1.charAt(i));
            } else {
                cont = 1;
            }
            map.put(value1.charAt(i), cont);
        }
        return map;
    }
}
