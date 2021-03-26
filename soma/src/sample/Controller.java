package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    @FXML
    private TextField txtVal1;
    @FXML
    private TextField txtVal2;
    @FXML
    private Button btnCalcular;
    @FXML
    private Label lblSoma;

    @FXML
    private void calcular(ActionEvent event){
        int n1, n2;
        n1 = Integer.parseInt(txtVal1.getText());
        n2 = Integer.parseInt(txtVal2.getText());
        String result = Integer.toString(n1 + n2);
        lblSoma.setText(result);
    }


    @Override
    public void initialize(URL url, ResourceBundle rb){
        // TODO
    }
}
