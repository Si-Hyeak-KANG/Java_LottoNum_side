package system;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

//Math.random() 활용
//자바 프레임워크 Set 활용
public class MyLotto {

	public static void main(String[] args) {
	
		System.out.println("로또 번호를 추출할 횟수를 입력해주세요.");
		
		Scanner inputNum = new Scanner(System.in);
		int play_count = inputNum.nextInt();
		
		for(int i=1; i <= play_count; i++) {
			System.out.println( i +"번째: " + makingLottoNumber());
		}
	}	
	
	static String makingLottoNumber() {
		
		Set<Integer> set = new HashSet<Integer>();
		
		while(set.size() != 6) {
			set.add((int)(Math.random()*45+1));
		}
		
		//정렬
		List<Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list);
		
		return list.toString();

	}

}


	