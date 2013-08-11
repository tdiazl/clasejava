
package clase2.aula.objetos;
public class Tigre extends Animal{
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
}
