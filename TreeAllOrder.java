class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class test2 {
    Node root;
    //Pre-order	
    public void PreeOrderRec(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        PreeOrderRec(node.left);
        PreeOrderRec(node.right);
    }
   //In-Order
    public void InorderRec(Node node){
        if(node==null){
            return;
        }
        InorderRec(node.left);
        System.out.print(node.data+" ");
        InorderRec(node.right);
    }
    //Post-Order
    public void PostOrderRec(Node node){
        if(node==null){
            return;
        }
        PostOrderRec(node.left);
        PostOrderRec(node.right);
        System.out.print(node.data+" ");
    }

    public static void main(String[] args) {
        test2 tt = new test2();
        tt.root = new Node(1);
        tt.root.left = new Node(2);
        tt.root.right = new Node(3);
        tt.root.left.left = new Node(4);
        tt.root.left.right = new Node(5);
        tt.root.right.right = new Node(6);
        tt.PostOrderRec(tt.root);
    }
}