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

    public void addfirst(int data){
        Node newNode = new Node(data);

        //no need to write static as we can use linked list objects 
        if(head ==null){
            head = tail = newNode;
            return;
        }   
        //step1
        //step 2
        newNode.next = head;
        //step3
        head = newNode;

        
    }
    public void addLast(int data){ //O(1)
        Node newNode =new Node(data);

        if(head ==null){
            head =tail =newNode;
            return;
        }

        tail.next = newNode;

        tail = newNode;

        
    }

    public void printL(){
        if(head == null){
            System.out.println("linked list isempty ");
            return;
        }
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;

        }
        System.out.println();
    }

    public static void main(String[] args) {
        addFirst ll = new addFirst();
        ll.printL();
        ll.addfirst(1);
        ll.printL();
        ll.addfirst(2);
        ll.printL();

        ll.addLast(3);
                ll.printL();

        ll.addLast(4);
        ll.printL();
    }

}

