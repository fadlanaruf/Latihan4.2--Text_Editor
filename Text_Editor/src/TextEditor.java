import java.util.Stack;

public class TextEditor {
    private StringBuilder text; // Menyimpan teks saat ini
    private Stack<String> undoStack; // Menyimpan riwayat untuk fungsi undo
    private Stack<String> redoStack; // Menyimpan riwayat untuk fungsi redo

    public TextEditor() {
        text = new StringBuilder();
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }

    // Fungsi untuk menampilkan teks
    public void show() {
        System.out.println("Teks saat ini: " + text.toString());
    }

    // Fungsi untuk menulis teks
    public void write(String newText) {
        undoStack.push(text.toString()); // Simpan keadaan saat ini ke undo stack
        text.append(newText); // Tambahkan teks baru
        redoStack.clear(); // Kosongkan redo stack
    }

    // Fungsi untuk membatalkan tindakan terakhir (undo)
    public void undo() {
        if (!undoStack.isEmpty()) {
            redoStack.push(text.toString()); // Simpan keadaan saat ini ke redo stack
            text = new StringBuilder(undoStack.pop()); // Kembalikan keadaan sebelumnya
        } else {
            System.out.println("Tidak ada yang bisa dibatalkan.");
        }
    }

    // Fungsi untuk mengulangi tindakan yang dibatalkan (redo)
    public void redo() {
        if (!redoStack.isEmpty()) {
            undoStack.push(text.toString()); // Simpan keadaan saat ini ke undo stack
            text = new StringBuilder(redoStack.pop()); // Kembalikan keadaan yang lebih baru
        } else {
            System.out.println("Tidak ada yang bisa diulang.");
        }
    }
}