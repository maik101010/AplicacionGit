package algoritmos.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Main {

    public static void main(String arg[]) {
        Persona[] personas = {
            new Persona(1, "Michael", "M", 23, 3000),
            new Persona(2, "Oscar", "M", 19, 4000),
            new Persona(3, "Daniel", "M", 32, 3500),
            new Persona(4, "Alejandra", "F", 35, 4500),
            new Persona(5, "Andrea", "F", 35, 3500),};

        List<Persona> listaPersonas = Arrays.asList(personas);

        //listaPersonas.forEach(p -> System.out.println(p.toString()));
        //--------Predicado para almacenar el sueldo entre 3 mil y 4 mil
        Predicate<Persona> tresACinco = p -> (p.getSueldo() >= 3000 && p.getSueldo() <= 4000);

        //-------Mostramos los datos del predicado y ordenamos por nombre
        listaPersonas.stream()
                .filter(tresACinco)
                .sorted(Comparator.comparing(Persona::getNombre))
                .forEach(p -> System.out.println(p.toString()));

        //--------Primera persona que gana entre tres a 5 mil
        System.out.printf("Primero que gana entre 3 mil y 4 mil: %n%s%n", listaPersonas.stream()
                .filter(tresACinco)
                .findFirst()
                .get());

        //-------Ordenar por un valor y luego comparar para ordenar el otro
//		Function<Persona, String> porPrimerNombre = Persona::getNombre;
//		Function<Persona, Integer> porPrimerEdad = Persona::getEdad;
//        Comparator<Persona> edadLuegoNombre = Comparator
//                .comparing(porPrimerEdad)
//                .thenComparing(porPrimerNombre);
        //------Mostramos datos										
//        listaPersonas.stream()
//                .sorted(edadLuegoNombre)
//                .forEach(System.out::println);

        //---Suma del salario de empleados
        System.out.println("Sumatoria :" + listaPersonas.stream().mapToDouble(Persona::getSueldo).sum());

        System.out.println("Promedio :" + listaPersonas.stream().mapToDouble(Persona::getSueldo).average().getAsDouble());

    }

}
