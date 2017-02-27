/*

Universidad del Valle de Guatemala

Algoritmos y Estructuras de Datos



Autores:
Luis Carlo Ramirez 15019
Mario Hernández 15135


*/
public class SinglyLinkedList<E> extends AbstractList<E>

{



   protected int count; // list size

   protected Node<E> head; // ref. to first element



   public SinglyLinkedList()

   // post: generates an empty list

   {

      head = null;

      count = 0;

   }  

  

  @Override

   public boolean contains(E value)

   // pre: value is not null

   // post: returns true iff value is found in list

  {

      Node<E> finger = head;

	  

      while (finger != null &&

             !finger.value().equals(value))

     {

          finger = finger.next();

      }

      return finger != null;

   }

   

  @Override

  public E removeFirst()

  // pre: list is not empty

  // post: removes and returns value from beginning of list

 {

     Node<E> temp = head;

     head = head.next(); // move head down list

     count--;

     return temp.value();

  }

  

  @Override

  public E getFirst()

  // pre: list is not empty

  // post: returns first value in list

  {

      return head.value();

  }

  

  

  public void addFirst(E value)

  // post: value is added to beginning of list

  {

     // note order that things happen:

     // head is parameter, then assigned

     head = new Node<E>(value, head);

     count++;

  }

  

  public void addLast(E value)

  // post: adds value to end of list

  {

    // location for new value

    Node<E> temp = new Node<E>(value,null);

    if (head != null)

    {

    // pointer to possible tail

        Node<E> finger = head;

        while (finger.next() != null)

        {

            finger = finger.next();

        }



        finger.setNext(temp);

    } else head = temp;



    count++;	  

   }

   

    public E removeLast() {

        Node<E> finger = head;

        Node<E> temp;

        int cont = 1;



        if (count != 1) {

            while (cont+1 < count) {

                finger = finger.next();

                cont++;

            }

            temp = finger.next();

            finger.setNext(null);

        } else {

            temp = head;

            head = null;

        }

        

        count--;

        return temp.value();

   }

}