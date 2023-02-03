import java.util.ArrayList;
import java.util.Scanner;

public class binarySearchTree {
    public static BinaryTreeNode<Integer> takeTreeinputBatter(boolean isRoot, int parentdata, boolean isleft) {
        if (isRoot) {
            System.out.println("Enter Root data:");
        } else {
            if (isleft) {
                System.out.println("Enter left child of:" + parentdata);
            } else {
                System.out.println("Enter right child of:" + parentdata);
            }
        }
        Scanner sc = new Scanner(System.in);
        int rootdata = sc.nextInt();
        if (rootdata == -1) {
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootdata);
        BinaryTreeNode<Integer> leftchild = takeTreeinputBatter(false, rootdata, true);
        BinaryTreeNode<Integer> rightchild = takeTreeinputBatter(false, rootdata, false);

        root.left = leftchild;
        root.right = rightchild;
        return root;

    }

    public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + ":");
        if (root.left != null) {
            System.out.print("L:" + root.left + ",");
        }
        if (root.right != null) {
            System.out.print("R:" + root.right);
        }

    }

    public static ArrayList<Integer> getpath(BinaryTreeNode<Integer> root, int data) {
        if (root == null) {
            return null;
        }
        if (root.data == data) {
            ArrayList<Integer> output = new ArrayList<>();
            output.add(root.data);
            return output;
        }
        if (data < root.data) {
            ArrayList<Integer> output2 = getpath(root.left, data);
            if (output2 != null) {
                output2.add(root.data);
                return output2;
            }

        }
        if (data > root.data) {
            ArrayList<Integer> output3 = getpath(root.right, data);
            if (output3 != null) {
                output3.add(root.data);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeTreeinputBatter(true, 0, true);
        printTreeDetailed(root);
        ArrayList<Integer> path = getpath(root, 3);
        for (int i : path) {
            System.out.println(i);
        }
    }

}
