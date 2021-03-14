package main;

public class HolaMundo {
    public static void main(String[] args) {
        // If
        int age = 25;

        if (age <= 0) {
            System.out.println("Error");
        } else if (age <= 16) {
            System.out.println("Joven");
        } else {
            System.out.println("Viejo");
        }

        // No es necesario poner llaves si solo hay 1 bloque if
        if (age <= 65);
        System.out.println("edad menor o igual a 65");
        else
            System.out.println("edad mayor a 65");


        // While
        int número = 4557888;
        int dígitos = 0;
        do {
            número /= 10;
            dígitos++;
        } while (número > 0);
        System.out.println(dígitos);


        // For
        int suma = 0;
        for (int i = 1; i <= 10;i++)
            suma = suma + i;
        System.out.println ("El total es " + suma);

        
     
    }
}
