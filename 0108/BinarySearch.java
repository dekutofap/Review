class BinarySearch{
	//binary search recursion version
	public static void main(String[] args){
		int[] arr = {1,2,3,5,6,7,8,9,10,11};
		int target = 4;
		//��Ȼ��������״̬����-1����Ӧ����Ĭ�������������ǷǸ���
		System.out.println("Target = "+ target+",index = " +search(arr,target,0,arr.length));
	}
	public static int search(int[] arr,int target,int low,int high){
		int status = -1;
		if(low<=high){
			int mid = (low+high)/2;
			if(arr[mid] == target){
				status = mid;
			} else if(arr[mid] < target){
				status = search(arr,target,mid+1,high);
			} else {
				status = search(arr,target,low,mid-1);
			}
		//��Ϊ���ַ�ֻ�Ƕ�һ����еݹ飬���������������µġ�
		//���鲢����һ�������п����Ƿ�ƽ�����ṹ��������returnʱ���׿��Ǹ�����....
		}
		return status;
	}
}