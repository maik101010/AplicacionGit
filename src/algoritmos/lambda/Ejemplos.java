package algoritmos.lambda;

import java.util.Arrays;
import java.util.stream.IntStream;

class Ejemplos {
	public static void main(String[] args) {
		int [] valores = {2,4,1,123, 4,2,1};

		//List<Integer> lista = Arrays.asList(valores);

		//lista.forEach(v -> System.out.println(v));


		System.out.print("valores originales: ");

		IntStream.of(valores)
		.forEach(valor ->System.out.printf("%d ", valor));
		System.out.println();

		System.out.println(IntStream.of(valores).summaryStatistics());
	}
}