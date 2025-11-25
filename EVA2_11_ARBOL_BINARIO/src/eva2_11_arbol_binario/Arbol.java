/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_11_arbol_binario;

/**
 *
 * @author yolo1
 */
public class Arbol {
    private int cont;
    private Nodo raiz;
    
    public Arbol(){
        cont = 0;
        raiz = null;
    }
    
    public void agregar(int valor){
       if(raiz == null){ //VERIFICAR SI EL ARBOL ESTA VACÍO
           Nodo nuevo = new Nodo(valor);
           raiz = nuevo;
           cont++;
       }else{
           agregarRecursivo(valor, raiz);
       }
    }
    
   private void agregarRecursivo(int valor, Nodo actual){
       // VERIFICAR A QUE LADO DEL NODO VA
        if(valor < actual.getValor()){//va a la izquierda
            if(actual.getIzquierda() == null){//Vacio
                Nodo nuevo = new Nodo(valor); 
                actual.setIzquierda(nuevo);
                cont++;
            }else{//Esta ocupado
                agregarRecursivo(valor, actual.getIzquierda());
            }
            
        } else if(valor > actual.getValor()){//va a la derecha
            if(actual.getDerecha() == null){//Vacio
                Nodo nuevo = new Nodo(valor); 
                actual.setDerecha(nuevo);
                cont++;
            }else{//Esta ocupado
                agregarRecursivo(valor, actual.getDerecha());
            }
   
        } else {
            // No hago nada 
        }
    }

    
    public int size(){
        return cont;
    }
    
    public void imprimirPreOrder(){
        imprimirPreOrderRec(raiz);
    }
    
    private void imprimirPreOrderRec(Nodo actual){
        if(actual != null){
        System.out.println( actual.getValor ());
        imprimirPreOrderRec(actual.getIzquierda());
        imprimirPreOrderRec(actual.getDerecha());
        }
    }
    public void imprimirInOrder(){
    imprimirInOrderRec(raiz);
}
 
    private void imprimirInOrderRec(Nodo actual){
        if(actual != null){
        imprimirInOrderRec(actual.getIzquierda());      
        System.out.println( actual.getValor ());      
        imprimirInOrderRec(actual.getDerecha());
    }
}
    public void imprimirPostOrder(){
    imprimirPostOrderRec(raiz);
}

    
    private void imprimirPostOrderRec(Nodo actual){
        if(actual != null){
        imprimirPostOrderRec(actual.getIzquierda());
        imprimirPostOrderRec(actual.getDerecha());
        System.out.println( actual.getValor ());
    }
}
    
    
}