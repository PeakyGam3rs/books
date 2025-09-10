package com.svgs;

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

    @FXML
    private Button addBookButton;

    @FXML
    private TableColumn<?, ?> authorCol;

    @FXML
    private TextField authorField;

    @FXML
    private TableView<?> bookTable;

    @FXML
    private Button deleteBookButton;

    @FXML
    private ComboBox<?> genreBox;

    @FXML
    private TableColumn<?, ?> genreCol;

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
    private TableColumn<?, ?> ratingCol;

    @FXML
    private ToggleGroup ratingGroup;

    @FXML
    private TableColumn<?, ?> titleCol;

    @FXML
    private TextField titleField;

    @FXML
    private TableColumn<?, ?> yearCol;

    @FXML
    private TextField yearField;

    @FXML
    void handleAddBook(ActionEvent event) {

    }

    @FXML
    void handleDeleteBook(ActionEvent event) {

    }

}
