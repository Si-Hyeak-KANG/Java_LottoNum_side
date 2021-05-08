package system;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

//Math.random() Ȱ��
//�ڹ� �����ӿ�ũ Set Ȱ��
public class MyLotto {

	public static void main(String[] args) {
	
		System.out.println("�ζ� ��ȣ�� ������ Ƚ���� �Է����ּ���.");
		
		Scanner inputNum = new Scanner(System.in);
		int play_count = inputNum.nextInt();
		
		for(int i=1; i <= play_count; i++) {
			System.out.println( i +"��°: " + makingLottoNumber());
		}
	}	
	
	static String makingLottoNumber() {
		
		Set<Integer> set = new HashSet<Integer>();
		
		while(set.size() != 6) {
			set.add((int)(Math.random()*45+1));
		}
		
		//����
		List<Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list);
		
		return list.toString();

	}

}


	