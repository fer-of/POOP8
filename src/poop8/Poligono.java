/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 * Esta clase representa un polígono genérico.
 * Un polígono es una figura geométrica plana cerrada formada por una secuencia finita de segmentos de recta llamados lados
 * Esta clase es abstracta y proporciona métodos abstractos para calcular el área y el perímetro del polígono
 * 
 * @author Fer Ordoñez
 * @version 06/04/2024
 */

public abstract class Poligono {

    /**
     * Constructor vacío de la clase Poligono
     */
    public Poligono() {
    }

    /**
     * Calcula el área del polígono
     * @return El área del polígono
     */
    public abstract float area();
    
    /**
     * Calcula el perímetro del polígono
     * @return El perímetro del polígono
     */
    public abstract float perimetro();

    /**
     * Retorna una representación en cadena del objeto Poligono
     * @return Una cadena que representa el objeto Poligono
     */
    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
}

