/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2.aula.figuras;

/**
 *
 * @author PFR
 */
public class Rectangulo extends Shape{

    @Override
    public Double getArea() {
       return this.getAncho()*this.getAlto();    }
    
}
