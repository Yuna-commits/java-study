package chapter03.ex17;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("둘리");
		s1.setSchool("Java School");

		Person p1 = s1; // 부모 <- 자식 Upcasting(암시적, Implicity)
		System.out.println(p1.getName());

		Person p2 = (Person) new Student(); // Upcasting(명시적), 다형성
		p2.setName("마이콜");

		Student s2 = (Student) p2; // 자식 <- 부모 Downcasting(반드시 명시, Explicity)
		s2.setSchool("Java School");
		
		// 우선순위 중요!!! (Student)p2.setSchool()
		//-> .의 우선순위가 더 높아서 p2.setSchool()로 반환된 void를 Student로 캐스팅
		((Student) p2).setSchool("Java School");
	}

}
