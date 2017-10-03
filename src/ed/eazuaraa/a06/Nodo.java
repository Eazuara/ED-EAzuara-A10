/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.eazuaraa.a06;

/**
 *
 * @author eazuara
 */
public class Nodo <T>  {
    /*T data;
    Nodo next;

    public Nodo(T data) {
        
        next=null;
    }

    public Nodo(T data, Nodo next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
    */
        T data;
    Nodo next;
    Nodo prev;
    public Nodo(T data)
    {
        this.data=data;
        next = null;
        prev = null;
    }
}
   
    

