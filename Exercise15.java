/*

package Chapter16;


public class Exercise15
{
    /*
    Write a method called notEquals that accepts a second list as a parameter,
    returns true if the two lists are not equal, and returns false otherwise.
    Two lists are considered unequal if they store the different values in any
    random order and do not have the same length.



    public static ListNode front;

    public static void main(String[] args)
    {

        addNodeToList(0,1);
        addNodeToList(1,2);
        addNodeToList(2,3);
        addNodeToList(3,4);

        addNodeToList(4,5);
        addNodeToList(5,6);

        System.out.println(notEquals(front));
        printList();

    }

    private static boolean notEquals(ListNode front2)
    {
        boolean notEquals = false;
        ListNode currentFront2 = front2;

        for (ListNode current = front; current != null; current = current.next)
        {
            if(currentFront2.next != null && current.next == null)
            {
                notEquals = true;
            }
            if(currentFront2.data != current.data)
            {
                notEquals = true;
            }
            currentFront2 = currentFront2.next;
        }
        return notEquals;
    }


    public static void addNodeToList(int index, int value)
    {
        if(index == 0)
        {
            front = new ListNode(value, front);
        }
        else
        {
            ListNode current = front;
            for (int i = 0; i < index-1 ; i++)
            {
                current = current.next;
            }
            current.next = new ListNode(value,current.next);
        }
    }

    public static void printList()
    {
        System.out.println("[ ");
        for (ListNode current = front; current != null; current = current.next)
        {
            System.out.print(current.data + ", ");
        }
        System.out.println("]");
    }

}
*/
