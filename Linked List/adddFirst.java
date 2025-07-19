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
    }

    public static void main(String[] args) {
        
    }

}

