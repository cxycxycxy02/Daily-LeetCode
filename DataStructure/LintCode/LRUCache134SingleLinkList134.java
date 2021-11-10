public class LRUCache {
    private class Node{

        Node next;
        int key;
        int value;

        public Node(int key, int value){
            this.key = key;
            this.value = value;

            this.next = null;
        }
    }
    private Node head = new Node(-1,-1);
    private Node tail = new Node(-1,-1);
    private int capacity;
    private HashMap<Integer, Node> hs = new HashMap<Integer, Node>();
    /*
     * @param capacity: An integer
     */public LRUCache(int capacity) {
        // do intialization if necessary
        this.capacity = capacity;

        head.next = tail;
    }

    /*
     * @param key: An integer
     * @return: An integer
     */
    public int get(int key) {
        // write your code here
        if (!hs.containsKey(key)){
            return -1;
        }
        Node current = hs.get(key);
        Node oldNext = current.next;
        Node oldBefore = head;
        while(oldBefore.next.key != key){
            oldBefore = oldBefore.next;
        }
        oldBefore.next = oldNext;

        moveToTail(current);
        return hs.get(key).value;
    }
    public void moveToTail(Node current){
        Node oldFirst = head;
        while(oldFirst.next.key != -1){
            oldFirst = oldFirst.next;
        }
        oldFirst.next = current;
        current.next = tail;
    }
    /*
     * @param key: An integer
     * @param value: An integer
     * @return: nothing
     */
    public void set(int key, int value) {
        // write your code here
        if (get(key) != -1) {
            hs.get(key).value = value;
            return;
        }
        if (hs.size() == capacity){
            hs.remove(head.next.key);
            head.next = head.next.next;
        }
        Node insert = new Node(key, value);
        hs.put(key, insert);
        moveToTail(insert);
    }
}