import java.util.*;
class RemoveArrayList{
	public static void main(String[] args){
		//ɾ��ArrayList�д���10��Ԫ��
		List<Integer> list = new ArrayList<>();
		int[] arr = {1,4,6,1,4,22,33,10,7};
		//list = Arrays.asList(arr);
		//Key point:asList���ص�AbstractListδʵ��ArrayList��add��remove����
		for(int i:arr){
			list.add(i);
		}
		for(int i =0;i<=list.size()-1;i++){
			//list.remove(i); remove����i����λ�õ�ֵ�����Ҫremove i���������Ҫlist.remove(new Integer(i));
			if(list.get(i) >= 10) list.remove(i);
		}
		System.out.println(list);
	}
}