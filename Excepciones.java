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

        
     
    }
}
