import java.util.Scanner;

public class LL {

    Node head;
    Node tail;
    int size;

    public LL() {
        this.size = 0;
    }

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;

        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;

        }

    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    // public static Node input(){
    //     Scanner sc = new Scanner(System.in);
    //     Node head = null, temp = null;
    //     int data = sc.nextInt();
    //     while(data!=-1){
    //         if(head==null){
    //             head = new Node(data);
    //             temp = head;
    //         } else {
    //             temp.next = new Node(data);
    //             temp = temp.next;
    //         }
    //         data = sc.nextInt();
    //     }
    //     return head;
    // }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public int deleteFirst() {
        int val = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}