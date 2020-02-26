package GUI;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import java.time.LocalDate;

public class MonthView {

    private LocalDate date = LocalDate.now();
    private String month;
    private Button[][] dayButtons;
    private Button monthBtn;
    private Button addEventBtn;

    public MonthView(){
        month = date.getMonth().toString();
    }

    public void display(String month){
        this.month = month;
        display();
    }

    public void display(){
        YearView yearView = new YearView(date.getYear());
<<<<<<< Updated upstream
=======
        EventCreatorView eventCreatorView = new EventCreatorView();
>>>>>>> Stashed changes

        Stage monthView = new Stage();
        BorderPane layout = new BorderPane();
        GridPane dayBtn = new GridPane();
        HBox topBtn = new HBox();

        monthBtn = new Button(month);
        monthBtn.setOnAction(e -> {
            yearView.display();
            monthView.close();
        });
        addEventBtn = new Button(" + ");
<<<<<<< Updated upstream
        addEventBtn.setOnAction(e -> EventCreatorView.display());
=======
        addEventBtn.setOnAction(e -> eventCreatorView.display());

>>>>>>> Stashed changes
        topBtn.getChildren().addAll(monthBtn, addEventBtn);
        layout.setTop(topBtn);

        dayButtons = new Button[5][7];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                dayButtons[i][j] = new Button("");
                Button day = dayButtons[i][j];

                day.setOnAction(e -> DayView.display());

                day.setPrefSize(50, 50);
                GridPane.setConstraints(day, j, i);
                dayBtn.getChildren().add(day);
            }
        }
        layout.setCenter(dayBtn);

        Scene scene = new Scene(layout);

        monthView.setTitle("Scheduling App");
        monthView.setScene(scene);
        monthView.show();
    }
}
