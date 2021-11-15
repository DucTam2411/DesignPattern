public class BrushTool implements Tool {

    @Override
    public void mouseDown() {
        System.out.print("Brush icon\n");
    }

    @Override
    public void mouseUp() {
        System.out.print("Draw a line\n");
    }

}
