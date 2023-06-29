package ThirdModuleHomeWork4;

public class MyTreeSet<T> {

    private Node root = null;
    private int size = 0;
    public int size() {return this.size;}

    private Node findNode(Object value) {

        Node curNode = root;
        Comparable<T> cValue = (Comparable<T>) value;

        while(curNode != null) {

            int res = cValue.compareTo(curNode.value);

            if (res < 0) {curNode = curNode.left;}
            else if (res > 0) {curNode = curNode.right;}
            else if (res == 0) {return curNode;}
        }
        return null;
    }

    private Node findParent(T value) {

        Comparable<T> cValue = (Comparable<T>) value;
        Node parent = root;
        Node child = root;

        while (child != null) {

            int res = cValue.compareTo(child.value);

            if (res < 0) {
                parent = child;
                child = child.left;
            } else if (res > 0) {
                parent = child;
                child = child.right;
            } else if (res == 0) return parent;
        }
        return null;
    }

    private class Node {

        private Node left, right;
        T value;

        private Node(T value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

   public void add(T value){
        if (root == null) {
            root = new Node(value);
            size++;
        } else {
            addHelp(value, root);
            size++;
        }
   }

   private void addHelp(T value, Node node) {

        Comparable<T> cValue = (Comparable<T>) value;
        int res = cValue.compareTo(node.value);

        if (res < 0) {
            if (node.left == null) node.left = new Node(value);
            else addHelp(value, node.left);
        }
        else if (res > 0) {
            if (node.right == null) node.right = new Node(value);
            else addHelp(value, node.right);
        }
        else if (res == 0);
   }

   public boolean contains(T value) {return findNode(value) != null;}
   public void remove(T value) {

       Node childNode = findNode(value);
       Node parNode = findParent(value);

       if (size == 1) {
           root = null;
           size--;
       } else if (childNode.right != null && childNode.left != null) {
           Node successor = findSuccessor(childNode.right);
           Node sucPar = findParent(successor.value);
           removeHelp(successor, sucPar);
           childNode.value = successor.value;
       } else removeHelp(childNode, parNode);
   }

   private void removeHelp(Node childNode, Node parNode) {

        if (childNode.right == null && childNode.left == null) {

       if (parNode.left == childNode) {
           parNode.left = null;
           size--;
           return;
       } else if (parNode.right == childNode) {
           parNode.right = null;
           size--;
           return;
       }
   }

       if (childNode.left == null) {
           if (parNode.right == childNode) {parNode.right = childNode.right; size--; return;}
           else if (parNode.left == childNode) {parNode.left = childNode.right; size--; return;}
       }

       if (childNode.right == null) {
           if (parNode.right == childNode) {parNode.right = childNode.left; size--; return;}
           else if (parNode.left == childNode) {parNode.left = childNode.left; size--; return;}
       }
    }

    private Node findSuccessor(Node node){
        while (node.left != null){
            node = node.left;
        }
        return node;
    }

   public void printMyTreeSet(){
        if (root == null) {System.out.println("MyTreeSet is empty"); return;}
        else System.out.println("Root is " + root.value.toString()); LER(root);
   }

   private void LER(Node node) {
       if (node.left != null) LER(node.left);
       System.out.println(node.value);
       if (node.right != null) LER(node.right);
   }

}
