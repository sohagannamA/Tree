class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class AllOrder {
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
    //LavelOrder
    public void LavelOrder(Node node) {
                    Queue<Node>queue=new LinkedList<>();
                    queue.add(node);
                    queue.add(null);
                    while(!queue.isEmpty()){
                              Node currentNode=queue.poll();
                              if(currentNode==null){
                                        if(queue.isEmpty()){
                                                  return;
                                        }
                                        else{
                                                  queue.add(null);
                                        }
                              }
                              else{
                                        System.out.print(currentNode.data+" ");
                                        if(currentNode.left!=null){
                                                  queue.add(currentNode.left);
                                        }
                                        if(currentNode.right!=null){
                                                  queue.add(currentNode.right);
                                        }
                              }
                    }
          }
    public static void main(String[] args) {
        AllOrder tt = new test2();
        tt.root = new Node(1);
        tt.root.left = new Node(2);
        tt.root.right = new Node(3);
        tt.root.left.left = new Node(4);
        tt.root.left.right = new Node(5);
        tt.root.right.right = new Node(6);
        tt.PostOrderRec(tt.root);
    }
}
