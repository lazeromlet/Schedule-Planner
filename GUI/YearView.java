package GUI;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.util.Date;

/**
 * The View which displays all of the months for the user to select from.
 */
public class YearView{

    private int year;
    /**
     * String to hol
     */
    private final static String[] MONTHS = {"January", "February",
            "March", "April", "May", "June", "July",
            "August", "September", "October", "November",
            "December"};

    private static int monthValue;
    /**
     * @param year
     */

    public YearView(int year){
        this.year = year;
    }
    public void display() {

        MonthView monthView = new MonthView();
        GridPane layout = new GridPane();
        Stage yearView = new Stage();

        for(int i = 0; i < 12; i++){
            String month = MONTHS[i];
            Button monthBtn = new Button(month);
            monthBtn.setPrefSize(150, 50);
            monthBtn.setOnAction(e -> {
                monthView.display(month);
                yearView.close();
            });
            GridPane.setConstraints(monthBtn,(i % 3), (i / 3));
            layout.getChildren().add(monthBtn);
        }

        yearView.setTitle("" + year);
        yearView.setScene(new Scene(layout));
        yearView.show();

    }

}
