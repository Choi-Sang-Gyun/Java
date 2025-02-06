package day08.encap.good;

import java.util.Arrays;

public class MainClass02 {

	public static void main(String[] args) {
		
	
	//객체를 담는 배열
	Member[] arr = new Member[2];
	
	Member m1 = new Member("홍길동", 20, "서울", "010", true);
	Member m2 = new Member("이순신", 30, "경기", "010", false);
	
	
	arr[0] = m1;
	arr[1] = m2;
	
	System.out.println(Arrays.toString(arr));
	System.out.println("=================");
	
	//객체 배열의 반복
	
	for(int i = 0; i < arr.length; i++) {
		Member m = arr[i]; //주소를 받아주기 때문에 멤버라는 타입으로 나오게 됨 (주소값을 얻음)
		System.out.println(m.getName());
		System.out.println(m.getAge());
		System.out.println(m.getAddress());
		System.out.println(m.getPhone());
		System.out.println(m.isApprove());
		
	}
	
	
	
	}
}
