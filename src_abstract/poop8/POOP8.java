/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop8;

/**
 * Esta clase es el punto de entrada para la aplicación POOP8
 * Contiene el método main que inicia la ejecución del programa
 * 
 * En este programa se ilustran conceptos de herencia y polimorfismo mediante el uso de la jerarquía de clases Poligono, Triangulo y Cuadrilatero
 * También se muestra cómo se puede utilizar instanceof para identificar el tipo de un objeto en tiempo de ejecución
 * 
 * @author Fer Ordoñez
 * @version 06/04/2024
 */
public class POOP8 {

    /**
     * Este método es el punto de entrada para la aplicación POOP8
     * 
     * @param args Los argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Poligono pol = new Poligono();
        Poligono pol;
        //System.out.println(pol.area());
        //System.out.println(pol.perimetro());
        //Los triangulos son poligonos
        pol = new Triangulo(10, 10);
        System.out.println(pol.area());

        pol = new Cuadrilatero(10, 10);
        System.out.println(pol.area());
        
        System.out.println(pol);
        
        identificadorDePoligonos(pol);
        
        Object obj = pol;
        System.out.println(obj.toString());  //Del lado izquierdo son 
        
        //Sacamos a object para poderle sacar un àrea y perimetro
        //Poligono pol1 = new Poligono();  //Hacemos un casteo
        Poligono pol1;
        pol1 = (Poligono)obj;
        System.out.println(pol1.area());
        
        int a = 10;
        int b = 2;
        int c;
        c = 10/2;    
        System.out.println(c);
        
        System.out.println(Math.PI);
 
    } 

    /**
     * Método utilizado para identificar el tipo de polígono pasado como parámetro
     * @param pol El polígono que se va a identificar
     */
    private static void identificadorDePoligonos(Poligono pol) {
        if (pol instanceof Triangulo){
            System.out.println("El triángulo es un polígono");
        }
        else if (pol instanceof Cuadrilatero){
            System.out.println("Los cuadriláteros son polígonos");
        }
        else{
            System.out.println("Todo lo demás es un polígono");
        }
    }
    
    
}
