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