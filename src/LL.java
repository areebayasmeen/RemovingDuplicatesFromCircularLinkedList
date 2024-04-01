public class LL {
    //insertAtEnd(int), deleteValue(int), and display() methods.
    static NOde head;
    static NOde tail;

    public static void InsertAtEnd(int data){
        NOde newNode=new NOde(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            tail.next=head;
            return;
        }
        tail.next=newNode;
        tail=newNode;
        tail.next=head;
    }

    public static void DelValue(int key) {
        if (head == null)
            return;




        while (head != null && head.data == key) {

            head = head.next;
        }
        NOde previous = head;
        NOde current = head.next;
            while (current != head) {
                if (current.data == key) {
                    previous.next = current.next;
                    current = current.next;
                } else {
                    current = current.next;
                    previous = previous.next;
                }
            }



    }







    public static void Display() {
        NOde currentNode = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        do {
            System.out.println(currentNode.data + " ");
            currentNode = currentNode.next;
        } while (currentNode != head);
    }

}
