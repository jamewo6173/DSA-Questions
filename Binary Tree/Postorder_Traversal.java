import java.util.*;

public class Postorder_Traversal {

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

    // Recursive

    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        postorder(root,res);
        return res;
    }
    
    public void postorder(TreeNode root,ArrayList<Integer> res) {
        if(root == null) {
            return;
        }
        
        postorder(root.left,res);
        postorder(root.right,res);
        
        res.add(root.val);
    }

    // Iterative 

    public List<Integer> postorderTraversal2(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        
        if(root == null) {
            return res;
        }
        
        Stack<TreeNode> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        
        s1.push(root);
        
        while(!s1.isEmpty()) {
            TreeNode cur = s1.pop();
            s2.push(cur.val);
            
            if(cur.left != null) {
                s1.push(cur.left);
            }
            
            if(cur.right != null) {
                s1.push(cur.right);
            }            
        }
        
        while(!s2.isEmpty()) {
            res.add(s2.pop());
        }
        return res;
    }
    
}
