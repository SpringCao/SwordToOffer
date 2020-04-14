package 判断一棵树是否为另外一棵树的子树;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
public class ChildrenTree {
    public static void main(String[] args) {

    }
    private static boolean ifChild(Node root1,Node root2){
        if (root1 == null && root2 == null) return true;
        if (root1 == null) return false;
        if (root2 == null) return true;
        if (root1.val != root2.val) return false;
        return ifChild(root1.left,root2.left) && ifChild(root1.right,root2.right);
    }
    private static boolean ifChildTree(Node root1,Node root2){
        if (root1 == null && root2 == null) return true;
        if (root1 == null) return false;
        if (root2 == null) return true;
        boolean result = false;
        if (root1.val == root2.val) result = ifChild(root1,root2);
        if (!result) return ifChild(root1.left,root2);
        if (!result) return ifChild(root1.right,root2);
        return result;
    }
}
