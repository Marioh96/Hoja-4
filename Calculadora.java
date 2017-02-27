/*

Universidad del Valle de Guatemala

Algoritmos y Estructuras de Datos



Autores:
Luis Carlo Ramirez 15019
Mario Hernández 15135


Clase para evaluar postfix

*/

public class calculadora {

    

    static boolean instance_flag = false;

        

    //Se implementa el Singleton en el constructor

    public calculadora() throws SingletonException {

        if (instance_flag)

            throw new SingletonException("Solo se permite una instancia de esta clase.");

        else

            instance_flag = true;

        System.out.println("Calculadora abierta.");

    }

    

    //Funcion para evaluar el postfix si se pide un Stack

    /**
     *
     * @param String 's' y un int 'opc'
     * @return resultado en double
     */

    public double evalStack(String s, int opc) {

        

        Stack<Double> stack = null;

        switch (opc) {

            case 1:

                //La variable se instancia de la clase StackArrayList en caso que el usuario haya elegido la primera opcion

                stack = new StackArrayList();

                break;

            case 2:

                //La variable se instancia de la clase StackVector en caso que el usuario haya eleigod la segunda opcion

                stack = new StackVector();

                break;

        }

        

        //Se recorre el string caracter por caracter

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            //Si el caracter es un digito, se agrega el stack

            if (Character.isDigit(ch)) {

                stack.push(Double.parseDouble(Character.toString(ch)));

            } else {

                //Si el caracter no es un digito, se ralizan las operaciones correspondientes con los numeros en el stack

                switch (ch) {

                    case '+':

                        stack.push(stack.pop() + stack.pop());

                        break;

                    case '-':

                        stack.push(stack.pop() - stack.pop());

                        break;

                    case '*':

                        stack.push(stack.pop() * stack.pop());

                        break;

                    case '/':

                        stack.push(stack.pop() / stack.pop());

                        break;

                }

            }

        }

        return stack.pop();

    }

    

    //Funcion para evaluar el postfix si se pide una Lista

    /**
     *
     * @param String 's' y un int 'opc'
     * @return resultado en double
     */

    

    public double evalList(String s, int opc) {

        List<Double> stack = null;

        switch (opc) {

            case 1:

                //En caso que se haya elegido la primera opcion, la variable se instancia de la clase de simple encadenamiento

                stack = new SinglyLinkedList();

                break;

            case 2:

                //En caso que se haya elegido la segunda opcion, la variable se instancia de la clase de doble encadenamiento

                stack = new DoublyLinkedList();

                break;

            case 3:

                //En caso que se haya elegido la tercera opcion, la variable se instancia de la clase de encadenamiento circular

                stack = new CircularList();

                break;

        }

        

        //Se recorre el string caracter por caracter

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            //Si el caracter es un digito, se agrega el stack

            if (Character.isDigit(ch)) {

                stack.addLast(Double.parseDouble(Character.toString(ch)));

            } else {

                //Si el caracter no es un digito, se ralizan las operaciones con los numeros en el stack

                switch (ch) {

                    case '+':

                        stack.addLast(stack.removeLast() + stack.removeLast());

                        break;

                    case '-':

                        stack.addLast(stack.removeLast() - stack.removeLast());

                        break;

                    case '*':

                        stack.addLast(stack.removeLast() * stack.removeLast());

                        break;

                    case '/':

                        stack.addLast(stack.removeLast() / stack.removeLast());

                        break;

                }

            }

        }

        return stack.removeLast();

    }

}