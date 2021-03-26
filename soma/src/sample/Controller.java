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
    private TextField txtResultado;
    @FXML
    private Button btn0;
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn6;
    @FXML
    private Button btn7;
    @FXML
    private Button btn8;
    @FXML
    private Button btn9;
    @FXML
    private Button btnSoma;
    @FXML
    private Button btnSubtrair;
    @FXML
    private Button btnDividir;
    @FXML
    private Button btnMultiplicar;
    @FXML
    private Button btnCalcular;

    int numero1 = 11;
    int numero2 = 12;
    String operador;

    @FXML
    private void calcular(ActionEvent event){
        int n1, n2;
        int result = 0;
        n1 = numero1;
        n2 = numero2;
        if(operador == "+") result = n1 + n2;
        else if(operador == "-") result = n1 - n2;
        else if(operador == "*") result = n1 * n2;
        else if(operador == "%") result = n1 / n2;
        txtResultado.setText(Integer.toString(result));
        operador = null;
        numero1 = 11;
        numero2 = 12;
    }

    @FXML
    private void clear(ActionEvent event){
        txtResultado.setText("");
    }

    @FXML
    private  void opSomar(ActionEvent event){
        operador = "+";
        String result = txtResultado.getText() +  "+ ";
        txtResultado.setText(result);
    }

    @FXML
    private  void opSubtrair(ActionEvent event){
        operador = "-";
        String result = txtResultado.getText() +  "- ";
        txtResultado.setText(result);
    }

    @FXML
    private  void opDividir(ActionEvent event){
        operador = "%";
        String result = txtResultado.getText() +  "% ";
        txtResultado.setText(result);
    }

    @FXML
    private  void opMultiplicar(ActionEvent event){
        operador = "*";
        String result = txtResultado.getText() +  "* ";
        txtResultado.setText(result);
    }

    @FXML
    private void num0(ActionEvent event){
        if(numero1 == 11) numero1 = 0 ;
        else if (numero2 == 12)  numero2 = 0;
        txtResultado.setText(btn0.getText());
    }

    @FXML
    private void num1(ActionEvent event){
        if(numero1 == 11) numero1 = 1 ;
        else if (numero2 == 12)  numero2 = 1;
        String result = txtResultado.getText() +  btn1.getText();
        txtResultado.setText(result);
    }

    @FXML
    private void num2(ActionEvent event){
        if(numero1 == 11) numero1 = 2 ;
        else if (numero2 == 12)  numero2 = 2;
        String result = txtResultado.getText() +  btn1.getText();
        txtResultado.setText(result);
    }

    @FXML
    private void num3(ActionEvent event){
        if(numero1 == 11) numero1 = 3 ;
        else if (numero2 == 12)  numero2 = 3;
        String result = txtResultado.getText() +  btn3.getText();
        txtResultado.setText(result);
    }


    @FXML
    private void num4(ActionEvent event){
        if(numero1 == 11) numero1 = 4 ;
        else if (numero2 == 12)  numero2 = 4;
        String result = txtResultado.getText() +  btn4.getText();
        txtResultado.setText(result);
    }

    @FXML
    private void num5(ActionEvent event){
        if(numero1 == 11) numero1 = 5 ;
        else if (numero2 == 12)  numero2 = 5;
        String result = txtResultado.getText() +  btn5.getText();
        txtResultado.setText(result);
    }

    @FXML
    private void num6(ActionEvent event){
        if(numero1 == 11) numero1 = 6 ;
        else if (numero2 == 12)  numero2 = 6;
        String result = txtResultado.getText() +  btn6.getText();
        txtResultado.setText(result);
    }

    @FXML
    private void num7(ActionEvent event){
        if(numero1 == 11) numero1 = 7 ;
        else if (numero2 == 12)  numero2 = 7;
        String result = txtResultado.getText() +  btn7.getText();
        txtResultado.setText(result);
    }

    @FXML
    private void num8(ActionEvent event){
        if(numero1 == 11) numero1 = 8 ;
        else if (numero2 == 12)  numero2 = 8;
        String result = txtResultado.getText() +  btn8.getText();
        txtResultado.setText(result);
    }

    @FXML
    private void num9(ActionEvent event){
        if(numero1 == 11) numero1 = 9 ;
        else if (numero2 == 12)  numero2 = 9;
        String result = txtResultado.getText() +  btn9.getText();
        txtResultado.setText(result);
    }



    @Override
    public void initialize(URL url, ResourceBundle rb){
        // TODO
    }
}
