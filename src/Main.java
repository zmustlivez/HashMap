class Main {
    public static void main(String[] args) {
        CustomLinkedList<String, Integer> list = new CustomLinkedList<>();
        list.add("One", 1);
        list.add("Two", 2);
        list.add("Three", 1);
        for (Node<String, Integer> node: list) {
            System.out.println(node.getKey());
        }
    }
}