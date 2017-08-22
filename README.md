# Java_SinglyLinkedList
Demo about  using singly linkedlist class write in Java language 

1. Append an element into the linkedlist
2. Remove the tail element from a linkedlist
3. Remove all element in the linkedlist that is great than a target value

---

## Sample

```
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

```

## Output
```
Init :                  : [1, 9, 7, 5, 11, 9, 2]
Remove greater than 6 	: [1, 5, 2]
Remove tail 		: [1, 5]
```