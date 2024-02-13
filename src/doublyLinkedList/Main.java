package doublyLinkedList;

import doublyLinkedList.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        System.out.println("IsEmpty : " + dll.is_empty());
        System.out.println("The size is : " + dll.get_size());

        dll.add_first(10);
        dll.add_first(20);
        dll.add_first(30);
        dll.print_forward(dll.head);
        dll.print_backward(dll.tail);

        dll.add_last(40);
        dll.add_last(50);
        dll.add_last(60);
        dll.print_forward(dll.head);
        dll.print_backward(dll.tail);

        dll.remove_first();
        dll.remove_first();
        dll.print_forward(dll.head);

        dll.add_any(20, 2);
        dll.add_any(30, 3);
        dll.print_forward(dll.head);

        dll.remove_last();
        dll.remove_last();
        dll.print_forward(dll.head);

        System.out.println("The size is : " + dll.get_size());

        dll.remove_any(2);
        dll.print_forward(dll.head);

        System.out.println("Node is present : " + dll.search_node(20));

        System.out.println(dll.tail);
        dll.add_last(40);
        dll.add_last(50);
        dll.add_last(60);
        dll.print_forward(dll.head);
        System.out.println("The tail is : " + dll.tail + " and the head is : " + dll.head);

        dll.reverse(dll.head);
        dll.print_forward(dll.head);
        System.out.println("The tail is : " + dll.tail + " and the head is : " + dll.head);
    }
}