class Main {
    public static void main(String[] args) {
        Node<String, Integer> one = new Node<String, Integer>("one", 1);
        Node<String, Integer> two = new Node<String, Integer>("one", 1);
        System.out.println(one.getHash());
        System.out.println(one.getKey());
        System.out.println(one.getValue());
        System.out.println(one.getNext());
        
        one.setNext(two);
        System.out.println(one.getNext());

        /*
        int len = 8;
        int res1 = CustomHashMap.calculateIndex(Integer.valueOf(Integer.MAX_VALUE), len);
        int res2 = CustomHashMap.calculateIndex(Integer.valueOf(1), len);
        int res3 = CustomHashMap.calculateIndex(Integer.valueOf(0), len);
        int res4 = CustomHashMap.calculateIndex(Integer.valueOf(-1), len);
        int res5 = CustomHashMap.calculateIndex(Integer.valueOf(Integer.MIN_VALUE), len);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
        System.out.println(res5);
        */
    }
}