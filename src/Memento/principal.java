package Memento;

import java.util.ArrayList;
import java.util.List;

public class principal {

	public static void main(String[] args) {

		Editor edit = new Editor();
		history hist = new history();

		List<EditorState> state = new ArrayList<>();

		edit.setContent("a");
		edit.setTitle("Z");
		hist.push(edit.createState());
		state.add(edit.createState());

		edit.setContent("b");
		edit.setTitle("Y");
		hist.push(edit.createState());
		state.add(edit.createState());

		edit.setContent("c");
		edit.setTitle("X");
		hist.push(edit.createState());
		state.add(edit.createState());

		edit.restoreState(hist.pop());
		System.out.println("Res 1: " + edit.getContent() + " " + edit.getTitle());

		edit.restoreState(hist.pop());
		System.out.println("Res 2: " + edit.getContent() + " " + edit.getTitle());

		edit.restoreState(hist.pop());
		System.out.println("Res 3: " + edit.getContent() + " " + edit.getTitle());

		for (EditorState stat : state) {
			System.out.println(stat.getContent());
		}

	}

}
