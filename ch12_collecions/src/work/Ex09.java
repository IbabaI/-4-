package work;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex09 {

	public static void main(String[] args) {
		System.out.println("HashMap에 아디디(String)와 점수(Integer)가 저장되어 있습니다. 실행 결과와 같이 평균 점수를 출력하고, 최고 점수와 최고 점수를 받은 아이디를 출력해보세요.");
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;   //최고 점수를 받은 아이디 저장
		int maxScore = 0;   //최고 점수 저장
		int totalScore = 0; //점수 합계 저장
		
		// 작성 위치
		
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String key = it.next();
			int value = map.get(key);
			totalScore +=value;
			
			if(maxScore<value) {
				maxScore = value;
				name = key;
			}
		}
		
		System.out.println("평균점수: "+totalScore /map.size());
		System.out.println("최고점수: "+maxScore);
		System.out.println("최고 점수를 받은 아이디: "+ name);

		/* ------------------------------------------------ */
		name = null;   //최고 점수를 받은 아이디 저장
		maxScore = 0;   //최고 점수 저장
		totalScore = 0;
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		for(Map.Entry<String, Integer>entry :entrySet) {
			if(entry.getValue()>maxScore) {
				name = entry.getKey();
				maxScore = entry.getValue();
			}
			totalScore += entry.getValue();
		}
		int avgScore = totalScore/map.size();
		System.out.println("평균점수: "+avgScore);
		
		System.out.println("최고점수: "+maxScore);
		System.out.println("최고 점수를 받은 아이디: "+ name);
	}

}
