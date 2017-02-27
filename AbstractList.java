/*

Universidad del Valle de Guatemala

Algoritmos y Estructuras de Datos



Autores:
Luis Carlo Ramirez 15019
Mario Hernández 15135


*/
public abstract class AbstractList<E> implements List<E>

{

    Node<E> temp = null;

    

    public AbstractList()

    // post: does nothing

    {

    }



    public boolean isEmpty()

    // post: returns true iff list has no elements

    {

       return size() == 0;

    }

  

    public boolean contains(E value)

    // pre: value is not null

    // post: returns true iff list contains an object equal to value

    {

          return -1 != indexOf(value);

    }

    

    //Metodos que no se utilizan

    public int size() {

        return 0;

    }

    public E get() {

        return temp.value();

    }



    public void clear() {

    }



    public E getFirst() {

        return temp.value();

    }



    public E getLast() {

        return temp.value();

    }



    public E removeFirst() {

        return temp.value();

    }



    public E remove(E value) {

        return temp.value();

    }



    public void add (E value) {



    }



    public E remove() {

        return temp.value();

    }



    public int indexOf (E value) {

        return 0;

    }



    public int lastIndexOf(E value) {

        return 0;

    }



    public E get(int i) {

        return temp.value();

    }



    public E set(int i, E o) {

        return temp.value();

    }



    public void add(int i, E o) {



    }



    public E remove(int i) {

        return temp.value();

    }

}