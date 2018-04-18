package Chapter16.exercise3;

/*
Write a method called isSorted that returns true if the list is in sorted (nondecreasing) order and returns false
otherwise. An empty list is considered to be sorted.
 */
public class Exercise3 {

    private ListNode front;

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

        public Exercise3()
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
