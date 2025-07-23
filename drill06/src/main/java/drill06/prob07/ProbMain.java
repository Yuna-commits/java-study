package drill06.prob07;

public class ProbMain {

	public static void main(String[] args) {
		Address address = new Address();
		address.setCity("서울");
		address.setStreet("강남대로");

		Customer customer = new Customer();
		customer.setName("둘리");
		customer.setAddress(address);

		/* 출력 코드 작성 */
		System.out.println("고객명: " + customer.getName());
		System.out.println("도시: " + customer.getAddress().getCity());
		System.out.println("도로명: " + customer.getAddress().getStreet());
	}
}
