package ProyectoP2;

import java.util.Scanner;



/**
 *
 * @author Liliana Lozano
 */
public class Trapecio extends Cuadrilatero{
    private double bM; 
    private double bm; 
    private double h; 
    private double aux; 
    private double aux2; 
    private double rMm;
    private double rC;
    private double r2; 
    private double daux;
    private double R; 
    private double dF; 
    private double dM; 
    private double area; 

    Scanner sc = new Scanner(System.in);

    public Trapecio(double bM, double bm, double h, double aux, double aux2, 
    double rMm, double rC, double r2, double daux, double R, double dF, double dM, double area) {
        this.bM = bM;
        this.bm = bm;
        this.h = h;
        this.aux = aux;
        this.aux2 = aux2;
        this.rMm = rMm;
        this.rC = rC;
        this.r2 = r2;
        this.daux = daux;
        this.R = R;
        this.dF = dF;
        this.dM = dM;
        this.area = area;
    }
    
    Trapecio() {
        
    }

    @Override
    public void calcularArea() {
        System.out.println("-----Trapecio-----");
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
        
        bM = Math.sqrt(Math.pow(super.getX2()-super.getX1(),2)+Math.pow(super.getY2()-super.getY1(),2));
        bm = Math.sqrt(Math.pow(super.getX4()-super.getX3(),2)+Math.pow(super.getY4()-super.getY3(),2));
        aux = Math.sqrt(Math.pow(super.getX4()-super.getX1(),2)+Math.pow(super.getY4()-super.getY1(),2));
        aux2 = Math.sqrt(Math.pow(super.getX3()-super.getX2(),2)+Math.pow(super.getY3()-super.getY2(),2));
        if(super.getX1()==super.getX4() || super.getX2()==super.getX3() && aux!=aux2){
            if(super.getX1()==super.getX4()){
                h = aux;
                area = ((bM+bm)*h)/2;
                System.out.println("TIPO DE TRAPECIO: Rectangulo izquierda");
            }
            else{
                h = aux2;
                area = ((bM+bm)*h)/2;
                System.out.println("TIPO DE TRAPECIO: Rectangulo derecha");
            }
           
        }
        if(aux==aux2){
            rMm = bM-bm;
            dM = rMm/2;
            h = Math.sqrt((Math.pow(aux, 2))-(Math.pow(dM, 2)));
            area = ((bM+bm)*h)/2;
            System.out.println("TIPO DE TRAPECIO: Isoceles");
        }
        if(super.getX1()!=super.getX4() && super.getX2() !=super.getX3() && aux!=aux2){

            rMm = bM-bm;
            rC = Math.pow(rMm, 2);
            r2 = rMm*2;
            daux = aux - aux2;
            R = daux - rC;
            dF = R/-r2;
            h = Math.sqrt((Math.pow(aux, 2))-(Math.pow(dF, 2)));
            area = ((bM+bm)*h)/2;
            System.out.println("TIPO DE TRAPECIO: Escaleno");
        }
        
    }
    public void Resultado(){
        System.out.println("--------------------");
        System.out.println("TRAPECIO: " + area + " u^2");
    }
}    
