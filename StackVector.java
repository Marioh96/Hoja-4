/*

Universidad del Valle de Guatemala

Algoritmos y Estructuras de Datos



Autores:
Luis Carlo Ramirez 15019
Mario Hernández 15135




*/
import java.util.Vector;



public class StackVector<E> extends AbstractStack<E>

{

    protected Vector<E> data;



    public StackVector()

	// 

	{

		data = new Vector<E>();

	}



    public void push(E item)

	// post: the value is added to the stack

	//          will be popped next if no intervening push

	{

		data.add(item);

	}



    public E pop()

	// pre: stack is not empty

	// post: most recently pushed item is removed and returned

	{

		return data.remove(size()-1);

	}



    public E peek()

	// pre: stack is not empty

	// post: top value (next to be popped) is returned

	{

		return data.get(size() - 1);

	}

	

    public int size()

	// 

	{

		return data.size();

	}

}