public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(5);
        list.insertFirst(75);
        list.insertFirst(18);
        list.insertFirst(4);
        list.insertFirst(54);
        list.insertFirst(9);
        list.insertLast(36);
        list.insert(6, 2);
        list.deleteFirst();
        list.display();

        //System.out.println(list.tail.data);
    }
}
