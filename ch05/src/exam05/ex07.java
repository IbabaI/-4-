package exam05;

public class ex07 {

	public static void main(String[] args) {
		
		
		System.out.println("�־��� �迭�� �׸񿡼� �ִ밪�� ���غ�����(for���� �̿��ϼ���).");
		
		int max =0, min=100;
		int[] array = {1,5,3,8,2};
	
		// �ۼ���ġ
		for(int i =0; i<array.length; i++) {
			if (array[i] > max) max=array[i];
			if (array[i] < min) min=array[i];
		}
		// ������� �ۼ���ġ
         System.out.println("max: "+ max);
         System.out.println("min: "+ min);
	}

}
