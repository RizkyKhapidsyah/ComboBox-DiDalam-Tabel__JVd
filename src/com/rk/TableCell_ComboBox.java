package com.rk;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class TableCell_ComboBox extends JFrame {

    JTable table;
    JScrollPane scroll;
    DefaultTableModel model;
    String header[] = {"Nama", "Jurusan", "Angkatan", "Lulus"};
    Object data[][] = {
            {"Rizky Khapidsyah", "Sistem Komputer", "2009", null},
            {"Muhammad Riyan", "Sistem Komputer", "2009", null},
            {"Nazar Ilham", "Sistem Komputer", "2009", null},
            {"Zulfikar Baharuddin", "Sistem Komputer", "2009", null},
            {"Kebetulan Manusia", "Sistem Komputer", "2009", null}
    };

    public TableCell_ComboBox() {
        super("ComboBox Di Dalam Tabel");
        Inisialisasi_Komponen();
    }

    private void Inisialisasi_Komponen() {
        aturTabel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    private void aturTabel() {
        model = new DefaultTableModel(data, header);
        table = new JTable();

        table.setModel(model);

        JComboBox comboBox = new JComboBox();

        comboBox.addItem("Ya");
        comboBox.addItem("Tidak");
        table.getColumnModel().getColumn(3).setCellEditor(new DefaultCellEditor(comboBox));

        scroll = new JScrollPane(table);
        scroll.setPreferredSize(new Dimension(400, 200));
        add(scroll, BorderLayout.CENTER);
    }
}
