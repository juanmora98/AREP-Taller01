package edu.escuelaing.arep.tuno.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedList<T> implements List<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    /**
     *
     */
    public LinkedList(){
        head = tail = null;
        size = 0;
    }

    /**
     * Adds the element to the end of the list
     * @param data The element to add
     * @return true
     */
    public boolean add(T data) {
        if (isEmpty()){
            head = tail =  new Node<T>(data, null);
        }
        else{
            Node<T> addedNode = new Node<T>(data , null);
            tail.setNextNode(addedNode);
            tail = addedNode;
        }
        size++;
        return true;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Iterator<T> iterator() {
        return new Iterator<T>() {

            Node<T> currentNode = head;

            public boolean hasNext() {
                return currentNode != null;
            }

            public T next() {
                T data = currentNode.getData();
                currentNode = currentNode.getNextNode();
                return data;
            }

            public void remove() {
            }
        };
    }

    public boolean remove(Object o) {
        return false;
    }

    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    public boolean addAll(Collection<? extends T> collection) {
        return false;
    }

    public boolean addAll(int i, Collection<? extends T> collection) {
        return false;
    }

    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    public void clear() {

    }

    public T get(int i) {
        return null;
    }

    public T set(int i, T t) {
        return null;
    }

    public void add(int i, T t) {

    }

    public T remove(int i) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    public ListIterator<T> listIterator() {
        return null;
    }

    public ListIterator<T> listIterator(int i) {
        return null;
    }

    public List<T> subList(int i, int i1) {
        return null;
    }

    public boolean contains(Object o) {
        return false;
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public <T1> T1[] toArray(T1[] t1s) {
        return null;
    }
}
