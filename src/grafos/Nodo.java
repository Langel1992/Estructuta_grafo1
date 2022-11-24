/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis Angel
 */
public class Nodo {

    private String ciudad;
    private ArrayList<Edge> edges;

    public Nodo(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public ArrayList<Edge> getEdges() {
        return this.edges;
    }

    public void addEdges(Edge edge) {
        if (this.edges == null) {
            this.edges = new ArrayList<>();
        }
        this.edges.add(edge);
    }

    @Override
    public String toString() {
        return "\n \t\t "
                + "Nodo{" + "\tciudad=" + getCiudad()+ ", "
                + "\n \t\t\t edges=" + getEdges()+ "\n\t\t}";
    }

}
