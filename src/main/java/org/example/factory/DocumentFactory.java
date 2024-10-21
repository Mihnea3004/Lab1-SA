package org.example.factory;

public class DocumentFactory {

    // TODO: Implement this method to return the correct type of document
    public static Document createDocument(String type) {
        switch (type) {
            case "PDF":
                return new PDF();
            case "Word":
                return new Word();
            case "HTML":
                return new HTML();
            default:
                throw new IllegalArgumentException("Unknown document type: " + type);
        }
    }
}
