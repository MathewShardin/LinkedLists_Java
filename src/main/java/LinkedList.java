import org.w3c.dom.Node;

public class LinkedList {
    Node head;

    static class Node {
        Object data;
        Node next;

        Node(Object a) {
            data = a;
            next = null;
        }
    }

    public static LinkedList insertLast(LinkedList list, Object data) {
        Node nodeInsert = new Node(data);

        //Check that list's head is not empty
        if (list.head == null) {
            list.head = nodeInsert;
            return list;
        }

        //Otherwise find last node and get its pointer. Check all nodes from head
        Node lastNode = list.head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = nodeInsert;

        return list;
    }

    //Return node at specified index. (Index starts from 0)
    public static Node getNodeAtLocation(LinkedList list, int index) {
        if (index < 0) {throw new IllegalArgumentException("Index cannot be negative");}

        //Traverse through the LinkedList
        Node lastNode = list.head;

        for (int i = 0; i < index; i++) {
            if (lastNode == null) {throw new IllegalArgumentException("Index out of bounds");}
            lastNode = lastNode.next;
        }

        return lastNode;
    }

    public static LinkedList insertAtLocation(LinkedList list, int index, Object data) {
        if (index < 0) {throw new IllegalArgumentException("Index cannot be negative");}
        Node nodeInsert = new Node(data);

        //Traverse through the LinkedList
        Node lastNode = list.head;

        for (int i = 0; i < index - 1; i++) {
            if (lastNode == null) {throw new IllegalArgumentException("Index out of bounds");}
            lastNode = lastNode.next;
        }

        //Make new node head of the list if insertion is required at index 0
        if (index == 0) {
            nodeInsert.next = lastNode;
            list.head = nodeInsert;
        } else {
            nodeInsert.next = lastNode.next;
            lastNode.next = nodeInsert;
        }

        return list;
    }

    public static LinkedList removeAtLocation(LinkedList list, int index) {
        if (index < 0) {throw new IllegalArgumentException("Index cannot be negative");}

        //Traverse through the LinkedList
        Node currentNode = list.head;

        //Find Node 1 position before the node to be removed
        for (int i = 0; i < index - 1; i++) {
            if (currentNode == null) {throw new IllegalArgumentException("Index out of bounds");}
            currentNode = currentNode.next;
        }

        Node tempNode = currentNode;
        //Save pointer of the node to be removed
        currentNode = currentNode.next;
        Node pointerNext = currentNode.next;
        //Set pointer of Node at index-1 to index+1
        tempNode.next = pointerNext;

        return list;
    }

    public static int size(LinkedList list) {
        int counter = 0;

        if (list.head == null) {
            return counter;
        }

        Node lastNode = list.head;
        while (lastNode != null) {
            lastNode = lastNode.next;
            counter++;
        }

        return counter;
    }





}
