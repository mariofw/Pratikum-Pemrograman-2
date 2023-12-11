package com.example.pratikum6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Tabel extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Mario Franca Wijaya");
        TableView tabel = new TableView();
        TableColumn<Mahasiswa, String>kolom1 = new TableColumn<>("ID");
        kolom1.setCellValueFactory(
                new PropertyValueFactory<>("id")); TableColumn<Mahasiswa, String>kolom2 = new
                TableColumn<>("NAMA");
        kolom2.setCellValueFactory(
                new PropertyValueFactory<>("nama")); TableColumn<Mahasiswa, String>kolom3 = new
                TableColumn<>("NIM");
        kolom3.setCellValueFactory(
                new PropertyValueFactory<>("nim"));

        tabel.getColumns().add(kolom1);
        tabel.getColumns().add(kolom2);
        tabel.getColumns().add(kolom3);

        tabel.getItems().add(new Mahasiswa(1, "Ikhsan","2210817210001" ));
        tabel.getItems().add(new Mahasiswa(2, "Zaki","2210817210002" ));
        tabel.getItems().add(new Mahasiswa(3, "Ryan","2210817210003" ));
        tabel.getItems().add(new Mahasiswa(4, "Irfan","2210817210004" ));
        tabel.getItems().add(new Mahasiswa(5, "gemem","2210817210005" ));
        tabel.getItems().add(new Mahasiswa(6, "Abdis","2210817210006" ));
        tabel.getItems().add(new Mahasiswa(7, "Anoy","2210817210007" ));
        tabel.getItems().add(new Mahasiswa(8, "Qoh","2210817210008" ));
        tabel.getItems().add(new Mahasiswa(9, "Mario Franca Wijaya","2210817210009" ));
        tabel.getItems().add(new Mahasiswa(10, "Tiara","2210817210010" ));

        VBox box = new VBox(tabel);
        Scene scene = new Scene(box);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
