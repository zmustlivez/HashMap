import java.util.Iterator;
import java.util.NoSuchElementException;

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
            Node<K,V> cur = head;

            while (cur.getNext() != null) {
                cur = cur.getNext();
            }
            cur.setNext(newNode);
        }
        size++;
    }

    public int size() {
        return size;
    }
    /*
    @Override
    public Iterator<V> iterator() {
        return new Iterator<V>() {
            private Node<K, V> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public V next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                V value = current.value;
                current = current.next;
                return value;
            }
        }
    }
    */
}