public class Paper {

    private String id;
    private String title;
    private String authors;
    private String year;
    private String journal;
    private String domain;
    private String doi;
    private String abstractText;
    private int citations;

    public Paper(
            String id,
            String title,
            String authors,
            String year,
            String journal,
            String domain,
            String doi,
            String abstractText,
            int citations) {

        this.id = id;
        this.title = title;
        this.authors = authors;
        this.year = year;
        this.journal = journal;
        this.domain = domain;
        this.doi = doi;
        this.abstractText = abstractText;
        this.citations = citations;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthors() {
        return authors;
    }

    public String getYear() {
        return year;
    }

    public String getJournal() {
        return journal;
    }

    public String getDomain() {
        return domain;
    }

    public String getDoi() {
        return doi;
    }

    public String getAbstractText() {
        return abstractText;
    }

    public int getCitations() {
        return citations;
    }

    public String toFileString() {

        return id + "|" +
                title + "|" +
                authors + "|" +
                year + "|" +
                journal + "|" +
                domain + "|" +
                doi + "|" +
                abstractText + "|" +
                citations;
    }

    public void display() {

        System.out.println();
        System.out.println("==========================================");
        System.out.println("Paper ID     : " + id);
        System.out.println("Title        : " + title);
        System.out.println("Authors      : " + authors);
        System.out.println("Year         : " + year);
        System.out.println("Journal      : " + journal);
        System.out.println("Domain       : " + domain);
        System.out.println("DOI          : " + doi);
        System.out.println("Citations    : " + citations);
        System.out.println("Abstract     : " + abstractText);
        System.out.println("==========================================");
    }
}
