import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();


        editor.write("Bagaimana, ");
        editor.show();

        editor.write("jika seseorang hidup lebih lama.");
        editor.show();


        editor.undo();
        System.out.println("Setelah undo:");
        editor.show();


        editor.redo();
        System.out.println("Setelah redo:");
        editor.show();


        editor.undo();
        editor.undo();
        System.out.println("Setelah dua kali undo:");
        editor.show();
    }
}