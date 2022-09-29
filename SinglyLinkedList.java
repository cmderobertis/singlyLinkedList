public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void remove() {
        if (this.isEmpty()) {
            return;
        }
        Node runner = head;
        while (runner.next != tail) {
            runner = runner.next;
        }
        tail = runner;
        runner.next = null;
    }

    private boolean isEmpty() {
        return head == null;
    }

    public void printValues() {
        if (this.isEmpty()) {
            return;
        }
        Node runner = head;
        while (runner != null) {
            System.out.printf("%s ", runner.value);
            runner = runner.next;
        }
        System.out.println();
    }

    Node find(int value) {
        Node runner = head;
        while (runner.value != value) {
            if (runner.next == null) {
                return null;
            }
            runner = runner.next;
        }
        return runner;
    }

    void removeAt(int index) {
        if (index < 0) return;
        if (head == tail) {
            head = tail = null;
            return;
        }
        int count = 0;
        Node runner = head;
        while (count < index - 1 && runner.next.next != null) {
            count++;
            runner = runner.next;
        }
        if (count < index - 1) return;
        if (runner == head) {
            runner.next = runner.next.next;
        } else if (runner.next == tail) {
            tail = runner;
            runner.next = null;
        } else {
            runner.next = runner.next.next;
        }
    }
}
