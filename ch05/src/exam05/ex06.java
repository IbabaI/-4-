package exam05;

public class ex06 {

	public static void main(String[] args) {
		
	System.out.println("�迭�� ���̿� ���� �����Դϴ�. array.length�� ���� array[2].length�� ���� ���Դϱ�?\r\n");	

	int[][] array ={
		      {95,86},
		      {83,92,96},
		      {78,83,93,87,88}
		  };
	
	//array.length  ->(  3  )
	//array[2].length  ->(  5  )
	
	System.out.println(array.length); // �������迭 �迭��.length=1�����迭�� ����(���� ��)
	System.out.println(array[2].length); // index��ȣ 2������ �迭�� ���� (���� �� = ��Ҽ�)
	}

}
