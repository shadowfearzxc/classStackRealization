package Stack;

import Main.MyPanel;

public class Stack {
    public Node head;
  //  public Node last;
    public Stack() {head = null;}


public static class Node {
        public String data;
        public Node next;

        public Node(String data){
            this.data = data;
            next = null;
        }
    }



    public void push(String data){
        Node newNode = new Node(data);
        Node currentNode = head;
        if(head == null){
            head = newNode;


        }
        else {
            while(currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }



    public String pop() {
      //  Node currentNode = head;


        if (head != null) {
            String result = head.data;
            head = head.next;
            MyPanel.stackPopPrint.setText(result);
            System.out.println("Удален : " + result);
            return result;
        } else {
            MyPanel.stackPopPrint.setText("error");
            return "error";
        }
    }




    public String peek() {
        //push("");
       if(head != null) {
           Node cur = head;
           while(cur.next != null) {
               if(cur.next == null) {
                   return cur.data;
               }
              cur = cur.next;
           }
           return cur.data;

       }
       else {
           MyPanel.stackPeeklbl.setText("error");
           return "error";
       }
    }

    public void size() {
        Node currentNode = head;
        int i = 1;
        if(head == null) {
            MyPanel.stackSizelbl.setText("0");
        }
        else {
            while(currentNode.next != null) {
                currentNode = currentNode.next;
                i++;
            }
            MyPanel.stackSizelbl.setText("" + i);
        }
    }


    public boolean clear() {
        if(head != null) {
            head = null;
            return true;
        }
        else return false;
    }

    public boolean isEmpty() {
        if(head == null){ return true; }
        else return false;
    }

    public void print() {
        Node currentNode = head;

        if(head == null) {
            System.out.println("Стек пуст");

        } else {
            System.out.println(head.data);

            while(currentNode.next != null){
            currentNode = currentNode.next;
            System.out.println(currentNode.data);
        } }
    }





}