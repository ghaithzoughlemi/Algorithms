package Treenode;

import java.util.ArrayList;
import java.util.List;

public class P_TreeNode {

	int value;
	List<P_TreeNode> children;

	public P_TreeNode(int value) {
		this.value = value;
		this.children = new ArrayList<>();
	}

	public void addChild(P_TreeNode child) {
		children.add(child);
	}

	public int getValue() {
		return value;
	}

	public List<P_TreeNode> getChildren() {
		return children;
	}

	public static void main(String[] args) {
		P_TreeNode root = new P_TreeNode(1);
		P_TreeNode child1 = new P_TreeNode(2);
		P_TreeNode child2 = new P_TreeNode(3);
		root.addChild(child1);
		root.addChild(child2);
		System.out.println(root.getValue()); // prints 1
		System.out.println(root.getChildren().get(0).getValue()); // prints 2

	}
}
