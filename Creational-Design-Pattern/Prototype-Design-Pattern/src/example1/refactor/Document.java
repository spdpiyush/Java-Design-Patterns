package example1.refactor;

import javax.print.Doc;

public abstract class Document implements Cloneable{

    private String title;
    private String author;
    private String content;

    public Document(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Document) super.clone();
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
