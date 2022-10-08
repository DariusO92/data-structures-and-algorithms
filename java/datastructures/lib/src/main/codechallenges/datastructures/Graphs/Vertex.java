package datastructures.Graphs;

import java.util.LinkedList;
import java.util.Objects;

public class Vertex<T extends Comparable<? super T>>  implements Comparable<Vertex<T>>{

  private LinkedList<Edge> edges;
  public T value;
  public Vertex(T value){
    this.value = value;
    this.edges = new LinkedList<>();
  }



  @Override
  public int compareTo(Vertex<T> o){
    throw new UnsupportedOperationException("Vertex does not implement compareTo()");

  }

  @Override
  public  int hashCode(){
    return Objects.hash(value);
  }

  @Override
  public  boolean equals(Object o){
    if (this ==o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Vertex<?> vertex = (Vertex<?>) o;
    return Objects.equals(value, vertex.value);
  }

  public void addEdge(Vertex<T> destination, int weight) {
  }
}
