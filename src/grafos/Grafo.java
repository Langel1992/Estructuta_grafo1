/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Luis Angel
 */
public class Grafo {

    private ArrayList<Nodo> nodos;

    public void addNodo(Nodo nodo) {
        if (nodos == null) {
            nodos = new ArrayList<>();
        }

        nodos.add(nodo);
    }

    public List<Nodo> getNodos() {
        return nodos;
    }

    ArrayList<Nodo> RutaNodos = new ArrayList<>();

    public String EdgeCortoDe(Nodo Origen, Nodo Fin) {
        if (nodos.contains(Origen) && nodos.contains(Fin)) {
            RutaNodos.add(Origen);
            ArrayList<Edge> EdgesPorNodo = Origen.getEdges();
            for (Edge edge : EdgesPorNodo) {
                    if(edge.getDestino().equals(Fin)){
                        if (!RutaNodos.contains(Fin)) {
                            return edge.getOrigen().getCiudad() +"\n" + EdgeCortoDe(edge.getDestino(), Fin);                            
                        }
                    }else{
                        return edge.getDestino().getCiudad();
                    }
            }
        } else {
            return "NOOO Existen Nodos";
        }
        return null;
    }

    public Nodo ObtenerNodo(String valor) {
        for (Nodo nodo : nodos) {
            if (nodo.getCiudad().equals(valor)) {
                return nodo;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Grafo{ \n" + "\tnodos=" + nodos + "\n}";
    }

}
