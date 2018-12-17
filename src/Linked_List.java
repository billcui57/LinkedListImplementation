/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 348848128
 */
public class Linked_List<T extends Comparable<T>> {

    Node<T> head;
    Node<T> tail;

    /**
     * Constructor for linked list, begins with head and tail null
     */
    public Linked_List() {
        head = null;
        tail = null;

    }

    /**
     * Gets the size of the linked list
     * @return the linked list size
     */
    public int getSize() {
        Node<T> temp = head;
        int i = 0;
        //if linnked list is empty
        if(head==null){
            return 0;
        }
        
        //if there is a next node then add 1
        while (temp.hasNext()) {
            temp = temp.next;
            i++;
        }
        i++;
        return i;
    }

    /**
     * Adds a new node with specified value at the next index
     * @param value value to be added
     */
    public void add(T value) {
        Node<T> temp = new Node<T>(value);
        //if linked list is empty
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            //if not, then set it to be the next after the last and set the last to be equal to it
            tail.next = temp;
            tail = temp;
        }
    }

    /**
     * Adds a new value holding node at specified index
     * @param value value to be added
     * @param index index to be added after
     */
    public void add(T value, int index) {
        //creates a temp linked list and adds it using the linked list insertion method
        Linked_List temp = new Linked_List();
        temp.add(value);
        this.add(temp, index);
    }

    /**
     * Adds a linked list within a linked list
     * @param insert linked list to be added
     * @param index index to be added after
     */
    public void add(Linked_List insert, int index) {
        Node<T> temp = this.get(index);
        Node<T> placeHolder = temp.next;
        //links the head and tail of the inserted linked list with ends of the linked list after specified index
        temp.next = insert.head;
        insert.tail.next = placeHolder;
    }

    /**
     * Gets the value at specified index
     * @param index index to be returned
     * @return value at index
     */
    public Node<T> get(int index) {
        // if requested index is greater than the size of the linked list
        if (index > this.getSize() - 1) {
            return null;
        }
        //else return value at that index
        Node<T> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    /**
     * Replaces node index with new node
     * @param temp new node
     * @param index index
     */
    public void set(Node<T> temp, int index) {
        this.set(temp.value, index);
    }

    /**
     * Replaces node's value at index with new value
     * @param temp value
     * @param index index 
     */
    public void set(T temp, int index) {
        this.get(index).value = temp;
    }

    /**
     * Removes node at index
     * @param index specified index
     */
    public void remove(int index) {
        Node<T> temp;
        //if removing head, set the next node to be head
        if (index == 0) {
            this.head = this.head.next;
        } else {
            //if not then remove at that index
            temp = this.get(index);
            this.get(index - 1).next = temp.next;
        }

    }

    /**
     * removes all nodes holding this value
     * @param removing value
     */
    public void remove(T removing) {
        for (int i = 0; i < this.getSize(); i++) {
            //if node holds this value then remove it
            if (this.get(i).value.equals(removing)) {
                this.remove(i);
                i--;
            }
        }
    }

    @Override
    /**
     * To string method
     * @return string form of linked list
     */
    public String toString() {
     
        String string = "";
        Node<T> temp = head;
        while (temp.hasNext()) {
            string += temp.value + ",";
            temp = temp.next;

        }
        string += temp.value;
        return string;

    }

}
