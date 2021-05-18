package ProyectoP2;

import java.util.Scanner;

/**
 *
 * @author Liliana Lozano
 */
public class Main {

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.calcularArea();
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.calcularArea();
        Trapecio trapecio = new Trapecio();
        trapecio.calcularArea();
        System.out.println("-----Resultados-----");
        cuadrado.Resultado();
        rectangulo.Resultado();
        trapecio.Resultado();
    }
}
