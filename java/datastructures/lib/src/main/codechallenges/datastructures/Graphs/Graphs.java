package datastructures.Graphs;

import java.util.HashMap;
import java.util.LinkedList;

public class Graphs<T extends Comparable<? super T>> implements Comparable<Graphs<T>> {

  public HashMap<Vertex<T>, LinkedList<Edge<T>>> adjacencyLists;
  private int numberOfVertices = 0;

  public Graphs(int numberOfVertices){
    this.numberOfVertices = numberOfVertices;
  }

  public Vertex<T> addVertex(T value) {
    Vertex<T> newV = new Vertex<>(value);
    adjacencyLists.put(newV, new LinkedList<>());

    return newV;
  }

  public void addEdge(Vertex<T> start, Vertex<T> destination) {
    addEdge(start, destination, 0);
  }
  public void addEdge(Vertex<T> start, Vertex<T> destination, int weight){

  }

  public LinkedList<Edge<T>> getVertices(){


    return null;
  }

  public int size(){
    return numberOfVertices;
  }

  @Override
  public int compareTo(Graphs<T> o){
    throw  new UnsupportedOperationException("Graph does not implement compareTo()");
  }

  @Override
  public String toString(){



    return "";
  }
}
