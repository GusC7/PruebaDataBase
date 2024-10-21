//Escenario 2: Método obsoleto con sugerencia de uso alternativo
//Descripción: Tienes un método que ha quedado obsoleto, y quieres documentarlo para que no sea utilizado, sugiriendo un nuevo método.
/**
 * Este es un ejemplo de codigo para el Escenario2
 * @author Grupo 1
 */
public class Escenario2 {

  /**Constructor por defecto*/ 
  public Escenario2() {
  }
  /**
   * Este metodo main muesta un "HolaMundo"
   * 
   * @param args es un parametro
   * 
   * 
   * @deprecated el metodo main quedó en desuso luego de iniciar el proyecto
   * Se cambió por {@link #metodoString(int)}
   * @author Grupo 1
   */
  @Deprecated
  public static void main(String[] args) {
    System.out.println("Hola, mundo!");
  }

  /** Este metodo evalua el parametro ingresado y devuelve "a" o "x" según el valor de n
   * @param n este parametro es el que evalua el metodo
   * @return "a" si n es cero y "x" si n es distinto de cero
   * @author Grupo 1
  */
  public String metodoString(int n) /**método con un parámetro*/ 
  {
    if (n == 0)/** Usamos el parámetro en la función*/ 
    {
      return "a"; /**Si n es cero retorna a*/ 
    }
    return "x";/**Este return sólo se ejecuta cuando n NO es cero*/ 
  }
}
