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
public class  CList <T> 
{
    Nodo<T> pivot;
    Nodo<T> pointer;
    int length;
    public CList()
    {
        pivot = pointer = null;
        length = 0;
    }
    public CList(T d)
    {
        Nodo node = new Nodo(d);
        pivot = node.next=node;
        length++;
    }
    boolean isEmpty()
    {
        return length==0;
    }
    void insert(T d)
    {
        Nodo node = new Nodo(d);
        if(isEmpty())
        {
            pivot = node.next = node;
        }
        else
        {
            node.next = pivot.next;
            pivot.next = node;
        }
        length++;
    }
    void deleteNode(T d)
    {
        if(!isEmpty())
        {
            pointer=pivot;
            for(int i = 1;i<=length;i++)
            {
                pointer.next = pointer.next.next;
                if(pivot.data==d)
                {
                    pivot = pointer;
                }
                length--;
                pointer = null;
                i = length+1;
            }
        }
        pointer = null;
    }
    void deleteList()
    {
        if(!isEmpty())
        {
            pointer = pivot;
            while(!isEmpty())
            {
                pointer = pointer.next;
                length--;
            }
            pointer.next = null;
        }
        pointer = null;
    }
    void showList()
    {
        if(!isEmpty())
        {
            System.out.print("start->");
            pointer = pivot;
            for(int i=0;i<length;i++)
            {
                System.out.print("["+pointer.data+"]");
                pointer = pointer.next;
            }
            System.out.print("<-end");
            System.out.println("");
        }
        else
        {
            System.out.println("The list is empty!");
        }
        pointer = null;
    }
    void showListbyAddress()
    {
        if(!isEmpty())
        {
            System.out.print("start->");
            pointer = pivot;
            for(int i=1;i<=length;i++)
            {
                System.out.print("["+pointer+"]");
                pointer = pointer.next;
            }
            System.out.print("<-end");
            System.out.println("");
        }
        else
        {
            System.out.println("The list is empty!");
        }
        pointer = null;
    }
}