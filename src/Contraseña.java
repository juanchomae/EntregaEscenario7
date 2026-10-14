import java.util.Scanner;
public class Contraseña {
    static boolean Segura(String clave){
        boolean hayletra= false;
        boolean haydigito= false;
        boolean haysimbolo= false;
        //revisar caracter por caracter
        for (int i=0;i<clave.length();i++){
            char c=clave.charAt(i);
            if ((c>='A'&& c<='Z')||(c>='a'&&c<='z')){
                hayletra=true;
            }else if ((c>='0'&& c<='9')){
                haydigito=true;
            }else{
                haysimbolo=true;//cualquier otro tipo de caracter que no sea letra o sea numero
            }
        }
        boolean largoOK=clave.length()>=10;
        //si la clave no es segura indica que falta:
        if(!largoOK){
            System.out.println("contraseña muy corta");
        }if(!hayletra){
            System.out.println("hace falta un caracter de letra(a-z o A-Z) ");
        }if (!haydigito){
            System.out.println("hace falta almenos un numero (0-9)");
        }if (!haysimbolo){
            System.out.println("hace falta almenos un simbolo (.,:-)");
        }
        return hayletra && haydigito && haysimbolo && largoOK;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la contraseña: ");
        String clave = teclado.next();
        if (Segura(clave)){
            System.out.println("la contraseña es segura");
        }
        else{
            System.out.println("la contraseña NO es segura");
        }
        teclado.close();
    }
}
