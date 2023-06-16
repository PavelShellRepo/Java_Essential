package java_essential.homework3.documentWorker;

public class ExpertDocumentWorker extends ProDocumentWorker {
    @Override
    public void saveDocument() {
        System.out.println("Документ сохранен в новом формате");
    }
}
