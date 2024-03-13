class Node{
    int data;
    Node next;

    public Node(int data){  //初始化，在建立物件時可以直接傳入資料
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    Node head;  //不需使用物件的話直接設一個變數當結構體

    public LinkedList(){
        this.head = null;
    }

    public void addNode(int data){
        Node newNode = new Node(data);  //需要使用購中的變數再建立物件

        if(head == null){
            head = newNode;
        }
        else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void printList(){
        Node printNode = head;
        while(printNode != null){
            System.out.print(printNode.data + " ");
            printNode = printNode.next;
        }
        System.out.println();
    }
}

public class MyList{
    public static void main(String[] args){
        LinkedList licklist = new LinkedList();

        licklist.addNode(3);
        licklist.addNode(4);
        licklist.addNode(5);

        licklist.printList();
    }
}