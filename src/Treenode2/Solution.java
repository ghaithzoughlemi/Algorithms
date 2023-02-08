package Treenode2;

public class Solution {

	public boolean isSubPath(ListNode2 head, TreeNode2 root) {
		if (root == null)
			return false;

		if (match(head, root))
			return true;

		return isSubPath(head, root.left1) || isSubPath(head, root.right1);
	}

	public boolean match(ListNode2 head, TreeNode2 root) {

		if (head == null)
			return true;

		if (root == null || head.val1 != root.val1)
			return false;

		return match(head.next1, root.left1) || match(head.next1, root.right1);

	}

	public static void preOrderTraversal(TreeNode2 root) {
		if (root == null)
			return;
		System.out.print(root.getValue() + " ");
		for (TreeNode2 child : root.getChildren()) {
			preOrderTraversal(child);
		}
	}

	public static void main(String[] args) {

		ListNode2 liste = new ListNode2();

		TreeNode2 child1 = new TreeNode2(4);
		TreeNode2 child2 = new TreeNode2(4);
		TreeNode2 root = new TreeNode2(1, child1, child2);

		System.out.println("Root 1: " + root.val1 + " " + root.left1.val1 + " " + root.right1.val1);

		TreeNode2 child3 = new TreeNode2(2);
		TreeNode2 child4 = new TreeNode2(2);

		TreeNode2 root1 = new TreeNode2(root.left1.val1, child3, null);

		System.out.println("Root 2: " + root1.val1 + " " + root1.left1.val1);

		TreeNode2 root3 = new TreeNode2(7);
		TreeNode2 child11 = new TreeNode2(8);
		TreeNode2 child22 = new TreeNode2(9);
		root3.addChild(child1);
		root3.addChild(child2);
		System.out.println("Root 3 : " + root3.getValue() + " " + root3.getChildren().get(0).getValue() + " "
				+ root3.getChildren().get(1).getValue());
	}
}
