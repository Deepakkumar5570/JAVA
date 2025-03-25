

public class linkedList {
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

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;  //tail ko hi nya node bna diya
        }
    }
    public void print(){    //O(n)
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public void addMiddle(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    //remove forst node
    public int removeFirst(){
        if(size == 0){
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int re_val = head.data;
            head = null;
            tail = null;
            size--;
            return re_val;
        }
        int re_val = head.data;
        head = head.next;
        size--;
        return re_val;
    }

    //remove last node
    public int removeLast(){
        if(size == 0){
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int re_val = head.data;
            head = null;
            tail = null;
            size--;
            return re_val;
        }
        Node temp = head;   //previos node of tail
        while(temp.next != tail){
            temp = temp.next;
        }
        int re_val = tail.data;
        temp.next = null;
        tail = temp;
        size--;
        return re_val;
    }
    public static void main(String args[]){
       linkedList ll = new linkedList();
       ll.addFirst(10);
       ll.addFirst(20);
       ll.addLast(30);
       ll.addLast(40);
       ll.addMiddle(2, 25);
       ll.print();
       System.out.println("Size of linked list is: " + size);
       ll.removeFirst();
       ll.print();

       ll.removeLast();
       ll.print();
      
    }

    
}
