/*le pongo un comentario */
package maquinacafe;

import maquinacafe.cafe.Ristretto;
import maquinacafe.te.Verde;

import java.util.Scanner;
import maquinacafe.cafe.Expresso;
import maquinacafe.cafe.Normal;
import maquinacafe.te.Negro;
import maquinacafe.te.Rojo;

public class Principal {

    public static void main(String[] args) {

        Bebida[] pedido = new Bebida[200];
        /*El Arrary debería ser de Bebidas y tener un número arbitrario 
        de índices. por ejemplo 20
         */

        //Ciclo while para tomar pedidos
        boolean otroPedido = true;
        int siguiente = 0;//iterador

        while (otroPedido) {

            //el usuario ingresa una clase de bebida
            System.out.println("¿Qué tipo de bebida quiere?\n"
                    + "1)Café\n"
                    + "2)Té\n");
            Scanner entrada = new Scanner(System.in);
            int clase = entrada.nextInt();

            if (clase == 1) {
                //pedido[0] = "Café";
                System.out.println(""
                        + "1-Expresso\n"
                        + "2-Ristretto\n"
                        + "3-Normal\n");
                Scanner entradacafe = new Scanner(System.in);
                int tipoCafe = entradacafe.nextInt();//usuario define tipo            
                switch (tipoCafe) {
                    case 1:
                        pedido[siguiente] = new Expresso();//Guardo el la bebida en el índice
                        break;
                    case 2:
                        pedido[siguiente] = new Ristretto();//Guardo el la bebida en el índice
                        break;
                    case 3:
                        pedido[siguiente] = new Normal();//Guardo el la bebida en el índice
                        break;
                }

                System.out.println("¿Cuantas cucharas de azúcar?0-3");
                Scanner entradaazucar = new Scanner(System.in);
                int azucar = entradacafe.nextInt();//usuario define azúcar
                pedido[siguiente].setAzucar(azucar);

                System.out.println("¿Cuanta leche?0-3");
                Scanner entradaleche = new Scanner(System.in);
                int leche = entradaleche.nextInt();//usuario define leche
                pedido[siguiente].setLeche(leche);
            }

            if (clase == 2) {
                //pedido[0] = "Té";
                System.out.println(""
                        + "1-Negro\n"
                        + "2-Rojo\n"
                        + "3-Verde\n");
                Scanner entradacafe = new Scanner(System.in);
                int tipoTe = entradacafe.nextInt();//usuario define tipo            
                switch (tipoTe) {
                    case 1:
                        pedido[siguiente] = new Negro();//Guardo el la bebida en el índice
                        break;
                    case 2:
                        pedido[siguiente] = new Rojo();//Guardo el la bebida en el índice
                        break;
                    case 3:
                        pedido[siguiente] = new Verde();//Guardo el la bebida en el índice
                        break;
                }

                System.out.println("¿Cuantas cucharas de azúcar?0-3");
                Scanner entradaazucar = new Scanner(System.in);
                int azucar = entradacafe.nextInt();//usuario define azúcar
                pedido[siguiente].setAzucar(azucar);

                System.out.println("¿Cuanta leche?0-3");
                Scanner entradaleche = new Scanner(System.in);
                int leche = entradaleche.nextInt();//usuario define leche
                pedido[siguiente].setLeche(leche);
            }

            System.out.println("¿Desea ordenar algo más?\n"
                    + "1-Sí\n"
                    + "2-No\n");
            Scanner entradaOtroPedido = new Scanner(System.in);
            int otro = entradaOtroPedido.nextInt();
            if (otro == 1) {
                siguiente++;
            } else {
                otroPedido = false;
            }

        }

        //Se termina los pedidos y se hace  la cuenta
        double subtotal = 0, total = 0;

        for (int i = 0; i < pedido.length; i++) {
            //Verifico que no sean nulos
            if (pedido[i] != null) {
                System.out.println(pedido[i]);
                subtotal = subtotal + pedido[i].getPrecio()
                        + pedido[i].getAzucar() * 5
                        + pedido[i].getLeche() * 5;
                
            }

        }
        total = subtotal * 1.21;
        System.out.println("Subtotal:" + subtotal);
        System.out.println("Total:" + total);
        

    }
}
