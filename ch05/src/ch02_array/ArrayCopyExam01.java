package ch02_array;

public class ArrayCopyExam01 {

	public static void main(String[] args) {
		
		String[] oldStrArray = {"java","array","copy"};
		String[] newStrArray = new String[5]; //[null][null][null][null][null]
		
		for(int i=0; i<oldStrArray.length; i++)
		newStrArray[i]=oldStrArray[i]; //["java"]["array"]["copy"][null][null]
		
		// System.arrayCopy(); - 깊은 copy, 새로운 배열을 생성한 후에 사용
		// arrayCopy(소스.소스의시작 index, 타겟, 타겟의시작index, 복사할 길이)
		System.arraycopy(oldStrArray, 0, newStrArray, 0, 0);
		
		for(int i=0; i<newStrArray.length; i++)
			System.out.print(newStrArray[i]+" ");
		
		
		
		System.out.println("\n----------------------");
		//java.lang.ArrayIndexOutOfBoundsException: 소스의 갯수가 2개인데 복사랄 길이를 3으로 하면 오류 발생
		System.arraycopy(oldStrArray, 1, newStrArray, 0, oldStrArray.length-1);
		for(int i=0; i<newStrArray.length; i++)
			System.out.print(newStrArray[i]+" ");
		
		
		
		
		
		System.out.println("\n----------------------");
		//java.lang.ArrayIndexOutOfBoundsException: 소스의 갯수가 2개인데 타겟배열의 인덱스번호를 초과시 오류 발생
		System.arraycopy(oldStrArray, 1, newStrArray, 3, oldStrArray.length-1);
		for(int i=0; i<newStrArray.length; i++)
			System.out.print(newStrArray[i]+" ");
		
		
		
		
		int srcPos =1;
		int num = oldStrArray.length-srcPos;  //3-1 =2
		System.arraycopy(oldStrArray, 1, newStrArray, 3, num);
		for(int i=0; i<newStrArray.length; i++)
			System.out.print(newStrArray[i]+" ");
		
		//
		
        //메소드 arraycopy 역활 : Object src,  int  srcPos, Object dest, int destPos, int length
	
		
		
		
	}

}
