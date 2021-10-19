package work;

public class Ex18 {


	public static void main(String[] args) {
		

		ShopService obj1 = ShopService.getInstance();
	      ShopService obj2 = ShopService.getInstance();

	      if(obj1 == obj2) {
	    	  System.out.println("���� ShopService ��ü �Դϴ�.");
	      }else {
	    	  System.out.println("�ٸ� ShopService ��ü �Դϴ�.");
	      }
	}

}
/*�̱���
 * 1. �ڽ�Ÿ���� private static �ʵ����
 * 2. default �����ڸ� private�� ����
 * 3. public getInstance()�޼ҵ� ����
 * */
class ShopService {

	private static ShopService shopService = new ShopService();
	
	private ShopService() {}
	
	static ShopService getInstance() {
		return shopService;
	}
}
