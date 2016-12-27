class MergeSort{
	public static void main(String [] args){
		int[] arr = {1,5,1,1,11,55,66,432,64,2,7,0,0,9876,0,4,7,21};
		//Sorting(arr,0,arr.length-1);
		Sorting(arr);
		for(int i:arr){
			System.out.print(i+",");
		}
	}
	public static void Sorting(int[] arr){
		Sorting(arr,0,arr.length-1);
	}
	public static void Sorting(int[] arr,int low,int high){
		if(low<high){
			int mid = (low+high)/2;
			//Key point:
			//��Ȼ�����һ��������������ⲿ�����ڲ����õķ������ڲ��ı����Ҳ��Ӱ�쵽������������static�������籾���е�arr��ͨ���飬Sorting�ڸı��������ֵ������ȻӰ�쵽��
			//arr���鱾����
			//Key point 2:����������ڲ��������Լ����ɵı�������ô�򲻻�Ӱ�쵽�ⲿ��������ÿ�ε��÷���ʱֵ�������໥Ӱ�졣
			//��index1,index2,index3������ÿ�ε�����ɺ����Ƕ�����Ժ�������Ӱ�졣
			Sorting(arr,low,mid);
			Sorting(arr,mid+1,high);
			Merge(arr,low,mid,high);
		}
	}
	public static void Merge(int[] arr,int low,int mid,int high){
		int index1 = low,index2 = mid+1,index3 = low;
		int[] tmp = new int[arr.length];
		while(index1<=mid && index2 <= high){
			if(arr[index1] <= arr[index2]) tmp[index3++] = arr[index1++];
			else tmp[index3++] = arr[index2++];
		} 
		while(index1<=mid){
			tmp[index3++] = arr[index1++];
		}
		while(index2<=high){
			tmp[index3++] = arr[index2++];
		}
		while(low<=high){
			arr[low] = tmp[low++];
		}
	}
}