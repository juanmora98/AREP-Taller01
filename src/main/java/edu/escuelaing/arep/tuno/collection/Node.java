package edu.escuelaing.arep.tuno.collection;

public class Node<T> {

    private T data;
    private Node<T> nextNode;

    public Node(T data, Node<T> nextNode){
        this.data = data;
        this.nextNode = nextNode;
    }

    public T getData() {
        return data;
    }

    public void setNextNode(Node<T> nextNode){
        this.nextNode = nextNode;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }
}
