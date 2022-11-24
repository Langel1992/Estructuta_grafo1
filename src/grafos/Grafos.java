/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grafos;

/**
 *
 * @author Luis Angel
 */
public class Grafos {

    /**
     * @return 
     */
    
    public static Grafo getCiudades(){
        Nodo df = new Nodo("D.F.");
        Nodo toluca = new Nodo("Toluca");
        Nodo tlaxcala = new Nodo("Tlaxcada");
        Nodo puebla = new Nodo("Puebla");
        Nodo cuernavaca = new Nodo("Cuernavaca");
        
        df.addEdges(new Edge(df, toluca, 100));
        df.addEdges(new Edge(df, cuernavaca, 90));
        
        toluca.addEdges(new Edge(toluca, cuernavaca, 150));        
        toluca.addEdges(new Edge(toluca, puebla, 350));
        toluca.addEdges(new Edge(toluca, tlaxcala, 340));
        
        puebla.addEdges(new Edge(puebla, tlaxcala, 20));
        
        cuernavaca.addEdges(new Edge(cuernavaca, puebla, 100));
        
        /////////////Extra
        toluca.addEdges(new Edge(toluca, df, 100));
        
        tlaxcala.addEdges(new Edge(tlaxcala, toluca, 340));
        tlaxcala.addEdges(new Edge(tlaxcala, puebla, 20));
        
        puebla.addEdges(new Edge(puebla, toluca, 350));
        puebla.addEdges(new Edge(puebla, cuernavaca, 100));
        
        cuernavaca.addEdges(new Edge(cuernavaca, df, 90));
        cuernavaca.addEdges(new Edge(cuernavaca, toluca, 150));        
        ////////////
        
        Grafo graph = new Grafo();
        graph.addNodo(df);
        graph.addNodo(toluca);
        graph.addNodo(puebla);
        graph.addNodo(cuernavaca);
        return graph;
    }
    public static void main(String[] args) {
        Grafo graf = getCiudades();
        System.out.println(graf.toString());
        System.out.println("\n\n");
    }
}
