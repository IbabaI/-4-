package ch02_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		
	
		
		// 1.String객체를 담는 List만들고
		List<String> list = new ArrayList<>();
		
		//동기화 처리 Collections.synchronizedxxxx();
		list = Collections.synchronizedList(list);
		
		// 2."홍길동", "일지매",  "임꺽정"을 저장 후 		
		list.add("홍길동");
		list.add("일지매");
		list.add("임꺽정");
		
		// 3.저장된 갯수를 리턴하도록 작성		
		System.out.println(list.size());
				
		// 4."이순신"이 들어있는지 확인	
	    System.out.println(list.contains("이순신")?"이순신 문장이 있습니다.":"이순신 문장이 없습니다.");
		 
		// 5.모든 객체를 출력		 
		for(int i =0; i<list.size(); i++)
				System.out.println(list.get(i));
		for(String s:list)
			    System.out.println(s);
		
		// 6.index번호 2번에 해당하는 객체를 "유관순"으로 변경하세요.		
		list.set(2, "유관순");
		System.out.println();

		System.out.println("------------------");
		// 7.index번호 2번에 해당하는 객체를 출력하세요
		String str = list.get(2);
		System.out.println(str);
		
		System.out.println("===================");
		// 7-1.모든 객체를 출력		 
				for(int i =0; i<list.size(); i++)
						System.out.println(list.get(i));
				for(String s:list)
					    System.out.println(s);
				System.out.println("===================");
		
		// 8.리스트내의 모든 객체를 삭제 후 		
		list.clear();

		// 9.리스트가 비어있는지 확인 메세지를 출력		
		System.out.println(list.isEmpty()? "비었음" : "안비었음");
	}

}
