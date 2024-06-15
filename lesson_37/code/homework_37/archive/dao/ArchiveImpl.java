package homework_37.archive.dao;

import homework_37.archive.model.Document;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class ArchiveImpl implements Archive{
    private Document[] documents;
    private int size;

    public ArchiveImpl(Document[] documents, int size) {
        this.documents = documents;
        this.size = 0;
    }


    static Comparator<Document> comparator = (d1, d2) -> {
        int res = d1.getDate().compareTo(d2.getDate());
        return res !=0 ? res : Integer.compare(d1.getDocumentId(), d2.getDocumentId());
    };
    //Unlike COMPARABLE, where the compareTo method is implemented WITHIN the OBJECT, a COMPARATOR can be defined EXTERNALLY.
    //STATIC means that this Comparator is associated with the class itself, rather than with any specific instance of the
    //class. It can be accessed using the class name WITHOUT CREATING AN INSTANCE.
    //d1 and d2 are the two Document objects being compared.d1.getDate().compareTo(d2.getDate()) compares
    // the dates of the two documents.
    //compareTo returns:
    //A negative integer if d1.getDate() is before d2.getDate().
    //Zero if the dates are equal.
    //A positive integer if d1.getDate() is after d2.getDate()
    //Primary sorting criterion: By date (using getDate()).
    //Secondary sorting criterion: By document ID (using getDocumentId()) if the dates are the same.

    @Override
    public boolean addDocument(Document document) {
        // bad cases
        if(document == null || size == documents.length || getDocumentFromArchive(document.getDocumentId(), document.getFolderId()) != null)  {
            return false;
        }
        // find index to insert
        int index = Arrays.binarySearch(documents, 0, size, document, comparator);
        //
        index = index >= 0 ? index : -index-1;
        // shift array from index right on 1 position
        System.arraycopy(documents, index, documents, index + 1, size - index);
        documents[index] = document;
        size++;
        return true;
    }

    @Override
    public boolean updateDocument(int documentId, int folderId) {
        Document document = getDocumentFromArchive(documentId, folderId);
        if (document != null) {
            // Assuming update means changing some attributes, e.g., URL, content, etc.
            // For example:
            // document.setUrl(newUrl);
            return true;
        }
        return false;
    }

    @Override
    public Document getDocumentFromArchive(int documentId, int folderId) {
        for (int i = 0; i < size; i++) {
            if (documents[i].getDocumentId() == documentId && documents[i].getFolderId() == folderId) {
                return documents[i];
            }
        }
        return null;
    }

    @Override
    public Document[] getAllDocumentsFromFolder(int folderId) {
        Document[] result = new Document[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (documents[i].getFolderId() == folderId) {
                result[count++] = documents[i];
            }
        }
        return Arrays.copyOf(result, count);
    }

    @Override
    public Document[] getDocumentBetweenDates(LocalDate dateFrom, LocalDate dateTo) {
        Document[] result = new Document[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (!documents[i].getDate().isBefore(dateFrom.atStartOfDay()) && !documents[i].getDate().isAfter(dateTo.atStartOfDay())) {
                result[count++] = documents[i];
            }
        }
        return Arrays.copyOf(result, count);
    }

    @Override
    public int size() {
        return size;
    }
}
