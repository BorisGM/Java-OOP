package p05_CustomLinkedList;


public class CustomLinkedList<T> {


    private class ListNode {

        private T element;
        private ListNode nextNode;

        public ListNode(T element) {
            this.setElement(element);
            this.setNextNode(null);
        }
        public ListNode(T element, ListNode prevNode) {
            this.setElement(element);
            prevNode.setNextNode(this);
        }

        public T getElement() {
            return element;
        }
        public void setElement(T element) {
            this.element = element;
        }

        public ListNode getNextNode() {
            return nextNode;
        }

        public void setNextNode(ListNode nextNode) {
            this.nextNode = nextNode;
        }
    }

    private ListNode head;
    private ListNode tail;
    private int count;

    public CustomLinkedList() {
        this.head = null;
        this.tail = null;
        this.count = 0;
    }

    private int getCount() {
        return count;
    }

    /**
     * Gets element at the specified position
     * @param index The position of the element [0 � count-1]
     * @return The item at the specified index
     * @exception IllegalArgumentException When an invalid index is specified
     */

    public T get(int index) {
        if (index >= this.count || index < 0) {
            throw new IllegalArgumentException("Invalid index: " + index);
        }

        ListNode currentNode = this.head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNextNode();
        }
        return currentNode.getElement();
    }
}
