package src.application;


import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class Main extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox labelForm = new VBox();
        setLabelForm(labelForm);
        labelForm.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

        VBox optionsForm = new VBox();
        setOptionsForm(optionsForm);
        optionsForm.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

        GridPane root = new GridPane();
        root.add(labelForm, 0, 0, 1, 2);
        root.add(optionsForm, 1, 0, 2, 1);
        createAndShowGUI(primaryStage, root);
    }

    public void setLabelForm(VBox labelForm) {
        Label sortMethodLbl = new Label("Sort method");
        Label arraySizeLbl = new Label("Array Size");
        Label elementsLbl = new Label("Elements");

        labelForm.getChildren().addAll(sortMethodLbl, arraySizeLbl, elementsLbl);
    }

    public void setOptionsForm(VBox optionsForm) {
        ChoiceBox<String> sortMethodCB = new ChoiceBox<String>(FXCollections.observableArrayList(
                "Tree sort", "Not implemented"
        ));
        sortMethodCB.setValue("Tree sort");

        TextField arraySizeTF = new TextField();
        TextField elementsTF = new TextField();

        optionsForm.getChildren().addAll(sortMethodCB, arraySizeTF, elementsTF);
    }


    private void createAndShowGUI(Stage primaryStage, GridPane root) {
        Scene scene = new Scene(root, 900, 450);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Sorter");
        primaryStage.show();
    }
}
