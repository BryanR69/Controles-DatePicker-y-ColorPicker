import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class DatePickerColorPickerApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label dateLabel = new Label("Selecciona una fecha:");
        DatePicker datePicker = new DatePicker();

        Label colorLabel = new Label("Selecciona un color:");
        ColorPicker colorPicker = new ColorPicker();

        Button confirmButton = new Button("Confirmar Selección");

        Text resultText = new Text();

        confirmButton.setOnAction(e -> {
            String selectedDate = datePicker.getValue() != null ? datePicker.getValue().toString() : "No se ha seleccionado una fecha";
            Color selectedColor = colorPicker.getValue();

            System.out.println("Fecha seleccionada: " + selectedDate);
            System.out.println("Color seleccionado: " + selectedColor);

            resultText.setText("Fecha seleccionada: " + selectedDate + "\nColor seleccionado: " + selectedColor);
            resultText.setFill(selectedColor);
        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(dateLabel, datePicker, colorLabel, colorPicker, confirmButton, resultText);

        Scene scene = new Scene(layout, 400, 300);
        primaryStage.setTitle("Selector de Fecha y Color");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
