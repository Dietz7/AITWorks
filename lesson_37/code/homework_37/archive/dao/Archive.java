package homework_37.archive.dao;

import homework_37.archive.model.Document;

import java.time.LocalDate;

public interface Archive {
    boolean addDocument(Document document); //The method takes a single parameter of TYPE DOCUMENT.
// This is the object that is to be added.
    boolean updateDocument(int documentId, int folderId, String title, String url);
    Document getDocumentFromArchive(int documentId, int folderId);
    Document[] getAllDocumentsFromFolder (int folderId);
    Document[] getDocumentBetweenDates(LocalDate dateFrom, LocalDate dateTo);
    int size();


}
