package GUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.util.Date;

public class MonthView {

    private final String[] MONTHS = {"January", "February",
            "March", "April", "May", "June", "July",
            "August", "September", "October", "November",
            "December"};

    private Button[][] dayButtons;
    private Button month;
    private Button addEventBtn;
    private EventPackage ePackage;

    public void display(){
        Stage monthView = new Stage();
        BorderPane layout = new BorderPane();
        GridPane dayBtn = new GridPane();

        month = new Button(MONTHS[new Date().getMonth()]);
        month.setOnAction(e -> yearView.display("2020"));
        layout.setTop(month);

        addEventBtn = new Button("+");
        addEventBtn.setOnAction(e -> {
            ePackage = EventCreatorView.display();
            System.out.println(ePackage.getEventName()+ "\n" + ePackage.getEventContactName() +
                    "\n" + ePackage.getEventDate());
        });
        layout.setTop(addEventBtn);

        dayButtons = new Button[5][7];

        int count = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                dayButtons[i][j] = new Button("" + count);
                Button day = dayButtons[i][j];

                day.setOnAction(e -> DayView.display());

                day.setPrefSize(50, 50);
                GridPane.setConstraints(day, j, i);
                dayBtn.getChildren().add(day);

                count++;
            }
        }
        layout.setCenter(dayBtn);

        Scene scene = new Scene(layout);

        monthView.setTitle("Scheduling App");
        monthView.setScene(scene);
        monthView.show();
    }
}
