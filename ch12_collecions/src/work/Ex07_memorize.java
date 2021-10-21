package work;

import java.util.ArrayList;
import java.util.List;

public class Ex07_memorize {

	public static void main(String[] args) {
		System.out.println("BoardDao��ü�� getBoardList()�޼ҵ带 ȣ���ϸ� List<Board>Ÿ���� �÷����� �����մϴ�. \r\n"
				+ "ListExampleŬ������ ��������� �� ������ ���� ��µ� �� �ֵ��� BoardDao�� getBoardList()�޼ҵ带 �ۼ��غ�����.");
		
		BoardDao dao = new BoardDao();
		//�ν��Ͻ��� �޼ҵ� ȣ�� - ��������.�޼ҵ��(); ���ϰ� - ���� Ÿ��
		List<Board> list = dao.getBoardList();
		for(Board board : list) {
			System.out.println(board.getTitle() + "-" +board.getContent());
		}

	}

}//�ܿ���. �߿���
class BoardDao {
	public List<Board> getBoardList() {
		List<Board> list= new ArrayList<>();
		list.add(new Board("����1","����1"));
		list.add(new Board("����1","����1"));
		list.add(new Board("����1","����1"));
		
		return list;
		
	}
}
