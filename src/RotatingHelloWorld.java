import javafx.animation.Animation;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

public class RotatingHelloWorld extends Application {

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root, 400, 400);

        Text helloText = new Text("Hello World");
        helloText.setFont(Font.font("Arial", 50));
        helloText.setX(100);
        helloText.setY(200);

        RotateTransition rotateTransition = new RotateTransition(Duration.seconds(5), helloText);
        rotateTransition.setByAngle(360);
        rotateTransition.setCycleCount(Animation.INDEFINITE);
        rotateTransition.setAxis(Rotate.Y_AXIS);
        rotateTransition.play();

        root.getChildren().add(helloText);

        primaryStage.setTitle("Rotating");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


