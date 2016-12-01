class Tree{
	int value = 0;
	Tree left = null;
	Tree right = null;
	Tree(int value,Tree left,Tree right){
		this.value = value;
		this.left = left;
		this.right = right;
	}
}
class MaxDepth{
	static Tree root = new Tree(99,null,null);
	public static void main(String[] args){
		init(root);
		System.out.print("The max depth is "+maxDepth(root));
		System.out.print("\n");
		System.out.println("Pre order is ");
		preOrder(root);
	}
	public static int maxDepth(Tree t){
		//Key Point:
		//root ���������������Ϊstatic������rootֻ������init()���������С�
		//��Ȼroot��left��right������init()�������ģ�ֱ�ӵ�������û��Ӧ����left��right���Ǵ��ڵģ���û�б����١�
		//�����static��root���ܷ��ʵ����ǵĵ�ַ
		if(t!=null) return Math.max(maxDepth(t.left)+1,maxDepth(t.right)+1);
		return 0;
	}
	public static void init(Tree node){
		root.left = new Tree(22,new Tree(11,new Tree(5,null,null),null),null);
		root.right = new Tree(188,new Tree(11,new Tree(5,new Tree(777,null,null),null),null),null);
	}
	public static void preOrder(Tree node){
		if(node != null){
			System.out.print(node.value+"\t");
			preOrder(node.left);
			preOrder(node.right);
		}
	}
}