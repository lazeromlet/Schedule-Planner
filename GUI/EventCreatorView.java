package GUI;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class EventCreatorView {
    private static EventPackage dummy;



    public static EventPackage display() {

        Stage addEventStage = new Stage();
        addEventStage.initModality(Modality.APPLICATION_MODAL);

        VBox layout = new VBox();
        layout.setPadding(new Insets(10, 10, 10, 10));

        Text title = new Text("Create Event:");
        title.setFont(Font.font("", FontWeight.NORMAL, 20));

        TextField eName = new TextField();
        eName.setPromptText("Name of Event");

        TextField eContact = new TextField();
        eContact.setPromptText("Event Contact Name");

        DatePicker eDate = new DatePicker();
        eContact.requestFocus();

        Button saveBtn = new Button("Save Event");
        saveBtn.setOnAction(e -> {
            if(eName.getText().equals("")){
                System.out.println("huuue");
                AlertView.display("Event Needs A Name");
                return;
            } else if( eContact.getText().equals("")){
                AlertView.display("Doesn't need a contact, but if you'd humor me..");
                return;
            } else if(eDate.getEditor().getText().equals("")){
                AlertView.display("Event Needs A valid date 'MM/DD,YYY'");
                return;
            } else {
                dummy = new EventPackage();
                dummy.setEventName(eName.getText());
                dummy.setEventContactName(eContact.getText());
                dummy.setEventDate(eDate.getEditor().getText());
            }
            addEventStage.close();
        });

        layout.getChildren().addAll(title, eName, eContact, eDate, saveBtn);

        addEventStage.setScene(new Scene(layout, 250, 250));
        addEventStage.showAndWait();


        return dummy;
    }
}
