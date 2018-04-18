package Chapter16.exercise3;

public class LinkedIntList
{
    /*
        Write a method called indexOf that accepts a value as a parameter and returns the index in the list of the first occurrence
        of that value, or –1 if the value is not found in the list.
    */

    private ListNode front;


    //  Exercise 3 //////////////////////////////////////////////////
    public int indexOf(int value)
    {
        ListNode current = this.front;

        int count = 0;
        while (current != null)
        {
            if (current.getData() == value) return count;
            current = current.next;
            count++;
        }
        return -1;
    }
    /////////////////////////////////////////////////////////////////


    public LinkedIntList()
    {
        this.front = null;
    }

    public void add(int value)
    {
        if(this.front == null)
            this.front = new ListNode(value);
        else
        {
            ListNode current = this.front;

            while (current.next != null)
            {
                current = current.next;
            }

            current.next = new ListNode(value);
        }
    }

    @Override
    public String toString()
    {
        if (this.front == null)
        {
            return "[]";
        }
        else
        {
            String result = "[" + front.getData();
            ListNode current = this.front.next;

            while (current != null)
            {
                result += ", " + current.getData();
                current = current.next;
            }
            result += "]";
            return result;
        }
    }
}
