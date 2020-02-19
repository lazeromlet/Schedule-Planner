package GUI;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.time.LocalDate;

public class DayView{

    public static void display() {
        Stage dayView = new Stage();
        dayView.setTitle(LocalDate.now().toString());

        Label dayLabel = new Label("" + LocalDate.now().getDayOfMonth());
        GridPane gPane = new GridPane();
        gPane.getChildren().add(dayLabel);

        dayView.setScene(new Scene(gPane, 200, 200));
        dayView.show();
    }

}

