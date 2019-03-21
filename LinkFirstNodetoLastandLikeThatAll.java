import java.util.*;
public class LinkFirstNodetoLastandLikeThatAll{
    
    static class Node{
        Node next;
        int data;
        Node(int data){
            this.data = data;
        }
    }

     public static void main(String []args){
         Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         int [] arr= new int[n];
         for(int i=0;i<n;i++)
            arr[i] = in.nextInt();
        Node head=LinkedList(arr);
        //System.out.println(head.next.next.data);
        Node mid = mid(head);
       
        Node RevresedAtMid = Reverse(mid);
        mid.next = ReversedAtmid;
        ActualQuestion(head,RevresedAtMid);
       
     }
     
     static Node LinkedList(int [] arr){
          Node head = new Node(arr[0]);
         Node n=head;
         for(int j =1;j<arr.length;j++){
             Node node = new Node(arr[j]);
             head.next = node;
             head = node;
         }
         return n;
            
     }
     static Node Reverse(Node node){
        Node prev = null; 
        Node current = node;
        Node next = null; 
         
         while(current!=null)
         {
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
         }
         
        node = prev; 
        return node; 
         
         
     }
     static Node mid(Node node){
         Node slow = node;
         Node fast = node;
         while(fast!=null && fast.next!=null)
         {
             slow = slow.next;
             fast = fast.next.next;
         }
         return slow;
     }
     static void ActualQuestion(Node head, Node mid){
         
         while(mid.next!=null && head.next!=null){
             Node node = head;
             Node midSave = mid;
             head.next = mid;
             mid.next = node.next;
             head = node.next;
             mid = midSave.next;
             System.out.println(head.data);
             System.out.println(mid.data);
          
         }
         
         while(head.next!=null){
             System.out.println(head.data);
             head= head.next;
         }
     }
     
}
