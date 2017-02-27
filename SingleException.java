/*

 * To change this license header, choose License Headers in Project Properties.

 * To change this template file, choose Tools | Templates

 * and open the template in the editor.

 */



class SingletonException extends RuntimeException



{



//new exception type for singleton classes



public SingletonException()



{



super();



}



//-----------------------------------------------



public SingletonException(String s)



{



super(s);



}



}