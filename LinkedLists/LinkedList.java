public class LinkedList {
    Node root;
    int size;

    public LinkedList(){
        root = new Node();
        size = 0;
    }

    // Main
    public static void main(String[] args){
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.add(7);
        testLinkedList.add(24);
        testLinkedList.add(32);
        testLinkedList.add(4);
        testLinkedList.add(45);
        System.out.println(testLinkedList.getSize());
        System.out.println(testLinkedList.findNode(4).getNodeValue());
        System.out.println(testLinkedList.findNode(32));
        testLinkedList.remove(32);
        System.out.println(testLinkedList.getSize());
        System.out.println(testLinkedList.findNode(32));
    }

    public void setSize(int s){
        this.size = s;
    }

    public int getSize(){
        return this.size;
    }

    public Node add(int value){
        Node newNode = new Node(value, root);
        this.root = newNode;
        this.size++;
        return newNode;
    }

    public Node findNode(int value){
        Node thisNode = this.root;

        while(thisNode != null) {
            if(thisNode.getNodeValue() == value)
                return thisNode;

            thisNode = thisNode.getNextNode();
        }
        return null;
    }

    public boolean remove(int value){
        Node thisNode = this.root;
        Node prevNode = null;

        while(thisNode != null){
            if(thisNode.getNodeValue() == value) {
                if(prevNode != null)
                    prevNode.setNextNode(thisNode.getNextNode());
                else
                    this.root = null;
                this.setSize(this.getSize()-1);
                return true;
            }
            prevNode = thisNode;
            thisNode = thisNode.getNextNode();
        }
        return false;
    }

    // Node class
    private class Node {
        private Node nextNode;
        private int value;

        private Node(){}
        private Node(int v){
            value = v;
        }
        private Node(int v, Node next){
            value = v;
            nextNode = next;
        }

        private void setNodeValue(int value){
            this.value = value;
        }

        private int getNodeValue(){
            return this.value;
        }

        private void setNextNode(Node next){
            this.nextNode = next;
        }

        private Node getNextNode(){
            return this.nextNode;
        }
    }






}