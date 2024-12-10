public class CustomLinkedList<K,V> {
    private int size;
    private Node<K,V> head;


    public CustomLinkedList() {
        this.size = 0;
        this.head = null;
    }
    
    public void  add(K k, V v) {

        Node<K,V> newNode = new Node<K,V>(k, v);
   
        if (head==null) {
            head = newNode;
        } else {
            Node cur = head;

            while (cur.getNext() != null) {
                cur = cur.getNext();
            }
            //cur.setNext(newNode);
        }
        size++;
    }

    public int size() {
        return size;
    }
}