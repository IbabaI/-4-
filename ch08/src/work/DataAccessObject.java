package work;

public interface DataAccessObject {

	public void select();
	public void insert();
	public void update();
	public void delete();
	
	
}
class OracleDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("Oracle DB���� �˻�");
		
		
	}

	@Override
	public void insert() {
		System.out.println("Oracle DB�� ����");
		
	}

	@Override
	public void update() {
		System.out.println("Oracle DB�� ����");
		
	}

	@Override
	public void delete() {
		System.out.println("Oracle DB���� ����");
		
	}
}
class MysqlDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("MySql DB���� �˻�");
		
	}

	@Override
	public void insert() {
		System.out.println("MySql DB�� ����");
		
	}

	@Override
	public void update() {
		System.out.println("MySql DB�� ����");
		
	}

	@Override
	public void delete() {
		System.out.println("MySql DB���� ����");
		
	}
}
