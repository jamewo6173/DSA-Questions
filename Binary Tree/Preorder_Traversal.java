import java.util.*;

public class Preorder_Traversal {

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
    
    // Recursive O(n) space & O(n) time

    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null) {
            List<Integer> al = new ArrayList<Integer>();
            return al;
        }
        List<Integer> al1 = preorderTraversal(root.left);
        al1.add(0,root.val);
        List<Integer> al2 = preorderTraversal(root.right);
        al1.addAll(al2);
        return al1;
    }

    // Recursive O(logn) stack space & O(n) time

    public List<Integer> preorderTraversal2(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        preorder(root,res);
        return res;
    }
    
    public void preorder(TreeNode root,ArrayList<Integer> res) {
        if(root == null) {
            return;
        }
        
        res.add(root.val);
        
        preorder(root.left,res);
        preorder(root.right,res);
    }

    // Iterative O(n) space & O(n) time

    public List<Integer> preorderTraversal3(TreeNode root) {
        
        List<Integer> res = new ArrayList<>();
        
        if(root == null) {
            return res;
        }
        
        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        
        while(!s.isEmpty()) {
            TreeNode node = s.pop();
            res.add(node.val);
            
            if(node.right != null) {
                s.push(node.right);
            }
            
            if(node.left != null) {
                s.push(node.left);
            }   
        }
        return res;
    }
}
