class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        List<List<Integer>> finalList = new ArrayList<List<Integer>>();
        ArrayList<Integer> interList = new ArrayList<Integer>();
        if (root==null)
            return finalList;
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            if(curr == null){
                ArrayList<Integer> temp = new ArrayList<Integer>();
                for(int i=0;i<interList.size();i++){
                    temp.add(interList.get(i));
                }   
                finalList.add(temp);
                if(!q.isEmpty()){
                q.add(null);
                interList.clear();
                }
                   
            }else{
                interList.add(curr.val);
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
        }return finalList;
    }
}
