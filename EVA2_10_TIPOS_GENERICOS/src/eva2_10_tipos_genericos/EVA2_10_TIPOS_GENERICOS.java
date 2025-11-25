/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_tipos_genericos;

/**
 *
 * @author yolo1
 */
public class EVA2_10_TIPOS_GENERICOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nodo<String> nodo = new Nodo<String>();
        nodo.setValor("Juan Perez");
    }
}
class Nodo<T>{
    private T valor;
    private Nodo siguiente;
    private Nodo previo;
    
    public Nodo(){
        siguiente = null;
        previo = null;
        
    }

    public T getValor() {
        return valor;
    }

    public void setValor(String T) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getPrevio() {
        return previo;
    }

    public void setPrevio(Nodo previo) {
        this.previo = previo;
    }

    
    
}
