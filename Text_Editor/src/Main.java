public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        // Menulis teks
        editor.write("Halo, ");
        editor.show();

        editor.write("selamat datang di kfc.");
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