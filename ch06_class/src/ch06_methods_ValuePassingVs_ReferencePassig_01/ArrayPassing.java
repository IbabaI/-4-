package ch06_methods_ValuePassingVs_ReferencePassig_01;

public class ArrayPassing {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		
		//�迭�� ��ü - ���� �ּҰ��� �Ű����� ������ ���� ��
		increase(a);
		
		System.out.println("a �迭 �� ��Ұ�");
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i] + " ");
		}

	} //main()��
	
	//�迭�� �Ű������� ���޵ȴٴ� ���� �����ϴ� �ּҰ��� ���޵ȴٴ� ��.
    static void increase(int[] array) {
    	
    	//���ο� �迭 ����
    	int[] newArr = new int[array.length];
    	for(int i=0; i<array.length; i++) {
    		newArr[i]=array[i];
    	}
    	
    	for(int i=0; i<array.length; i++) {//[2][3][4][5][6]
    		array[i]++;  //int x = array[i], x++; array[i]=x; //�� ����� ����� ���� 1�� ����
    		}
    	System.out.println("�޼ҵ忡�� ���� ������ �迭 �� ��Ұ�");
    	for(int i=0; i<array.length; i++) {
    		System.out.println(newArr[i]+" ");
    	}
    	System.out.println();
    	
    	//��ü�� Ÿ���� �ּҰ� ���޵Ǿ�� �Ѵ�.
    }
}
