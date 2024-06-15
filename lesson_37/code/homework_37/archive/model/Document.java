package homework_37.archive.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Document implements Comparable<Document> {
    private int folderId;
    private int documentId;
    private String title;
    private String url;
    private LocalDateTime date;

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
    public LocalDateTime getDate() {
        return date;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setUrl(String url) {
        this.url = url;
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
        if (!(o instanceof Document document)) return false;
        return folderId == document.folderId && documentId == document.documentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(folderId, documentId);
    }

    @Override
    // This means the method is PUBLICLY ACCESSIBLE, returns an integer, and takes one parameter o of type Document.
    // This method is part of the Comparable<Document> interface, which means instances of the Document (SUBSTANCE) class
    // can be compared to each other.
    //Method PURPOSE
    //The compareTo method defines the natural ordering of Document objects. The method compares the current Document object
    // (this) with another Document object (o) to determine their relative ordering.
    public int compareTo(Document o) {
        // SORTING LOGIC
        //The sorting is done based on two fields: folderId and documentId. The goal is to first sort by folderId and THEN
        // by documentId if the folderId values are the same.
        int res = Integer.compare(folderId, o.folderId);
        // This method compares the folderId of the current object (this.folderId) with the folderId of the object being compared (o.folderId).
        //If folderId of this is less than folderId of o, it returns a negative integer.
        //If folderId of this is greater than folderId of o, it returns a positive integer.
        //If both are equal, it returns zero.
        return res != 0 ? res : Integer.compare(documentId, o.documentId);
        //This is a conditional (ternary) operator that checks the value of res.
        //If res is not zero (res != 0), it means the folderIds were different, so it returns res (which could be negative
        // or positive, indicating the relative order).
        //If res is zero, it means the folderIds were the same, so it proceeds to compare the documentId values using Integer.compare(documentId, o.documentId).
        //If documentId of this is less than documentId of o, it returns a negative integer.
        //If documentId of this is greater than documentId of o, it returns a positive integer.
        //If both are equal, it returns zero.
        // FULL EXPLANATION with an EXAMPLE for this method PLEASE SEE IN TEXT FILE "Theory"
    }
}
