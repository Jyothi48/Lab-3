package transport;

public final class SecurityRules {

	public SecurityRules() {
		// TODO Auto-generated constructor stub
	}
	public static boolean canFly(String place) {
        return !place.equalsIgnoreCase("ExamCell");
	}

}
