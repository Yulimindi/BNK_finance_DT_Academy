package d0107;

//Student클래스 만들고 번호, 이름, 성별 변수 넣고, cnt변수를 정적변수로 만들기, 5명 학생 만들고 cnt 값 증가하는 함수 만들면 될듯
// 현재까지 생성된 학생 수가 몇명인지 저장
// 태어날 때 1번, 남자, 홍길동이 되도록 클래스를 수정하라

public class Student {

	int number;
	private String name;
	char gender;
	private int age;
	
	static int cnt = 0; // 변수 한번에 바꾸기 : alt + shift + R
	
	public Student() {
		cnt++;
		number = cnt;
		this.name = "홍길동";
		this.gender = 'M';
	}
	
	public Student(String name, char g) {
		number = ++cnt;
		this.name = name;
		this.gender = g;
	}
	
	void infoToString() {
		// 학생 정보를 문자열로 반환 (void 말고 string으로 해서 문자열 리턴해도 됨 : return no + name + gender)
		System.out.print("번호 : " + number + " 나이 : " + age + " 이름 : " + name);
		if(gender == 'M') {
			System.out.println(" 성별 : 남자 ");
		} else {
			System.out.println(" 성별 : 여자 ");
		}
		
	}
	
	
	public String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	
	public char getGender() {
		return gender;
	}
	
	void setGender(char gender) {
		this.gender = gender;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age <=0) {
			System.out.println("올바른 나이를 입력하세요.");
		} else {
			this.age = age;
		}
	}
}
