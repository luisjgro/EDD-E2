/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_queue;

/**
 *
 * @author yolo1
 */
public static void main(String[] args) {
        // TODO code application logic here
        MyQueue cola = new MyQueue();
        cola.push(100);
        cola.push(200);
        cola.push(300);
        cola.push(400);
        System.out.println(cola.peek());
        System.out.println(cola.pop());
        cola.imprimir();
            
    }
    