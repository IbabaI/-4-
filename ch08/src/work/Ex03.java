package work;

public class Ex03 {
  
  /*������ Soundable �������̽��Դϴ�. sound()�߻� �޼ҵ�� ��ü�� �Ҹ��� �����մϴ�.
 public interface Soundable{
    String sound();
}

SoundableExampleŬ�������� printSound()�޼ҵ�� Soundable�������̽� Ÿ���� �Ű������� ������ �ֽ��ϴ�.
main()�޼ҵ忡�� printSound()�� ȣ���� �� Cat �� Dog ��ü�� �ְ� �����ϸ� ���� "�߿�"�� "�۸�"�� ��µǵ���
Cat�� Dog Ŭ������ �ۼ��غ�����.
   * 
   * */
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	
	public static void main(String[] args) {
		
		printSound(new Cat());
		printSound(new Dog());

	}

	   
   }

// ��� �� : �߿�, �۸�