package work;

public class Ex04 {

	
	/*
 *   DaoExample Ŭ������ main()�޼ҵ忡�� dbWork()�޼ҵ带 ȣ���� �� OracleDao�� MySqlDao��ü�� 
�Ű������� �ְ� ȣ���߽��ϴ� dbWork()�޼ҵ�� �� ��ü�� ��� �Ű������� �ޱ� ���� DataAccessObject Ÿ���� 
�Ű� ������ ������ �ֽ��ϴ�. ���� ����� ���� DataAccessObject�������̽��� OracleDao, MySqlDao���� 
Ŭ������ ���� �ۼ��غ�����.
 * */
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	
	public static void main(String[] args) {
		
		dbWork(new OracleDao());
		dbWork(new MysqlDao());
		
		
	
	}

	
}




/*����� :
 * Oracle DB���� �˻� 
 * Oracle DB�� ����
 * Oracle DB�� ����
 * Oracle DB���� ����
 * MySql DB���� �˻�
 * MySql DB�� ����
 * MySql DB�� ����
 * MySql DB���� ����
 */
