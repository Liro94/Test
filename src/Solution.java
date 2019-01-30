    class TreeNode
    {

        int val;
      TreeNode left;
      TreeNode right;
    }


    class Solution {
        public static TreeNode[] div(TreeNode root, int value) {
            TreeNode[] res = new TreeNode[2];

            if (root == null) return null;
            if (root.val > value) {
                res = div(root.left, value);
                root.left = res[1];
                res[1] = root;
            } else if (root.val < value) {
                res = div(root.right, value);
                root.right = res[0];
                res[0] = root;
            } else {
                res[0] = root;
                res[1] = root.right;
                root.right = null;
            }
            return res;
        }

            public static void main (String[]args){
                TreeNode s = new TreeNode();
                s.val = 8;
                TreeNode a = new TreeNode();
                s.left = a;
                a.val = 5;
                TreeNode b = new TreeNode();
                s.right = b;
                b.val = 12;
                TreeNode c = new TreeNode();
                a.left = c;
                c.val = 3;
                TreeNode d = new TreeNode();
                a.right = d;
                d.val = 6;
                TreeNode[] q = new TreeNode[0];
                q = div(s,5);
            }
        }


