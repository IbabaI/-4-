package work;

public class Ex18 {


	public static void main(String[] args) {
		

		ShopService obj1 = ShopService.getInstance();
	      ShopService obj2 = ShopService.getInstance();

	      if(obj1 == obj2) {
	    	  System.out.println("같은 ShopService 객체 입니다.");
	      }else {
	    	  System.out.println("다른 ShopService 객체 입니다.");
	      }
	}

}
/*싱글톤
 * 1. 자신타입의 private static 필드생성
 * 2. default 생성자를 private로 선언
 * 3. public getInstance()메소드 선언
 * */
class ShopService {

	private static ShopService shopService = new ShopService();
	
	private ShopService() {}
	
	static ShopService getInstance() {
		return shopService;
	}
}
