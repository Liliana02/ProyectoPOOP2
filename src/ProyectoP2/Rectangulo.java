package ProyectoP2;

import java.util.Scanner;

/**
 *
 * @author Liliana Lozano
 */
public class Rectangulo extends Cuadrilatero{
    private double b;
    private double h;
    private double area;

    Scanner sc = new Scanner(System.in);

    public Rectangulo(double b, double h, double area) {
        super();
        this.b = b;
        this.h = h;
        this.area = area;
    }
  
    Rectangulo() {
        
    }

    @Override
    public void calcularArea() {
        System.out.println("-----Rectangulo-----");
        System.out.println("Ingrese las coordenadas (x,y) de todos los vertices: ");
        System.out.println("-----Vertice 1-----");
        System.out.print("     X: ");
        super.setX1(sc.nextDouble());
        System.out.print("     Y: ");
        super.setY1(sc.nextDouble());
        System.out.println("-----Vertice 2-----");
        System.out.print("     X: ");
        super.setX2(sc.nextDouble());
        System.out.print("     Y: ");
        super.setY2(sc.nextDouble());
        System.out.println("-----Vertice 3-----");
        System.out.print("     X: ");
        super.setX3(sc.nextDouble());
        System.out.print("     Y: ");
        super.setY3(sc.nextDouble());
        System.out.println("-----Vertice 4-----");
        System.out.print("     X: ");
        super.setX4(sc.nextDouble());
        System.out.print("     Y: ");
        super.setY4(sc.nextDouble());
        
        b = Math.sqrt(Math.pow(super.getX2()-super.getX1(),2)+Math.pow(super.getY2()-super.getY1(),2));
        h = Math.sqrt(Math.pow(super.getX3()-super.getX2(),2)+Math.pow(super.getY3()-super.getY2(),2));
        area = b*h;
    }
    public void Resultado(){
        System.out.println("--------------------");
        System.out.println("RECTANGULO: " + area + " u^2");
    }
}    

