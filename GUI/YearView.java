package GUI;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.Date;

class yearView{

    public static void display(String year) {
        Date date = new Date();
        int currentYear = date.getYear() + 1900;
        System.out.println("" + currentYear);
        Button[] yearButtons = new Button[30];
        Stage yearView = new Stage();
        yearView.setTitle(year);

        GridPane gPane = new GridPane();

        int rowCount = 0;
        for(int i = - 15; i < 15; i++){
            int index = i + 15;
            if(i % 5 == 0){
                rowCount++;
            }
            yearButtons[index] =  new Button("" + (currentYear + i));
            yearButtons[index].setPrefSize(100, 40);
            GridPane.setConstraints(yearButtons[index], rowCount, Math.abs(i % 5));
            gPane.getChildren().add(yearButtons[index]);
        }
        yearView.setScene(new Scene(gPane));
        yearView.show();
    }

}

