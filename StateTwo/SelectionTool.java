public class SelectionTool implements Tool {

    @Override
    public void mouseDown() {
        System.out.print("Selection icon\n");
    }

    @Override
    public void mouseUp() {
        System.out.print("Draw a dashed rectangle\n");
    }
}
