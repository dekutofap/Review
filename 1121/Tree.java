class Tree{
	int val;
	Tree left;
	Tree right;
	//����д���Ǵ���ģ�java����C++�������βΡ���Ҫ�÷���������ʵ��
	//public void Tree(int val = 0){
		
	//Key Point:
	//���췽��ֻ�з�������ʲô�ؼ��ֶ���Ҫ�ӣ�����ᱨ��
	//public void Tree(int val,Tree left,Tree right){
	Tree(int val,Tree left,Tree right){
		this.left = left;
		this.right = right;
		this.val = val;
	}
	Tree(int val){
		this.val = val;
		this.left = null;
		this.right = null;
	}
	Tree(){}
}