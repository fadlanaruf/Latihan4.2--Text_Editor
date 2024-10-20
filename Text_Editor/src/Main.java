import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        // Menulis teks
        editor.write("Bagaimana, ");
        editor.show();

        editor.write("jika seseorang hidup lebih lama.");
        editor.show();

        // Menggunakan fungsi undo
        editor.undo();
        System.out.println("Setelah undo:");
        editor.show();

        // Menggunakan fungsi redo
        editor.redo();
        System.out.println("Setelah redo:");
        editor.show();

        // Menggunakan fungsi undo lagi
        editor.undo();
        editor.undo();
        System.out.println("Setelah dua kali undo:");
        editor.show();
    }
}