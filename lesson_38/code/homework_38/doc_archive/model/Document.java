package homework_38.doc_archive.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Document implements Comparable<Document>  {
   // fields of our object
    private int folderId;
    private int documentId;
    private String title;
    private String url;
    private LocalDateTime date;

    // now we are creating the constructor

    public Document(int folderId, int documentId, String title, String url, LocalDateTime date) {
        this.folderId = folderId;
        this.documentId = documentId;
        this.title = title;
        this.url = url;
        this.date = date;
    }

    public int getFolderId() {
        return folderId;
    }

    public int getDocumentId() {
        return documentId;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LocalDateTime getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Document{" +
                "folderId=" + folderId +
                ", documentId=" + documentId +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document document = (Document) o; // This casts the object o to a Document type. This is safe to do because the previous
        // check ensures that o is not null and is of the same class as this.
        return folderId == document.folderId && documentId == document.documentId;
    }

    @Override
    public int compareTo(Document o) {
        int res = Integer.compare(folderId, o.folderId);
        return res != 0 ? res: Integer.compare(documentId,o.documentId);
    }
}
