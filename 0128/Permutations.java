import java.util.*;
class Permutations{
	//Contains duplicates
	public static void main(String[] args){
		int[] arr = {3,5,1,2,2,3};
		List<List<Integer>> list = new ArrayList<>();
		List<Integer> item = new ArrayList<>();
		boolean[] used = new boolean[arr.length];
		Arrays.sort(arr);
		new Permutations().helper(list,item,used,arr);
		for(List<Integer> i:list) System.out.println(i);
	}
	public void helper(List<List<Integer>> list,List<Integer> item,boolean[] used,int[] nums){
		if(item.size() == nums.length){
			list.add(new ArrayList<>(item));
		} else {
			for(int i = 0;i<=nums.length-1;i++){
				//Key point��ifд�����������Ƚ��鷳��д�ɲ��������������ס�
				//����������2�㣺
				//1)��ʹ��
				//2)δʹ�ã�����Ϊǰ����ͬ����ҲΪʹ��������ͬ������Ҳ����ʹ�á�����ͬ��������Ϊһ�����忴��
				if(used[i] || i > 0 && nums[i] == nums[i-1] && !used[i-1]) continue;
				item.add(nums[i]);
				used[i] = true;
				helper(list,item,used,nums);
				item.remove(item.size()-1);
				used[i] = false;			
			}
		}
	}
}