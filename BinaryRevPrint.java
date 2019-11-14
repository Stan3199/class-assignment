import java.util.*;

public class BinaryRevPrint 
{
    public static class BinaryTreeRev 
	{
        int data;
        BinaryTreeRev left,right;
        BinaryTreeRev()
        {
            left = null;
            right = null;
        }
        BinaryTreeRev(int key)
        {
            data = key;
            left = null;
            right = null;
        }
    }
    public static BinaryTreeRev Node(int data)
    {
        BinaryTreeRev temp = new BinaryTreeRev();
        temp.data = data;
        temp.left = temp.right = null;
        return temp;
    }
	
    public static BinaryTreeRev insert(BinaryTreeRev root, int data)
    {
        if(root == null)
        {
            root = Node(data);
            return root;
        }
        if(root.data > data)
        {
            root.left = insert(root.left,data);
        }
        else if(root.data < data)
        {
            root.right = insert(root.right,data);
        }
        return root;
    }
	    public static void getLevel(BinaryTreeRev root, int level)
    {
        if(root == null)
        {
            return;
        }
        if(level == 0)
        {
            printOrder.push(root.data);
        }
        else
        {
            getLevel(root.left,level - 1);
            getLevel(root.right,level - 1);
        }
    }
    public static int heightt(BinaryTreeRev root)
    {
        if(root == null)
        {
            return 0;
        }
        else
        {
            int leftHeight = 1 + heightt(root.left);
            int rightHeight = 1 + heightt(root.right);

            return Math.max(leftHeight,rightHeight);
        }
    }
    static Stack<Integer> printOrder = new Stack<Integer>();
    public static void getLevelOrder(BinaryTreeRev root)
    {
        int h = heightt(root);
        for(int i = 0 ; i < h ; i++)
        {
            getLevel(root,i);
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        BinaryTreeRev root = new BinaryTreeRev(40);
        root = insert(root,30);
        root = insert(root,70);
        root = insert(root,20);
        root = insert(root,35);
        root = insert(root,50);
        root = insert(root,80);
        getLevelOrder(root);
        while(!printOrder.empty())
        {
            System.out.print(printOrder.peek() + " ");
            printOrder.pop();
        }
    }

}