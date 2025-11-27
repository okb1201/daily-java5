package day09.q01;

import java.io.IOException;

public class ComPlayer implements Playable {

	private String name = "コンピュータ";

	@Override
	public int doJanken() throws IOException {

		int choiceNumber = (int) Math.random() * 3;
		String hand[] = { "グー", "チョキ", "パー" };
		System.out.println(name + "は" + hand[choiceNumber] + "を選んだ");

		return choiceNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
