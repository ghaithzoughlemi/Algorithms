package Treenode;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {

	int value;
	TreeNode left;
	TreeNode right;
	List<TreeNode> children;

	TreeNode() {
	}

	TreeNode(int value) {
		this.value = value;
		this.children = new ArrayList<>();
	}

	TreeNode(int value, TreeNode left, TreeNode right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}

	public void addChild(TreeNode child) {
		children.add(child);
	}

	public int getValue() {
		return value;
	}

	public List<TreeNode> getChildren() {
		return children;
	}

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);
		TreeNode child1 = new TreeNode(2);
		TreeNode child2 = new TreeNode(3);
		TreeNode child3 = new TreeNode(5);
		TreeNode child4 = new TreeNode(6);

		TreeNode root2 = new TreeNode(4, child3, child4);
		root.addChild(child1);
		root.addChild(child2);

		System.out.println(root.getValue()); // prints 1
		System.out.println(root.getChildren().get(1).getValue()); // prints 2
		System.out.println(root2.getValue() + " " + root2.left.value + " " + root2.right.value); // prints 3

	}
}
