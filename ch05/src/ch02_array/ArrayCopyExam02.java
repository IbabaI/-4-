package ch02_array;

import java.util.Arrays;

public class ArrayCopyExam02 {

	public static void main(String[] args) {
		
		String[] oldStrArray = {"java","array","copy"};
		String[] newStrArray = new String[5]; //[null][null][null][null][null]
		
		//deep copy
		//Arrays클래스의 copyOf(소스배열, 복사할 길이)=> 새로운 배열 객체 생성
		String[] arr2=Arrays.copyOf(oldStrArray, oldStrArray.length);
		for(int i=0; i<arr2.length; i++)
			System.out.println(arr2[i]+" ");
		
		System.out.println();
		arr2[0]="hi";
		for(int i=0; i<oldStrArray.length; i++)
			System.out.println(oldStrArray[i]+" ");
		
		
		
	}

}
