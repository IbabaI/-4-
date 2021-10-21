package work;

import java.util.ArrayList;
import java.util.List;

public class Ex07_memorize {

	public static void main(String[] args) {
		System.out.println("BoardDao객체의 getBoardList()메소드를 호출하면 List<Board>타입의 컬렉션을 리턴합니다. \r\n"
				+ "ListExample클래스를 실행시켰을 때 다음과 같이 출력될 수 있도록 BoardDao의 getBoardList()메소드를 작성해보세요.");
		
		BoardDao dao = new BoardDao();
		//인스턴스의 메소드 호출 - 참조변수.메소드명(); 리턴값 - 리턴 타입
		List<Board> list = dao.getBoardList();
		for(Board board : list) {
			System.out.println(board.getTitle() + "-" +board.getContent());
		}

	}

}//외워라. 중요함
class BoardDao {
	public List<Board> getBoardList() {
		List<Board> list= new ArrayList<>();
		list.add(new Board("제목1","내용1"));
		list.add(new Board("제목1","내용1"));
		list.add(new Board("제목1","내용1"));
		
		return list;
		
	}
}
