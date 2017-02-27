/*

Universidad del Valle de Guatemala

Algoritmos y Estructuras de Datos



Autores:
Luis Carlo Ramirez 15019
Mario Hernández 15135



Programa que lee una expresion en postfix desde un archivo .txt, la evalua y muestra el resultado en pantalla.

*/

import java.io.BufferedReader;

import java.io.FileReader;

import java.io.IOException;

import java.util.Scanner; //Importa la clase del Scanner





public class main {

    /**
     *
     * @param args
     */

    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in); //Variable para leer los datos ingresados por el usuario

        calculadora calc = new calculadora(); //Objeto para calcular el postfix

        Double resp = 0.0; //Variable para guardar la respuesta del postfix

        String linea = ""; //Variable para guardar la linea del archivo

        int opc; //Variable para guardar la opcion elegido por el usuario

    

        //Se lee el archivo y se guarda la primera linea del archivo en una variable

        BufferedReader br = null;

        try {

            br = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\prueba.txt"));



            linea = br.readLine();



        } catch (IOException e) {

                e.printStackTrace();

        } finally {

            try {

                if (br != null)

                    br.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }

        

        //Se muestra en pantalla el menu para el usuario

        System.out.println("Que tipo de stack desea utilizar:");

        System.out.println(

                "1. ArrayList\n" +

                "2. Vector\n" +

                "3. Lista");

        

        //Se guarda la opcion elegida por el usuario

        opc = (int)teclado.nextDouble();

        

        //Se varifica si el usuario quiere usar un Stack o una Lista

        if (opc == 3) {

            //Se muestra el menu en caso que el usuario haya pedido una Lista

            System.out.println("Que tipo de lista desea:");

            System.out.println(

                "1.Simplemente encadenada\n" +

                "2.Doblemente encadenada\n" +

                "3.Lista circular");

            

            opc = (int)teclado.nextDouble();

            

            resp = calc.evalList(linea, opc);

        } else {

            resp = calc.evalStack(linea, opc);

        }

        

        //Se muestra en pantalla el resultado

        System.out.println("El resultado es: "+resp);

    }

}