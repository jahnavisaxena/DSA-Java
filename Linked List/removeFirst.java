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
    public static int size;
    public void addfirst(int data){
        Node newNode = new Node(data);
        size++;
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
        size++;
        if(head ==null){
            head =tail =newNode;
            return;
        }

        tail.next = newNode;

        tail = newNode;

        
    }

    public void addMid(int index,int data){
        if(index ==0){
            addfirst(data);
            return;
        }
        
        Node newNode= new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i < index -1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        if(size ==0){
            System.out.println("ll is empty");
            return 0;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val =head.data;
        head = head.next;
        return val;
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

        ll.addMid(3,5);
        ll.printL(); 

        ll.removeFirst();
        ll.printL();
        System.out.println(ll.size);
    }

}

