package exercise03.prob03;

public class StringUtil {
	public static String concatenate(String[] strArr) {
//		String result="";
//		for(String str: strArr) {
//			result+=str;
//		}
		
		return String.join("", strArr);
	}
}
