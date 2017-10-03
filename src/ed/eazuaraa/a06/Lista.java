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
public class Lista <T> {
    Nodo first;
    Nodo last;
    Nodo pointer;
    
    Lista(){
        first=null;
        last=null;
        pointer=null;
    }
    
    Lista(T data){
      Nodo nodo = new Nodo(data);
      first=nodo;
      last=nodo;
      nodo.next=null;
    }
    
    public boolean isEmpty(){
        return first==null && last==null;
    }
    
    public void insertFirst(T data){
        Nodo nodo = new Nodo(data);
        if(isEmpty()){// Si esta vacia?
           first=nodo;
           last=nodo;
           nodo.next=null;
        }else{//Caso : Lista con elementos
            nodo.next=first;
            first=nodo;
    }
}
    
    public void inserLast(T data){
        Nodo nodo = new Nodo(data);
        if(isEmpty()){// Si esta vacia?
           first=nodo;
           last=nodo;
           nodo.next=null;
        }else{//Caso : Lista con elementos
            last.next=nodo;
            last=nodo;
    }
    }
    //Eliminar
    public void deleteFirst(){
        if(!isEmpty()){
            if(first.next == null){//si la lista solo tiene un elemento
                first=null;
                last=null;
        }else{ //si la lista tiene mas de un elemento
                first=first.next;
            }
    }
}
    //Eliminar al final
    public void deleteLast(){
        if(!isEmpty()){
            if(first==last){//Si la lista solo tiene un elemento
                first=last=null;
            }else{//Buscamos dentro del arreglo
                pointer=first;
            while(pointer.next!=last){
                pointer=pointer.next;
            }
            last=pointer;
            pointer=null;
            }
    }
}
    //Eliminar Nodo
    public boolean deleteNodo(T n){
        Nodo p=Fetchback(n);
        if(p!=null){
            if(p.data==n){
                deleteFirst();
            }else{
                p.next=p.next.next;
            }
             return true;   
        }
        return false;
        }
       
    public Nodo Fetch(T n){
        // Si no esta vacio
        if(!isEmpty()){
            if(first==last){
                if(first.data==n){
                    return first;
                }else{
                    pointer=first;
                }
            }
        
        return null;
    }
    }

    
    public Nodo Fetchback(T n){
        
        boolean finded=false;
        pointer=first;
        if(!isEmpty()){
            if(first==last){//Si hay solo un elemento
              if(first.data==n){//Es el elemento que busco?
                return first;//Se devuelve a si mismo
              }else{
                  return null;
              }
            }else{//Si hay mas elementos en la lista
                if(first.data==n){
                    return first;
                    
                }else{
                    pointer=first;
                    while(pointer.next!=last){
                        if(pointer.next.data==n){
                            return pointer;
                        }
                        pointer=pointer.next;
                    }
                }
            }
        }
        return null;
   
    }
}
    




