package lr11;

public class Task8 {
    public static void main(String[] args) {
        Node1 LinkedList = new Node1();

        LinkedList.createHead(new int[]{0,1,2});
        System.out.println(LinkedList.toString());

        LinkedList.createTail(new int[]{3,2,1});
        System.out.println(LinkedList.toString());

        LinkedList.AddFirst(-1);
        System.out.println(LinkedList.toString());

        LinkedList.AddLast(17);
        System.out.println(LinkedList.toString());

        LinkedList.Insert(100,3);
        System.out.println(LinkedList.toString());

        LinkedList.RemoveFirst();
        System.out.println(LinkedList.toString());

        LinkedList.RemoveLast();
        System.out.println(LinkedList.toString());

        LinkedList.Remove(2);
        System.out.println(LinkedList.toString());

        LinkedList.createHeadRec(5);
        System.out.println(LinkedList.toStringRec(LinkedList.head));

        LinkedList.createTailRec(4);
        System.out.println(LinkedList.toStringRec(LinkedList.head));
    }
}
class Node1 {
    protected int value;
    protected Node1 next;
    protected Node1 head;

    public Node1 getNext() {
        return next;
    }

    public int getValue() {
        return value;
    }

    Node1(int value, Node1 next) {
        this.value = value;
        this.next = next;
    }

    Node1() {
    }

    protected void createHead(int[] values) { //– ввод с головы createHead();
        Node1 head = new Node1(values[0], null);
        Node1 tail = head;
        for (int i = 1; i < values.length; i++) {
            tail.next = new Node1(values[i], null);
            tail = tail.next;
        }
        this.head = head;
        System.out.println("Формирование односвязного списка от головы:");
    }

    protected void createTail(int[] values) {//– ввод с хвоста createTail();
        Node1 head = null;
        for (int i = values.length - 1; i >= 0; i--) {
            head = new Node1(values[i], head);
        }
        this.head = head;
        System.out.println("Формирование односвязного списка от хвоста:");
    }

    /*protected void printNodeLinkedList(Node head) {
        Node ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
        System.out.println("\n");
    }*/

    public String toString() {// вывод (возвращается строка, сформированная из элементов списка) toString();
        Node1 ref = head;
        System.out.println("Печать односвязного списка:");
        String toString = "";
        while (ref != null) {
            toString += " " + ref.value;
            ref = ref.next;
        }
        return toString;
    }

    protected void AddFirst(int head) {//добавление элемента в начало списка AddFirst();
        this.head = new Node1(head, this.head);
        System.out.println("Добавление элемента в начало списка:");
    }

    protected void AddLast(int tail) {//добавление элемента в конец списка AddLast();
        Node1 newTail = new Node1(tail, null);
        Node1 ref = this.head;
        while (ref.next != null) {
            ref = ref.next;
        }
        ref.next = newTail;
        System.out.println("Добавление элемента в конец списка:");
    }

    protected void Insert(int middle, int queue) {//– вставка элемента в список с указанным номером Insert();
        Node1 newNode = new Node1(middle, null);
        Node1 ref = this.head;
        int k = 1;
        while (ref.next != null && (k < queue)) {
            ref = ref.next;
            k++;
        }
        newNode.next = ref.next;
        ref.next = newNode;
        System.out.println("Добавление элемента за № " + queue + " списка:");
    }

    protected void RemoveFirst() {//– удаление элемента с головы списка RemoveFirst();
        this.head = this.head.next;
        System.out.println("Удаление элемента из головы списка:");
    }

    protected void RemoveLast() {// – удаление последнего элемента списка RemoveLast();
        Node1 ref = this.head;
        while (ref.next.next != null) {
            ref = ref.next;
        }
        ref.next = null;
        System.out.println("Удаление элемента из хвоста списка:");
    }

    protected void Remove(int queue) {//– удаление из списка элемента с указанным номером Remove();
        Node1 ref = this.head;
        int k = 1;
        while (ref.next != null && (k < queue)) {
            ref = ref.next;
            k++;
        }
        ref.next = ref.next.next;
        System.out.println("Удаление элемента под № " + queue + " списка:");
    }

    //с использованием рекурсии:
    Node1 createHeadRec(int value) { // – ввод с головы createHeadRec();
        if (value == 0) {
            System.out.println("Формирование односвязного списка от головы с помощью рекурсии:");
            return null;
        }
        return this.head = new Node1(value, createHeadRec(value-1));
    }
    int createTailRec(int value){ // – ввод с хвоста createTailRec();
        if (value ==0) {
            System.out.println("Формирование односвязного списка от хвоста с помощью рекурсии:");
            Node1 head = null;
            this.head = head;
            return 0;
        }
        head = new Node1(createTailRec(value - 1), head);
        return value;
    }

    public String toStringRec(Node1 head) {// вывод (возвращается строка, сформированная из элементов списка) toString();
        if (head == null) {
            return " Печать односвязного списка c помощью рекурсии:";
        }
        return head.getValue()+" "+toStringRec(head.getNext());
    }

}