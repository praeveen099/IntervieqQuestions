import java.util.HashSet;

// Remove Dups: Write code to remove duplicates from an unsorted linked list.
public class RemoveDups
{
    public static void main(String[] args)
    {
        Node head = new Node(1);
        head.next = new Node(5);
        head.next.next = new Node(1);

        Node nodeToPrint = head;

        while (nodeToPrint != null) {
            System.out.println(nodeToPrint.data + " ->");
            nodeToPrint = nodeToPrint.next;
        } // while

        removeDups(head);
        nodeToPrint = head;
        System.out.println();

        while (nodeToPrint != null) {
            System.out.println(nodeToPrint.data + " ->");
            nodeToPrint = nodeToPrint.next;
        } // while
    } // main

    private static void removeDups(Node head)
    {
        HashSet<Integer> alreadySeenIntegers = new HashSet<Integer>();
        Node previous = null;
        while(head!=null)
        {
            if(alreadySeenIntegers.contains(head.data))
            {
                previous.next = head.next;
            } // if
            else {
                alreadySeenIntegers.add(head.data);
                previous = head;
            }

            head = head.next;

        }  // while
    } // removeDups

} // RemoveDups class

class Node
{
    Node next = null;
    int data;

    public Node(int requiredData)
    {
        data = requiredData;
    } // Node constructor

} // Node class