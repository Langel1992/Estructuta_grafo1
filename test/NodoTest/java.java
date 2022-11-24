/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NodoTest;

import grafos.*;

public class java {
    public static void main(String [] args) {
        Nodo c1 = new Nodo("Ciudad1");
        Nodo c2 = new Nodo("Ciudad2");
        Edge destino1 = new Edge(c1, c2, 500);
        c1.addEdges(destino1);
        System.out.println(c1);
    }
}
