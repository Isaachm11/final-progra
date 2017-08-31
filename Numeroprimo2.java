import java.util.Scanner;
public class Numeroprimo2

{

  public static void main(String[] args)
  {
    int a,b,acum;
    String d;

    acum=0;

    Scanner np = new Scanner (System.in);

    System.out.print("Dame un número mayor a 1 para ver si es primo:");

    a = np.nextInt();

    if (a<1) {
        System.out.print("Verifica que el número sea mayor a 1 e intentalo de nuevo:");
        a = np.nextInt();
    } else {
        for ( b=1 ; b<=a ; b++ ) {
          if (a%b == 0) {
            acum = acum+1;
          }
        }

        if (acum == 2) {
          System.out.println(a + " es número primo");
        } else if (acum != 2) {
          System.out.println(a + " no es un número prim");
        }

    }

  }
}
