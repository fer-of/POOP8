/*
 * Click nbfs://nbhost/SytemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 * Esta clase representa un triángulo, que es un tipo de polígono
 * Un triángulo se define por sus lados y ángulos
 * Tambien hereda los métodos y atributos de la clase Poligono
 *
 * @author Fer Ordoñez 
 * @version 06/04/2023
 */
public class Triangulo extends Poligono {
    private int alfa, beta, gama;
    
    private float a, b, c, base, alt;

    /**
     * Constructor vacío de la clase Triangulo
     */
    public Triangulo() {
    }

    /**
     * Constructor de la clase Triangulo que inicializa los ángulos, lados y dimensiones base y altura
     * @param alfa El ángulo alfa del triángulo
     * @param beta El ángulo beta del triángulo
     * @param gama El ángulo gama del triángulo
     * @param a El lado a del triángulo
     * @param b El lado b del triángulo
     * @param c El lado c del triángulo
     * @param base La base del triángulo
     * @param alt La altura del triángulo
     */
    public Triangulo(int alfa, int beta, int gama, float a, float b, float c, float base, float alt) {
        this.alfa = alfa;
        this.beta = beta;
        this.gama = gama;
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.alt = alt;
    }

    /**
     * Constructor de la clase Triangulo que inicializa la base y la altura del triángulo
     * @param base La base del triángulo.
     * @param alt  La altura del triángulo.
     */
    public Triangulo(float base, float alt) {
        this.base = base;
        this.alt = alt;
    }

    // Getters y setters omitidos por brevedad

    /**
     * Calcula el perímetro del triángulo
     * @return El perímetro del triángulo
     */
    @Override
    public float perimetro() {
        return base * 3; 
    }

    /**
     * Calcula el área del triángulo
     * @return El área del triángulo
     */
    @Override
    public float area() {
        return (base * alt) / 2;
    }

    /**
     * Retorna una representación en cadena del objeto Triangulo
     * Metodo de sobreescritura
     * @return Una cadena que representa el objeto Triangulo
     */
    @Override
    public String toString() {
        return super.toString() + "Triangulo{" + "alfa=" + alfa + ", beta=" + beta + ", gama=" + gama + ", a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", alt=" + alt + '}';
    }
}
