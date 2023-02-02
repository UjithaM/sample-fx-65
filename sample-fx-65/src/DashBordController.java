import javafx.beans.property.SimpleObjectProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DashBordController{

    public Label titleLabel;
    public TextField textField;

    public void btnLoginOnAction(ActionEvent actionEvent) {
        titleLabel.setText(textField.getText());
    }

}
