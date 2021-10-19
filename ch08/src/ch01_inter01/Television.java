package ch01_inter01;

public class Television {

	//ÇÊµå
	private int volume;
	
	public void turnOn() {
		System.out.println("TV¸¦ ÄÕ´Ï´Ù.");
	}
	public void turnOff() {
		System.out.println("TV¸¦ ²ü´Ï´Ù.");
	}
	public void setVolume(int volume) {
		System.out.println("ÇöÀç TV º¼·ý");
	}
}
