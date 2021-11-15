import java.nio.file.NotLinkException;

import Receiver.HtmlDocument;

public class Client {
    public static void main(String[] args) {
        var history = new History();
        var document = new HtmlDocument();
        document.setContent("Hello");

        var boldCommand = new BoldCommand(document, history);

        boldCommand.execute();
        System.out.println(document.getContent());

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();

        System.out.println(document.getContent());
    }
}