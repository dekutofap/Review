class MaxSubArray{
	public static void main(String[] args){
		int[] data = {13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};
		int[] tmp = new int[data.length];
		int max = data[0];
		tmp[0] = data[0];
		for(int i=1;i<=data.length-1;i++){
			if(tmp[i-1]>0){
				tmp[i] = tmp[i-1]+data[i];
			} else {
				tmp[i] = data[i];
			}
			if(max<=tmp[i]) max=tmp[i];
			//DP�淶��д��Ӧ���ǵ��������ġ�01�����ǿ��ǼӲ���F[i],����������ǿ��ǼӲ���F[i-1]!!!!
			//F[i] = Math.max(tmp[i],tmp[i-1]+data[i]);
			//max = Math.max(max,tmp[i]);
			
		}
		System.out.println("The maximum subArray is"+max);
	}
}