/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 * Esta clase representa un cuadrilátero, que es un tipo de polígono con cuatro lados.
 * Un cuadrilátero puede tener diferentes formas, como un cuadrado o un rectángulo.
 * Esta clase hereda de la clase Poligono y proporciona métodos para calcular el área y el perímetro del cuadrilátero.
 * 
 * @author Fer Ordoñez
 * @version 06/04/2024
 */
public class Cuadrilatero extends Poligono {
    
    private int alfa, beta;
    private float base, alt;

    /**
     * Constructor que inicializa un cuadrilátero con una base y una altura.
     *
     * @param base La base del cuadrilátero.
     * @param alt  La altura del cuadrilátero.
     */
    public Cuadrilatero(float base, float alt) {
        this.base = base;
        this.alt = alt;
    }
    
    /**
     * Constructor vacío de la clase Cuadrilatero.
     */
    public Cuadrilatero() {
    }

    /**
     * Constructor que inicializa un cuadrilátero con ángulos y dimensiones base y altura.
     *
     * @param alfa El ángulo alfa del cuadrilátero.
     * @param beta El ángulo beta del cuadrilátero.
     * @param base La base del cuadrilátero.
     * @param alt  La altura del cuadrilátero.
     */
    public Cuadrilatero(int alfa, int beta, float base, float alt) {
        this.alfa = alfa;
        this.beta = beta;
        this.base = base;
        this.alt = alt;
    }

    /**
     * Calcula el perímetro del cuadrilátero.
     *
     * @return El perímetro del cuadrilátero.
     */
    @Override
    public float perimetro() {
        return base * 4; 
    }

    /**
     * Calcula el área del cuadrilátero.
     *
     * @return El área del cuadrilátero.
     */
    @Override
    public float area() {
        return base * alt;
    }
    
    /**
     * Retorna una representación en cadena del objeto Cuadrilatero.
     *
     * @return Una cadena que representa el objeto Cuadrilatero.
     */
    @Override
    public String toString() {
        return super.toString() + "Cuadrilatero{" + "alfa=" + alfa + ", beta=" + beta + ", base=" + base + ", alt=" + alt + '}';
    }
}
