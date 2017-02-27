/*

Universidad del Valle de Guatemala

Algoritmos y Estructuras de Datos



Autores:
Luis Carlo Ramirez 15019
Mario Hernández 15135


*/
public class DoublyLinkedNode<E> 

{

protected E data;

protected DoublyLinkedNode<E> nextElement;

protected DoublyLinkedNode<E> previousElement;



public DoublyLinkedNode(E v,

                        DoublyLinkedNode<E> next,

                        DoublyLinkedNode<E> previous)

{

    data = v;

    nextElement = next;

    if (nextElement != null)

        nextElement.previousElement = this;

    previousElement = previous;

    if (previousElement != null)

        previousElement.nextElement = this;

}



public DoublyLinkedNode(E v)

// post: constructs a single element

{

    this(v,null,null);

}



public E value() {

    return data;

}



public void setNext(DoublyLinkedNode<E> next) {

    nextElement = next;

}



public DoublyLinkedNode<E> previous() {

    return previousElement;

}

}