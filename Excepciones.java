package main;

public class HolaMundo {
    public static void main(String[] args) {
        int n, d, c;
    try {
      n = 10;
      d = 0;
      c = n/d;
      System.out.println(c);
    }
    catch (ArithmeticException e) { // Error matematico por dividir por cero
      System.out.println("Error división por cero");
    }

    
    // --------------- Otro ejemplo ------------------------
    
    try {
			int num = Consola.leerEntero("Ingresá numerador");
			int den = Consola.leerEntero("Ingresá denominador");
			System.out.println("La division es " +              Matematica.divisionEntera(num, den));
		}
		// Como las excepciones tienen tipos, se puede discriminar el mensaje de error
		catch (InputMismatchException ime) { // Lo lanza un objeto de tipo Scanner
			System.out.println("ERROR. Se esperaba un entero");
			System.out.println(ime.getMessage()); //Mensaje de la excepcion
		}
		catch (ArithmeticException ae) { // Lo lanza la clase Matematica
			System.out.println("ERROR. Se intentó dividir por cero");	
			System.out.println(ae.getMessage());
		}
		catch (Exception e) { // Todo es una Exception. OJO. Este catch siempre a lo último
			System.out.println("Error desconocido");
			System.out.println(e.getMessage());
		}
		finally { // OPCIONAL: Se ejecuta el bloque finally haya o no una excepción
			System.out.println("Haya o no error, yo me imprimo siempre :D");
			// Generalmente se usa para liberar recursos.
			// Ejemplo: se intenta leer de un archivo o de una BD.
			// Haya habido o no éxito, siempre debe cerrarse el archivo o liberarse la conexión con la BD
		}

     
    }
}
