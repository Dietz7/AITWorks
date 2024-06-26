package homework_38.doc_archive.dao;

import homework_38.doc_archive.model.Document;

import java.time.LocalDate;

public interface Archive {
boolean addDocument(Document document);
boolean removeDocument(int folderId, int documentId);
boolean updateDocument(int folderId, int documentId, String url);
Document getDocFromFolder(int folderId, int DocumentId);
Document [] getAllDocFromFolder(int folderId);
Document [] getDocBetweenDate(LocalDate dateFrom, LocalDate dateTo);
Document [] getDocBetweenDateTwo(LocalDate dateFrom, LocalDate dateTo);
int size();
void viewArchive();

}
