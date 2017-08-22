/**
 * Created by manhnv118 on 8/22/2017.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("______________SinglyLinkedList_____________________");

        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.add(1);
        linkedList.add(9);
        linkedList.add(7);
        linkedList.add(5);
        linkedList.add(11);
        linkedList.add(9);
        linkedList.add(2);
        System.out.println("Init :\t\t\t\t\t: " + linkedList);

        //Remove all element in the linkedlist that is great than 6
        linkedList.removeGreaterThan(6);
        System.out.println("Remove greater than 6 \t: " + linkedList);

        //Remove the tail element from a linkedlist
        linkedList.removeTail();
        System.out.println("Remove tail \t\t\t: " + linkedList);
        System.out.println("_________________________________________________");
    }
}
