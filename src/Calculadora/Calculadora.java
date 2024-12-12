package Calculadora;


	import java.util.InputMismatchException;
	import java.util.Scanner;

	public class Calculadora {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        boolean continuar = true;

	        while (continuar) {
	            try {
	              
	                System.out.println("\n--- Calculadora ---");
	                System.out.println("Seleccione una operación:");
	                System.out.println("1. Suma");
	                System.out.println("2. Resta");
	                System.out.println("3. Multiplicación");
	                System.out.println("4. División");
	                System.out.println("5. Salir");
	                System.out.print("\n");
	                System.out.print("Opción: ");
	               
	                int opcion = scanner.nextInt();

	                if (opcion == 5) {
	                    System.out.println("Has salido de la calculadora");
	                    continuar = false;
	                    continue;
	                }

	            
	                System.out.print("Ingrese el primer número: ");
	                double num1 = scanner.nextDouble();
	                System.out.print("Ingrese el segundo número: ");
	                double num2 = scanner.nextDouble();

	                double resultado;

	             
	                switch (opcion) {
	                    case 1:
	                        resultado = num1 + num2;
	                        System.out.println("El resultado de la suma es: " + resultado);
	                        break;
	                    case 2:
	                        resultado = num1 - num2;
	                        System.out.println("El resultado de la resta es: " + resultado);
	                        break;
	                    case 3:
	                        resultado = num1 * num2;
	                        System.out.println("El resultado de la multiplicación es: " + resultado);
	                        break;
	                    case 4:
	                        if (num2 == 0) {
	                            throw new ArithmeticException("No se puede dividir entre cero.");
	                        }
	                        resultado = num1 / num2;
	                        System.out.println("El resultado de la división es: " + resultado);
	                        break;
	                    default:
	                        System.out.println("Opción no válida. Por favor, elija entre 1 y 5.");
	                }

	            } catch (ArithmeticException e) {
	                System.out.println("Error: " + e.getMessage());
	            } catch (InputMismatchException e) {
	                System.out.println("Por favor, ingrese un número válido.");
	                scanner.next();
	            } catch (Exception e) {
	                System.out.println("Error: " + e.getMessage());
	            }
	        }

	        scanner.close();
	    }
	}
	


