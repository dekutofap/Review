//Leetcode 448 review
import java.util.*;
public class Leet448{
	public static void main(String[] a){
		int[] nums = {3,3,3,2,6,8,6,4,5};
		List<Integer> list = new ArrayList<>();
		list = new Leet448().solution(nums);
		//Arrays.asList(nums)  ֻ�᷵��һ�����ã���Ϊ�ǽ�nums������һ�����忴��--->��Ϊnums��int�����������飬�����Integer[] ��û��������.....
		
		System.out.println("Original Array:");
		for(int i:nums) System.out.print(i+" ");
		System.out.print("\n");
		System.out.println(list);
	}
	public List<Integer> solution(int[] nums){
		//index --> arr[index] = -1 .��Ϊԭ���������0
		List<Integer> list = new ArrayList<>();
		int[] inf = new int[nums.length];
		//Key point:
		//�����д�������⣬�����������ֱ�Ϊ-1����ô�����������������ʱnums[i]�е�i����-1�ˣ�����
		//for(int i =0;i<=nums.length-1;i++) nums[nums[i]-1] = -1;
		for(int i =0;i<=nums.length-1;i++) inf[nums[i]-1] = -1;
		for(int i =0;i<=nums.length-1;i++) {
			if(inf[i] != -1) list.add(i+1);
		}
		return list;
	}
}
