public class Hashmaps {
    /*La inicialización maneja la misma sintaxis que los ArrayList. 
    Independientemente de que hagamos un HashMap que acepte tanto Strings como int, 
    no es necesario que volvamos a indicarlo cuando creamos el objeto dentro del <> (diamante)*/

    // Crear hashmap
    HashMap < Integer, String > map;

    //Inicializar
    map = new HashMap < > ();

    // Agregar valores
    map.put(25, "Denise");

    //¿Cuantos valores tiene?
    map.size();

    //Acceder al valor x key
    map.get(25);

    //Esta vacio?
    map.isEmpty();

    //Borrar elemento 
    map.remove(25);

    //Reemplazar elementos o actualizar
    map.put(23, "Denise")

    //Recorrer hashmap
    HashMap < String, String > people;
    people = new HashMap < > ();
    people.put("Harry", "Seeker");
    people.put("Ginny", "Chaser");

    for (String k: people.keySet()) {
        String s = k + ": ";
        s += people.get(k) + "; ";
        System.out.print(s);
    }




}