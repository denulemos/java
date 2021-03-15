package main;

public class HolaMundo {
    public static void main(String[] args) {

        //   Es un arreglo infinito de datos de cierto tipo. 

        // Crear el arraylist
        ArrayList nombresx;

        // Inicializar
        nombresx = new ArrayList();

        // ¿Que tipo de datos tomara?
        ArrayList < String > nombres;
        nombres = new ArrayList < > ();

        // Agregar un elemento
        nombres.add("Denise");

        // Mostrar todos los elementos separados por coma
        String test = String.join(",", nombres);

        // Obtener un elemento
        nombres.get(1);

        // Reemplazar un elemento por otro
        nombres.set(1, "Denise Lemos");

        // Borrar elemento
        nombres.remove(1);

        // Saber cantidad de elementos
        nombres.size();

        // Convetir arraylist a array
        String[] nombresxx Array = nombresxx.toArray();

        // Recorrer un array
        String[] friends = {
            “
            Deni”,
            “Deno”,
            Deni”
        };
        for (String f: friends) {
            System.out.println(f + ’;’);
        }



    }
}
