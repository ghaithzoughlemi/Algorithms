package Treenode2;

import java.util.ArrayList;
import java.util.List;

public class TreeNode2 {
	int val1;
	TreeNode2 left1;
	TreeNode2 right1;
	List<TreeNode2> children;

	TreeNode2() {
	}

	TreeNode2(int val1) {
		this.val1 = val1;
        this.children = new ArrayList<>();
	}

	TreeNode2(int val1, TreeNode2 left1, TreeNode2 right1) {
		this.val1 = val1;
		this.left1 = left1;
		this.right1 = right1;
	}

	public void addChild(TreeNode2 child) {
		children.add(child);
	}

	public int getValue() {
		return val1;
	}

	public List<TreeNode2> getChildren() {
		return children;
	}

}
