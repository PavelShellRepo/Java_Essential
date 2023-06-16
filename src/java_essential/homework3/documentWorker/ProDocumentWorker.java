package java_essential.homework3.documentWorker;

public class ProDocumentWorker extends DocumentWorker{
    public void openDocument() {
        System.out.println("Документ открыт");
    }

    @Override
    public void editDocument() {
        System.out.println("Документ отредактирован");
    }

    @Override
    public void saveDocument() {
        System.out.println("Документ сохранен в старом формате, сохранение в остальных форматах доступно в версии Эксперт");
    }
}
