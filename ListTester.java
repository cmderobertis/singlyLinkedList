public class ListTester {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(3);
        sll.add(4);
        sll.add(10);
        sll.add(5);
        sll.add(15);
        sll.add(2);
        sll.remove();
        sll.remove();
        sll.printValues();
        System.out.println(sll.find(5)); //Node@location
        System.out.println(sll.find(6)); //null
        sll.printValues();
//        sll.removeAt(0);
        sll.removeAt(-1);
        sll.printValues();
    }
}
