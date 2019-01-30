import java.util.*;

public class Test {


    public static void main(String[] args) {
        Test t = new Test();

        TreeNode1 root = new TreeNode1(1);
        root.left = new TreeNode1(2);
        root.right = new TreeNode1(5);
        root.left.left = new TreeNode1(3);
        root.left.right= new TreeNode1(4);
        root.right.right = new TreeNode1(6);

        t.flatten(root);

        Map<String,Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();



    }
    //修改代码

    // 这种写法是 寻找比target 大且最接近target 的数 (如果target不存在).
    //并且在重复的时候 返回的是最前面的那个index
    private int bs(int[] arr, int s, int e, int tar){
        if(s>e) return s;
        int mid = s+(e-s)/2;
        if(arr[mid]>=tar){
            return bs(arr, s, mid-1,tar);
        }else{
            return bs(arr,mid+1,e,tar);
        }
    }
//......

    // 这种写法是 寻找比target 小且最接近target 的数 (如果target不存在)
    //并且在重复的时候返回的是最后面的index
    private int bs2(int[] arr, int s, int e, int tar){
        if(e<s) return e;
        int mid = s+(e-s)/2;
        if(arr[mid]>tar){
            return bs2(arr, s, mid-1,tar);
        }else{
            return bs2(arr,mid+1,e,tar);
        }



    }

    public void flatten(TreeNode1 root) {
        if(root==null) return;
        traversal(root);
    }


    private TreeNode1[] traversal(TreeNode1 root){
        if (root.left == null && root.right == null) return new TreeNode1[]{root, root};
        TreeNode1[] left = traversal(root.left);
        TreeNode1[] right = traversal(root.right);
        root.right = left[0];
        left[1].right = right[0];
        return new TreeNode1[]{root, right[1]};
    }



}

class TreeNode1
{
    public TreeNode1(int val) {
        this.val = val;
    }

    int val;
    TreeNode1 left;
    TreeNode1 right;
}
