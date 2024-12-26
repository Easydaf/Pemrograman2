package SoalPrak6;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class GUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Daftar Mahasiswa");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);

        Mahasiswa[] mahasiswaList = {
            new Mahasiswa("2023001", "Ronaldo", " "),
            new Mahasiswa("2023002", "Mudryk", " "),
            new Mahasiswa("2023003", "Palmer"," "),
            new Mahasiswa("2023004", "Sanches"," "),
            new Mahasiswa("2023005", "Gullit"," "),
            new Mahasiswa("2023006", "Marselino"," "),
            new Mahasiswa("2023007", "Sancho"," "),
            new Mahasiswa("2023008", "Griezman"," "),
            new Mahasiswa("2023009", "Antony"," "),
            new Mahasiswa("2023010", "Oblak"," ")
        };

        String[] kolom = {"NIM", "Nama", " "};
        String[][] data = new String[mahasiswaList.length][2];
        for (int i = 0; i < mahasiswaList.length; i++) {
            data[i][0] = mahasiswaList[i].getNim();
            data[i][1] = mahasiswaList[i].getNama();
        }

        DefaultTableModel model = new DefaultTableModel(data, kolom);

        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        frame.add(scrollPane);

        frame.setVisible(true);
    }
}