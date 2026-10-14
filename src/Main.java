import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //se le pide al usuario que digite el numero para basarse el arreglo
        Scanner teclado = new Scanner(System.in);
        System.out.print("¿Cuantos elementos tiene el arreglo? ");
       int numero = teclado.nextInt();
       if(numero<=0) {
           System.out.println("se necesita un numero natural para hallar la mediana del arreglo");
           return;
       }
       //se leen los elementos del arreglo
        double[]x=new double[numero];
        for(int i=0;i<numero;i++) {
            System.out.print("x["+i+"] = ");
            x[i]=teclado.nextDouble();
        }
        reales(x);
        teclado.close();
    }
    public static void reales(double[] x) {
        int n=x.length;
        //ordenar de menor a mayor
        for (int i=0;i<n-1;i++) {
            for (int j=0;j<n-1-i;j++) {
                if(x[j]>x[j+1]) {
                    double temp=x[j];
                    x[j]=x[j+1];
                    x[j+1]=temp;
                }
            }
        }
        //hallar la mediana
        if(n%2==0) {
            double mediana = (x[n/2-1]+x[n/2])/2;
            System.out.println("la mediana del arreglo es: "+ mediana);
        }else{
            System.out.println("la mediana del arreglo es: "+ x[n/2]);
        }
    }
}
