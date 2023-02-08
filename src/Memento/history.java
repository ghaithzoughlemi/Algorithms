package Memento;

import java.util.ArrayList;
import java.util.List;

public class history {

	List<EditorState> states = new ArrayList<>();

	public void push(EditorState state) {
		states.add(state);
	}

	public EditorState pop() {
		int lastitem = states.size() - 1;
		EditorState item = states.get(lastitem);
		states.remove(item);
		return item;
	}

}
