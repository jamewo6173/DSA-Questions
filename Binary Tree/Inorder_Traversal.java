import java.util.*;

public class Inorder_Traversal {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
 
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        inorder(root,res);
        return res;
    }
    
    public void inorder(TreeNode root,ArrayList<Integer> res) {
        if(root == null) {
            return;
        }
        
        inorder(root.left,res);
        
        res.add(root.val);
        
        inorder(root.right,res);
    }

    // Iterative

    public List<Integer> inorderTraversal2(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
          
        if(root == null) {
            return res;
        }
        
        Stack<TreeNode> s = new Stack<>();
        
        addLeftNodes(root,s);
        
        while(!s.isEmpty()) {
            TreeNode cur = s.pop();
            res.add(cur.val);
            
            addLeftNodes(cur.right,s);
        }
        return res;
    }
    
    public void addLeftNodes(TreeNode root,Stack<TreeNode> s) {
        if(root == null) {
            return;
        }
        
        while(root != null) {
            s.push(root);
            root = root.left;
        }
    }


}
