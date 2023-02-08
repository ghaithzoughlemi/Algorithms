package Memento;

public class EditorState {

	private final String content;
	private final String title;

	public EditorState(String content, String title) {
		this.title = title;
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public String getTitle() {
		return title;
	}

}
