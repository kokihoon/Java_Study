import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;

public class AppMain extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
        Scene scene = new Scene(root);

        primaryStage.setTitle("AppMain");
        primaryStage.setScene(scene);
        primaryStage.setOnCloseRequest(event-> System.out.println("종료 클릭"));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
