package main;

public class HolaMundo {
    public static void main(String[] args) {

        // Un Array es un contenedor para una cantidad fija de valores de un solo tipo

        // Creamos al array
        String[] nombreArray;
        // Lo inicializamos
        nombreArray = new String[10];

        // Otra manera de inicializar y agregar elementos
        String[] names = {
            "See",
            "how",
            "short",
            "this",
            "is"
        }; //Creamos el Array names con estos elementos ya agregados
        String output = Arrays.toString(names); //Esta funcion convierte al Array en un String con todos los elementos 
        System.out.print(output); //Output devolvera [See, how, short, this, is]

        // Cantidad de elementos del array
        nombreArray.length();

        // Acceder a un elemento por su index
        nombreArray[0];

        //Reemplazar un elemento por otro o agregar nuevos
        nombreArray[0] = "Hola";

        // Esta vacio?
        nombreArray.isEmpty();

        // Convertir un array de char a String

        char[] myChars = {
            'B',
            'o',
            'b'
        };
        String myString = new String(myChars);
        System.out.print(myString); //Devuelve Bob


        // Definir por true o false si un String empieza con ciertas palabras
        String idol = "Mrs. Hopper";
        if (idol.startsWith("Mrs.")) {
            String output = "Hello ma'am!";
            System.out.print(output);
        } else if (idol.startsWith("Mr.")) {
            String output = "Hello sir!";
            System.out.print(output);
        }

        //Y con lo que termina
        idol = "Maria Sklodowska";
        if (idol.endsWith("a")) {
            String output = "Hello ma'am!";
            System.out.print(output);
        } else {
            String output = "Hello sir!";
            System.out.print(output);
        }



    }
}
