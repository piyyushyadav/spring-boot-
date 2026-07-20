package net.engineeringdigest.journalApp.controller.entity;

public class JournalEntry {

    private  long id;
    private String tittle;

    private String content;

    public long getId() {
        return id;
    }

    public String getTittle() {
        return tittle;
    }

    public String getContent() {
        return content;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
