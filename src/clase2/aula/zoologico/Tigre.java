
package clase2.aula.zoologico;
public class Tigre extends Animal{

    public Tigre() {
        
        this.setNumeroPatas(4);
        
    }
    
     public Tigre(String nombre) {
             this.setNumeroPatas(4);
             this.setNombre(nombre);
        
    }
    
    //sobreescribir el metodo de su padre animal
    @Override// indica a JVM que es un metodo sobre escrito
    public void hacerRuido(){
            System.out.println("rugir");
        }
   //un mismo metodo ejcutadno varias acciones, es sobrecarga del msismo metodo
    
   public void hacerRuido(boolean  molestar){
       if(molestar){
            System.out.println("rugir y rarpar");
       }   
   }
    
   public void hacerRuido(String mensaje){
     
   }
void  zarpar(){
    System.out.println("zarpar");

}
  
   
}
