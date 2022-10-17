package datastructures.HashTables;

import datastructures.linkedlist.Node;

import java.util.ArrayList;
import java.util.LinkedList;

import static java.util.Objects.hash;

public class HashMap<K, V> {

  ArrayList<LinkedList<HashMap<K,V>>> bucketArrayList;
  int size;

  public HashMap(int size){
    if (size < 1){
      throw new IllegalArgumentException("Hashmap size must be greater than 1");
    }
    this.size = size;
    this.bucketArrayList = new ArrayList<>(size);


    for(int i =0; i < this.size; i++){
      bucketArrayList.add(i, new LinkedList<>());
    }
  }
  public void set(K key, V value){
    int index = hash(key);
    HashMapPair<K,V> newEntry = new HashMapPair<>(key, value);
    if (bucketArrayList.get(index) != null){
      LinkedList<HashMapPair<K, V>> list = bucketArrayList.get(index);
      Node<HashMapPair<K, V>> currentNode;
      while (currentNode != null && !currentNode.value.getKey().equals(key)){
        currentNode = currentNode.next;
      }
      if(currentNode != null && !currentNode.value.equals(value)){
        currentNode.value.setValue(value);
        return;
      }
    }
    LinkedList<HashMapPair<K, V>> list = bucketArrayList.get(index);
    list.append(newEntry);
    bucketArrayList.set(index, list);
  }

  public V get (K key){

    return null;
  }

  public boolean contains(K key){
  int index = hash(key);
  Node<HashMap<K,V>> current = bucketArrayList.get(index).getHead();
  while (current != null) {
    if (current.value.getKey().equals(key)){
      return true;
    } else{
      current = current.next;
    }
  }
  return false;
  }
}


  public String repeatedWord(String string){
    String stringLower = string.toLowerCase();
    String[] stringArray = stringLower.split("\\W+");
    HashMap<String , Integer> hashMap = new HashMap<>(stringArray.length);
    for (int i = 0; i < stringArray.length; i++){
      if (hashMap.contains(stringArray[i])){
        return stringArray[i];
      } else{ hashMap.set(stringArray[i], i);
    }

  }
    return  "No repeats.";
}
