
package clase2.aula.figuras;

public abstract class Shape {
   private  double alto;
   private  double ancho;

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
   public abstract  Double getArea();
   
   public static void doAbstract(){
   
   
   }
          
}
