import java.util.Scanner;
public class CadenasAmigas {
  static boolean sonamigas(String s,String t){
      //deben tener el mismo largo y al menos 2 caracteres (u y v no son vacias)
      if (s.length()!= t.length()|| s.length() <2){
          return false;
      }
      //probar todas las formas de partir s en u y v(ambas no vacias)
      for (int i = 1; i < s.length(); i++){
          String u = s.substring(0, i);
          String v = s.substring(i);
          if((v+u).equals(t)){
              System.out.println("u=\""+u+"\" v=\""+v+"\"");
              return true;
          }
      }
      return false;
  }
  public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      System.out.print("Ingrese la cadena S: ");
      String s=teclado.nextLine();
      System.out.print("Ingrese la cadena T: ");
      String t=teclado.nextLine();
      if (sonamigas(s,t)){
          System.out.println("S y T son amigas");
      }else{
          System.out.println("S y T No son amigas");
      }
      teclado.close();
  }
}
