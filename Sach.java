package lab2;
public class Sach {
    private String boCode;
    private String boTitle;
    private String boAuthor;

    public Sach() {
    }

    public Sach(String boCode, String boTitle, String boAuthor) {
        this.boCode = boCode;
        this.boTitle = boTitle;
        this.boAuthor = boAuthor;
    }

    public String getBoCode() {
        return boCode;
    }

    public String getBoTitle() {
        return boTitle;
    }

    public String getBoAuthor() {
        return boAuthor;
    }

    @Override
    public String toString() {
        return "Book{" + "Code='" + boCode + "', Title='" + boTitle + "', Author='" + boAuthor + "'}";
    }
}

