class InsertionSort{
	public static void main(String[] args){
		int[] arr = {8,5,2,7,12,1,3,5,7,88,4,22,100,46};
		new InsertionSort().sort(arr);
		for(int i:arr) System.out.print(i+",");
	}
	public void sort(int[] arr){
		for(int i =1;i<=arr.length-1;i++){
			int tmp = arr[i],j = i;
			//Key :arr[j]<arr[j-1]����Ϊj--,����arr[j]ָ���ֵһֱ�ڱ仯����Ӧ����ô�ȡ�Ӧ����tmp�Ƚ�
			//while(j >= 1 && arr[j]<arr[j-1]){
			while(j >=1 && tmp<arr[j-1]) arr[j] = arr[--j];
			arr[j] = tmp;
		}
	}
}