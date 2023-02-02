/*
    @author DanujaV
    @created 1/30/23 - 4:22 PM   
*/

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginFormController {
    public TextField txtUserName;
    public Label lblTitle;

    public void btnLoginOnAction(ActionEvent actionEvent) {
        String userName = txtUserName.getText();
        lblTitle.setText(userName);
    }
}
