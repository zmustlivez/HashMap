import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

public class CustomHashMap<K,V> extends AbstractMap<K,V> implements Map<K,V> {
    private Entry<K,V>[] table;
    private int size;
    private int resizeFactor;

    public CustomHashMap(int resizeFactor) {
        this.size = 0;
        this.table = new Entry[2];
        this.resizeFactor = resizeFactor;
    }

    private static class Entry<K,V> {
        int hash;
        K key;
        V value;
        Entry<K,V> next;
    
        public Entry(K key, V value) {
            this.hash = key.hashCode();
            this.key = key;
            this.value = value;
        }
    }

    private void resizeTable() {
        Entry<K,V>[] newTable = new Entry[table.length * 2];
        for (Entry<K,V> entry : table) {
            while (entry != null) {
                Entry<K,V> next = entry.next;
                int index = hash(entry.key) % newTable.length;
                entry.next = newTable[index];
                newTable[index] = entry;
                entry = next;
            }
        }
        table = newTable;
    }
}