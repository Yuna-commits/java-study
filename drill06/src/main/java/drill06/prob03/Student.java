package drill06.prob03;

public class Student implements Comparable<Student> {
	private String name;
	private int score;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public int compareTo(Student other) {
		return (Integer.compare(this.score, other.score));
	}

}
