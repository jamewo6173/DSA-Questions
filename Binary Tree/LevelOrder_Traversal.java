import java.util.*;

public class LevelOrder_Traversal {

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

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        
        if(root == null) {
            return res;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        
        List<Integer> temp = new ArrayList<>();
        
        while(!q.isEmpty()) {
            TreeNode cur = q.remove();
            
            if(cur == null) {
                if(q.size() > 0) {
                    q.add(null);
                }
                res.add(temp);
                temp = new ArrayList<>();
            }
            else {
                temp.add(cur.val);
                
                if(cur.left != null) {
                    q.add(cur.left);
                }
                
                if(cur.right != null) {
                    q.add(cur.right);
                }
            }
        }
        return res;
    }

    //Recursive

    public List<List<Integer>> levelOrder2(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        
        traversal(root,0,res);
        
        return res;
    }
    
    public void traversal(TreeNode root,int level,List<List<Integer>> res) {
        
        if(root == null) {
            return;
        }
        
        if(level >= res.size()) {
            res.add(new ArrayList<Integer>());
        }
        
        res.get(level).add(root.val);
        
        traversal(root.left,level+1,res);
        traversal(root.right,level+1,res);
    }
    
}
