package ch01_If_02;

import java.util.HashSet;
import java.util.Set;

public class Lotto {

	public static void main(String[] args) {
		
		// 1~45까지의 6개의 자연수 무작위 추출
		// 반복문, Set자료구조 - 중복된 값 저장 하지 않음. -유일하게 하나의 값만 저장(1,1저장 =>1)
		//while(true) 무한반복
		//중복되지 않은 정수를 저장하는 저장소 set에 값 저장
		Set<Integer> lottos = new HashSet<Integer>();
		
		while(lottos.size()<6) {
			int num=(int)(Math.random()*45)+1;
			System.out.println(num);
			lottos.add(num); //set에 값 저장
		}
		System.out.println(lottos);
	}

}
