public class MyLinkedList<T> {

    public MyLinkedList() {size = 0; head = null;}

    private int size; private Node head;

    private Node getNode(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
            Node node = head;
        for (int i = 0; i < index; i++) {node = node.next;}
        return node;
    }
    public void printMyLinkedList() {
        String str = "[";
        for (int i = 0; i < size - 1; i++) {str = str + getNode(i).value.toString() + ", ";}
        System.out.println(str + getNode(size - 1).value.toString() +"]");
    }
    private class Node {

        Node next; T value;

        public Node(T value, Node next) {this.value = value;this.next = next;}
        public Node(T value) {this.value = value;this.next = null;}

    }
    public void add(T value, int index) {
        Node node = new Node(value);
        if (index == 0) {
            node.next = head.next;
            head = node;
            size++;
        } else if (index == size) {add(value);}
        else {
            Node node1 = new Node(value, getNode(index));
            Node curNode = getNode(index - 1);
            curNode.next = node1;
            size++;
        }
    }
    public void add(T value) {
       if(size == 0) {
           head = new Node(value);
           size++;

       } else {
           Node node = head;
           for (; node.next != null; node = node.next) {}
               node.next = new Node(value);
           size++;
       }

    }
    public void remove(int index) {
        if (index > 0) {
            Node curNode = getNode(index - 1);
            curNode.next = curNode.next.next;
            size--;
        } else if (index == 0) {
            head = head.next;
            size--;
        }
    }
    public void removeOne(T value) {
        for (int i = 0; i < size; i++) if (value == getNode(i).value) {remove(i); return;}
    }
    public void removeAll(T value) {
        for (int i = 0; i < size; i++) if (value == getNode(i).value) {remove(i); i--;}
    }
    public T get(int index) {return getNode(index).value;}

}
