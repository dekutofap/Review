//ͬĿ¼�µ��಻�õ��룬ֱ�ӾͿ�ʹ��
//import Tree.java;

import java.util.*;
class TreeOperations{
	static Tree root = new Tree(99);
	public static void main(String[] args){
		
		init();
		//Key Point:ֱ�Ӵ�ӡt1.val�ᱨ����Ϊ������t1�൱��һ��ָ���ַ��ָ�룬����ָ��ֻ����init���ڡ�
		//���ǿ��ٵı����Ϳռ�����Ȼ���ڵģ�����ֻ��t1���������������ʶ���
		//���Կ���root���������������ڵ��
		//System.out.println(t1.val+"");
		
		printTree(root);
		
		System.out.println("Max height:"+maxHeight(root));
		System.out.println("preorderTraversal");
		preOrder(root);
		System.out.print("\n");
		System.out.println("InOrderTraversal");
		inOrder(root);
		System.out.print("\n");
		System.out.println("postorderTraversal");
		postOrder(root);
		
	}
	public static void inOrder(Tree root){
		//��Ȼ�������Ĳ�����������Ǹ�static ����ͬ����������inOrder�����rootָ��ָ����Ǵ��������������
		if(root != null){
			inOrder(root.left);
			System.out.print(root.val+",");
			inOrder(root.right);
		}
	}
	public static List<Integer> rightView(){
		return null;
	}
	public static void preOrder(Tree root){
		if(root != null){
			System.out.print(root.val+",");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	public static void postOrder(Tree root){
		if(root != null){
			
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.val+",");
		}
	}
	public static int maxHeight(Tree node){
		if(node != null){
			return Math.max(maxHeight(node.left),maxHeight(node.right))+1;
		}
		return 0;
	}
	/**
	Key Point:
	print binary tree ���鷳
	���鷳��һ������
	**/
	public static void printTree(Tree root){
		
		Queue<Tree> currentLevel = new LinkedList<Tree>();
        Queue<Tree> nextLevel = new LinkedList<Tree>();

        currentLevel.add(root);

        while (!currentLevel.isEmpty()) {
            Iterator<Tree> iter = currentLevel.iterator();
            while (iter.hasNext()) {
                Tree currentNode = iter.next();
                if (currentNode.left != null) {
                    nextLevel.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    nextLevel.add(currentNode.right);
                }
                System.out.print(currentNode.val + " ");
            }
            System.out.println();
            currentLevel = nextLevel;
            nextLevel = new LinkedList<Tree>();

        }
		
		
		
	}
	public static void init(){
		/***
		����staticд���Ǵ��,�ᱨ��
		InorderTraversal.java:11: error: illegal start of expression
                static Tree t1 = new Tree();
		static variableֻ���ڷ�����������
		**/
		//static Tree t1 = new Tree();
		Tree t1 = new Tree();
		t1.val = 1;
		root.left = t1;
		Tree t2 = new Tree(2);
		t2.left = new Tree(6,new Tree(7),new Tree(8));
		t2.right = new Tree(5);
		root.right = t2;
		t1.left = new Tree(3);
		t1.right = new Tree(4,null,new Tree(21));
	}
}