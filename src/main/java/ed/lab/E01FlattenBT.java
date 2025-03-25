package ed.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class E01FlattenBT {

    public void flatten(TreeNode<Integer> root) {
        if(root == null)
            return;

        Stack<TreeNode<Integer>> stack = new Stack<>();
        stack.push(root);
        TreeNode<Integer> newroot = null;

        while(!stack.isEmpty()) {
            TreeNode<Integer> node = stack.pop();

            if(newroot != null) {
                newroot.right = node;
                newroot.left = null;
            }

            if(node.right != null) {
                stack.push(node.right);
            }

            if(node.left != null) {
                stack.push(node.left);
            }

            newroot = node;
        }
    }
}



