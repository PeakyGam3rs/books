package com.svgs;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class BookController {
    private ObservableList<Book> books;

    @FXML
    private Button addBookButton;

    @FXML
    private TableColumn<Book, String> authorCol;

    @FXML
    private TextField authorField;

    @FXML
    private TableView<Book> bookTable;

    @FXML
    private Button deleteBookButton;

    @FXML
    private ComboBox<String> genreBox;

    @FXML
    private TableColumn<Book, String> genreCol;

    @FXML
    private RadioButton rating1;

    @FXML
    private RadioButton rating2;

    @FXML
    private RadioButton rating3;

    @FXML
    private RadioButton rating4;

    @FXML
    private RadioButton rating5;

    @FXML
    private TableColumn<Book, String> ratingCol;

    @FXML
    private ToggleGroup ratingGroup;

    @FXML
    private TableColumn<Book, String> titleCol;

    @FXML
    private TextField titleField;

    @FXML
    private TableColumn<Book, String> yearCol;

    @FXML
    private TextField yearField;

    @FXML
    void handleAddBook(ActionEvent event) {
        try {
            books.add(new Book(titleField.getText(), authorField.getText(), yearField.getText(), genreBox.getSelectionModel().getSelectedItem(), ratingGroup.getSelectedToggle().getUserData().toString()));
        } catch (Exception e) {
        }
    }

    @FXML
    void handleDeleteBook(ActionEvent event) {

    }

    @FXML
    void initialize() {
        genreBox.getItems().addAll("Horror", "Sci-Fi", "Fantasy", "Romance", "Nonfiction", "Steamy romance");
        FXCollections.sort(genreBox.getItems());

        books = bookTable.getItems();
        books.add(new Book("Advanced CS for Dummies", "Anthony Tyler", "2025", "Nonfiction", "★★★★★"));
        titleCol.setCellValueFactory(cellData -> cellData.getValue().getTitleProperty());
        authorCol.setCellValueFactory(cellData -> cellData.getValue().getAuthorProperty());
        yearCol.setCellValueFactory(cellData -> cellData.getValue().getYearProperty());
        genreCol.setCellValueFactory(cellData -> cellData.getValue().getGenreProperty());
        ratingCol.setCellValueFactory(cellData -> cellData.getValue().getRatingProperty());
    }


}
