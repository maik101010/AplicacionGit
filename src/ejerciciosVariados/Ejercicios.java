import java.util.*;
import java.time.*;
import java.io.*;
import java.util.Scanner;
class Ejercicios {
	
	public static void main(String[] args) {


		//17 milloes con tasa de 2 % mensual durante un año
		//cancelar durante los primeros 5 días de cada mes, por cada día transcurrido
		//se aumenta el interes en un 0,02% 
		//el programa debe pedir fecha de consignacion, debe arrojar la cantidad
		//a consignar. Al cabo de 12 meses, calcular valor total a pagar
		/*
		     primero
		 */
		// Scanner scan=new Scanner(System.in);
		// System.out.print("Valor a prestar: ");

		// int valorPrestado=scan.nextInt();

		// System.out.print("fecha de consignacion: ");
		// //String str = "1986-04-08 12:30";
		// String time=scan.next(); //default format: hh:mm:ss.
		// LocalDate ld = LocalDate.parse(time);
		// int porcentaje = valorPrestado*2/100;
		// int valorTotal = valorPrestado+porcentaje;
		// int valorMes = valorTotal/12;		
		// //LocalTime lt=LocalTime.parse(time);
		// System.out.println("Valor a pagar mensual: " + valorMes);
		// System.out.println("Valor a pagar total: " +valorTotal);



		// Scanner scan = new Scanner(System.in);
		// System.out.print("Escriba el total a pagar: ");
		// int respuesta = scan.nextInt();
		// if (respuesta<=500 && respuesta>0) {
		// 	System.out.print("El total a pagar es de "+respuesta);
		// }else if (respuesta>=501 && respuesta<=1000) {
		// 	int descuento = (respuesta*5)/100;
		// 	respuesta = respuesta-descuento;
		// 	System.out.print("El total a pagar es de "+respuesta);
		// }else if (respuesta>=1001 && respuesta<=7000) {
		// 	int descuento = (respuesta*11)/100;
		// 	respuesta = respuesta-descuento;
		// 	System.out.print("El total a pagar es de "+respuesta);
		// }else if (respuesta>=7001 && respuesta<=15000) {
		// 	int descuento = (respuesta*18)/100;
		// 	respuesta = respuesta-descuento;
		// 	System.out.print("El total a pagar es de "+respuesta);
		// }else{
		// 	int descuento = (respuesta*25)/100;
		// 	respuesta = respuesta-descuento;
		// 	System.out.print("El total a pagar es de "+respuesta);	
		// }
		/*
		    segundo
		 */
		// Scanner scan = new Scanner(System.in);
		// System.out.print("precio boleta 1: ");
		// int botelo1 = scan.nextInt();
		// System.out.print("precio boleta 2: ");
		// int botelo2 = scan.nextInt();
		// System.out.print("precio boleta 3: ");
		// int botelo3 = scan.nextInt();
		// System.out.print("precio boleta 4: ");
		// int botelo4 = scan.nextInt();
		// System.out.print("precio boleta 5: ");
		// int botelo5 = scan.nextInt();
		
		// boolean comprando = true;
		// int contCompra = 0;
 
		// while(comprando){

		// 	System.out.print("# boleta que desea comprar? ");
		// 	int precio = scan.nextInt();
		// 	contCompra = precio+contCompra;

		// 	System.out.print("desea otra compra? responda si o no. ");
		// 	String respuesta = scan.next();
		// 	if (respuesta.equals("no") || respuesta.equals("No") || respuesta.equals("NO")) {
		// 		comprando=false;
		// 	}

		// }
		// System.out.print("Total de su compra fue: "+contCompra);
		/*
		     tercero
		 */
		// int numeroUno=0;
		// int numeroDos=0;		
		// boolean respuesta=true;
  //       Scanner scan = new Scanner(System.in);
		// while(respuesta){

		// 	System.out.print("Escriba el numero 1: ");
		// 	numeroUno =scan.nextInt();
		// 	System.out.print("Escriba el numero 2: ");
		// 	numeroDos =scan.nextInt();

  //           System.out.print("Que desea?\nsuma (+) \nresta(-)\ndivision(/)\nmultiplicacion\nRespuesta: ");
		// 	String operacion=scan.next();
		// 	if(operacion.equals("+")){
		// 		int resultado = numeroUno+numeroDos;
		// 		System.out.println("El resultado de la suma es: "+resultado);

		// 	}else if(operacion.equals("-")){
		// 		int resultado = numeroUno-numeroDos;
		// 		System.out.println("El resultado de la resta es: "+resultado);

		// 	}else if(operacion.equals("*")){
		// 		int resultado = numeroUno*numeroDos;
		// 		System.out.println("El resultado de la multiplicacion es: "+resultado);

		// 	}else if(operacion.equals("/")){
		// 		int resultado = numeroUno/numeroDos;
		// 		System.out.println("El resultado de la multiplicacion es: "+resultado);
		// 	}

		// 	System.out.print("Desea salir? digite s, de lo contrario digite cualquier letra");

		// 	String salir = scan.next();
		// 	if (salir.equals("s")) {
		// 		System.out.print("Saliendo...");

		// 		respuesta=false;
		// 	}

		// }
		/*
		     Cuarto
		 */
		// Scanner scan = new Scanner(System.in);
		// System.out.print("Digita el numero: ");
		// int numero = scan.nextInt();
		// System.out.print("Digita la potencia: ");
		// int potencia = scan.nextInt();
		// int cont=1;
		// int total=numero;
		// while(cont<potencia){
		// 	int respuesta= total*numero;
		// 	total = respuesta;
		// 	cont++;
		// 	//System.out.print("cont: "+cont);

		// }
		// System.out.print("Respuesta: "+total);
		/*
		    Cinco
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite cantidad de trabajadores: ");

		int cantidadTrabajadores = scan.nextInt();
		int [] sueldo = new int[cantidadTrabajadores];

		for (int i=0;i<cantidadTrabajadores;i++ ) {
			System.out.print("Sueldo trabajador "+(i+1) + " :");
			//int sueldo = scan.nextInt();
			sueldo[i]= scan.nextInt();

		}
		int mayor=0;
		int posicion=0;
		for (int j=0; j<sueldo.length-1;j++ ) {
			int actual = sueldo[j];
			int siguiente = sueldo[j+1];
			
			if (actual<= siguiente) {
				mayor = siguiente;
			}else{
				mayor = actual;
			}
		}
		System.out.println("El sueldo mayor es de: "+mayor);

	
	}
	
}
