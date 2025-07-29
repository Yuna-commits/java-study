package generic;

public class Printer02<T> {
//	public void println(int i) {
//		System.out.println(i);
//	}
//
//	public void println(boolean b) {
//		System.out.println(b);
//	}
//
//	public void println(double d) {
//		System.out.println(d);
//	}
//
//	public void println(String s) {
//		System.out.println(s);
//	}

	public <T> void println(T type) {
		System.out.println(type);
	}
}
