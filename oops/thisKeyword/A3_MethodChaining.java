package oops.thisKeyword;

class Printer{
    void printJob(Document doc){
        System.out.println("Printing "+doc.getName());
    }
}

class Document{
    private String name;
    Document(String name){
        this.name = name;
    }
    String getName(){return this.name;}

    void sendToPrinter(){
        Printer printer = new Printer();
        printer.printJob(this);
    }
}

public class A3_MethodChaining {
    public static void main(String[] args) {
        Document doc = new Document("Marksheet");
        doc.sendToPrinter();
    }
}
