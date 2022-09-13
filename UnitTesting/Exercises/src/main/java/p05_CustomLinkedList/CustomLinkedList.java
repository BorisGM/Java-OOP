package p05_CustomLinkedList;


public class CustomLinkedList<T> {
    private class ListNode {

        private T element;
        private ListNode nextNode;

        public ListNode(T element) {
            this.setElement(element);
            this.setNextNode(null);
        }
    }
}
