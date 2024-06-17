package homework_37.archive.tests;

import homework_37.archive.dao.Archive;
import homework_37.archive.dao.ArchiveImpl;
import homework_37.archive.model.Document;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArchiveImplTest {
    Archive archive;
    Document[] doc;
    LocalDateTime now = LocalDateTime.now();

    @BeforeEach
    void setUp() {
        archive = new ArchiveImpl(7);
        doc = new Document[6];
        doc[0] = new Document(1, 1, "title1", "url1", now.minusDays(2)); //newest document
        doc[1] = new Document(1, 2, "title2", "url2", now.minusDays(3));
        doc[2] = new Document(1, 3, "title3", "url3", now.minusDays(5));
        doc[3] = new Document(2, 1, "title1", "url4", now.minusDays(7));
        doc[4] = new Document(2, 2, "title2", "url5", now.minusDays(7));
        doc[5] = new Document(2, 3, "title3", "url6", now.minusDays(7)); //oldest document

        for (Document d : doc) {
            archive.addDocument(d);
        }
    }

    @Test
    void addDocument() {
        assertFalse(archive.addDocument(null)); //we can´t add null
        assertFalse(archive.addDocument(doc [2]));//we do not want to add the identical document
        Document doc1 = new Document(1, 4, "new added", "url7", now.minusDays(1));
        //we have created and added anew document
        assertTrue(archive.addDocument(doc1)); //yes, it is true that the document has been added!
        assertEquals(7, archive.size());// 7 is the defined capacity-> we have added 1 doc -> 6+1=7.
        Document doc2 = new Document(1, 5, "add me", "url8", now.minusDays(1));
        assertFalse(archive.addDocument(doc2));//the defined capacity is 7, doc2 is the eight document, oops...

    }

    @Test
    void updateDocument() {
        Document updateDoc = new Document(1,1,"new title", "new url", now.minusDays(1));
        archive.addDocument(updateDoc);//add the updated document
        // now we try to update a document with id the folderID and DocumentId that exist
        assertTrue(archive.updateDocument(1,1, "new title", "new url")); // we changed his title1 to new title, url1 to new url.
        Document existedDoc = archive.getDocumentFromArchive(1,1);
        assertEquals("new title", existedDoc.getTitle());
        assertEquals("new url", existedDoc.getUrl());

    }

    @Test
    void getDocumentFromArchive() {
        Document nonExistent = archive.getDocumentFromArchive(9,1);
        assertNull(nonExistent);
        Document doc1 = archive.getDocumentFromArchive(3,1);
        assertNotNull(doc1); // Document should exist
        assertEquals("title3", doc1.getTitle()); // please see which document is under doc[2] in our setUp method
        assertEquals(doc[0], archive.getDocumentFromArchive(1,1));
        assertNull(archive.getDocumentFromArchive(9,9));

    }

    @Test
    void getAllDocumentsFromFolder() {
        Document expected[] = {doc[0], doc[1], doc[2]};
        Document actual[] = archive.getAllDocumentsFromFolder(1);
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
        //One more WAY of TESTING
        /*Document[] folder1 = archive.getAllDocumentsFromFolder(1);
        assertEquals(3, folder1.length); //Folder 1 should have 3 documents
        //Sort the documents for comparison
        Arrays.sort(folder1, (d1,d2) -> Integer.compare(d1.getDocumentId(), d2.getDocumentId()));
        //Expected documents in folder1
        Document[] expectedFolder1 = {doc[0], doc[1], doc[2]};
        Arrays.sort(expectedFolder1, (d1,d2) -> Integer.compare(d1.getDocumentId(), d2.getDocumentId()));
        assertArrayEquals(expectedFolder1, folder1);*/
    }

    @Test
    void getDocumentBetweenDates() {
        LocalDate ld = now.toLocalDate();
        // we call the archive method to retrieve documents between specified dates
        Document[] actual = archive.getDocumentBetweenDates(ld.minusDays(6), ld.minusDays(1));
        //date range from 6 days ago to 1 day ago, this retrieves(extracts, gets) docs created within this date range.
        Arrays.sort(actual);
        //Sorting ensures that the order of elements in actual does not affect the comparison with expected. The sorting here
        // uses the natural ordering of Document objects, which typically involves comparing document IDs
        // or another comparable attribute/criterion.
        Document[] expected = {doc[0], doc[1], doc[2]};
    }

    @Test
    void size() {
        assertEquals(6, archive.size());
    }
}