package org.lld.design_patterns.behavioural.state;

public class Document {
    DocumentState documentState;

    public Document() {
        documentState = new DraftDocumentState();
    }
}

interface DocumentState {
    void publish(Document document);
}

class DraftDocumentState implements DocumentState {

    public DraftDocumentState() {
        System.out.println("Document in DRAFT state.");
    }

    @Override
    public void publish(Document document) {
        document.documentState = new ModerateDocumentState();
    }
}

class ModerateDocumentState implements DocumentState {

    public ModerateDocumentState() {
        System.out.println("Document in Moderate state.");
    }

    @Override
    public void publish(Document document) {
        document.documentState = new PublishedDocumentState();
    }
}

class PublishedDocumentState implements DocumentState {

    public PublishedDocumentState() {
        System.out.println("Document in Publish state");
    }

    @Override
    public void publish(Document document) {
        System.out.println("Document already in publish state");
    }
}

class Main {
    public static void main(String[] args) {
        Document document = new Document();
        document.documentState.publish(document);
        document.documentState.publish(document);
        document.documentState.publish(document);
    }
}

