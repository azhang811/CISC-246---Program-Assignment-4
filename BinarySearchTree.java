import java.util.*;

class TreeNode
{
	int data;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int data)
	{
		this.data = data;
		left = right = null;
	}
}

public class BinarySearchTree
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		TreeNode root = null;
		
		System.out.println("Enter 10 Interger: ");
		
		for(int i = 0; i < 10; i++)
		{
			int data = scan.nextInt();
			root = insert(root, data);
			
		}
		
		System.out.println("Inorder Traversal: ");
		
		inorderTraversal(root);
	}
	
	private static void inorderTraversal(TreeNode root)
	{
		if(root !=null)
		{
			inorderTraversal(root.left);
			System.out.print(root.data + " ");
			inorderTraversal(root.right);
		}
		
	}

	public static TreeNode insert(TreeNode root, int data)
	{
		if(root == null)
		{
			root = new TreeNode(data);
		}
		
		if(data < root.data)
		{
			root.left = insert(root.left, data);
		}
		
		else if(data > root.data)
		{
			root.right = insert(root.right, data);
		}
		return root;
	}
	
}
