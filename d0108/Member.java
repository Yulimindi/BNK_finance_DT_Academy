package d0108;

import java.util.Scanner;

//회원 정보 저장하는 Member 클래스 만들기 이의 속성은 이름, 전화번호, 성별, 주소(지역 ex.서율)
//회원 등록 프로그램 만들기
//조회하면 등록 시킨 목록 나와야함
//실행 클래스, 멤버 클래스, 그리고 저장 클래스
//회원은 최대 10명까지 넣을 수 있음
public class Member {
	
	String name;
	int num;
	String gender;
	String adress;
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", num=" + num + ", gender=" + gender + ", adress=" + adress + "]";
	}

}
