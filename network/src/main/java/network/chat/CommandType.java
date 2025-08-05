package network.chat;

public enum CommandType {
	JOIN,
	MESSAGE,
	QUIT,
	UNKNOWN;
	
	//String -> enum 상수
	public static CommandType from(String token) {
		try {
			//대소문자 구분
			return CommandType.valueOf(token.toUpperCase());
		} catch(IllegalArgumentException e) {
			return UNKNOWN;
		}
	}
}
