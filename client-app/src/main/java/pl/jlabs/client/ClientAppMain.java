package pl.jlabs.client;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ClientAppMain extends Application {

    @Override
    public void start(Stage primaryStage) {
//        FXMLLoader fxmlLoader = new FXMLLoader();
//        fxmlLoader.setLocation(getClass().getResource("/sample.fxml"));
//        Parent root = fxmlLoader.load();

        primaryStage.setTitle("Hello World!");
        Button btn = new Button();
        btn.setText("Useless button");
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
