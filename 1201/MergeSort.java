class MergeSort{
	private static int[] arr = {55,22,11,4,5,1,8,7,1,2,3,1,1,8,9,55,66,77,87,444,1,5,6,4,15};
	private static int length = arr.length;
	private static int[] tmp = new int[length];
	
	public static void main(String[] args){
		Sort(0,length-1);
		for(int i:arr){
			System.out.print(i+"\t");
		}
	}
	public static void Sort(int low,int high){
		if(low<high){
			int mid = (low+high)/2;
			Sort(low,mid);
			Sort(mid+1,high);
			Merge(low,mid,high);
		}
	}
	public static void Merge(int low,int mid,int high){
		int index0 = low;
		int index1 = low;
		int index2 = mid+1;
		while(index1<=mid && index2<= high){
			if(arr[index1]<arr[index2]) tmp[index0++] = arr[index1++];
			else tmp[index0++] = arr[index2++];
		}
		while(index1<=mid){
			tmp[index0++] = arr[index1++];
		}
		while(index2<=high){
			tmp[index0++] = arr[index2++];
		}
		while(low<=high){
			//Key point:
			//arr[low++] = tmp[low]; ����д���Ǵ�ģ�ָ�����
			//�����ִ������Ӧ������ߵ�low����1���ұߵ�low��ʱ���������1���ֵ��
			//Ҳ����˵��һ��ʼ�Ǵ�(low+1)��ʼ��ѭ��.
			//Key point:
			//Ҫע������(1)��ִ������ߵı��ʽ��(2)�ſ�ʼִ���ұߵı��ʽ��(3)��ִ���ұ߸�ֵ�����
			arr[low] = tmp[low++];
			//low++;
		}
	}
}