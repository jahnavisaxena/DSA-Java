public class addFirst {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addfirst(int data){//no need to write static as we can use linked list objects    
        //step1
        Node newNode = new Node(data);
        //step 2
        newNode.next = head;
        //step3
        head = newNode;

        if(head == null){
            newNode = head = tail;
            return;
        }
    }

    public static void main(String[] args) {
        addFirst ll = new addFirst();
        ll.addfirst(1);
        ll.addfirst(2);
    }

}

