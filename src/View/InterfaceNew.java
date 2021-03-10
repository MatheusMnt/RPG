package View;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class InterfaceNew {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtnome;

    @FXML
    private TextField txtvid;

    @FXML
    private TextField txtprec;

    @FXML
    private TextField textcarisma;

    @FXML
    private TextField txtintel;

    @FXML
    private TextField txtfurt;

    @FXML
    private Button btOK;

    @FXML
    private Button btCancel;

    @FXML
    private TextField txtquant;

    @FXML
    void initialize() {
        assert txtnome != null : "fx:id=\"txtnome\" was not injected: check your FXML file 'InterfaceNew.fxml'.";
        assert txtvid != null : "fx:id=\"txtvid\" was not injected: check your FXML file 'InterfaceNew.fxml'.";
        assert txtprec != null : "fx:id=\"txtprec\" was not injected: check your FXML file 'InterfaceNew.fxml'.";
        assert textcarisma != null : "fx:id=\"textcarisma\" was not injected: check your FXML file 'InterfaceNew.fxml'.";
        assert txtintel != null : "fx:id=\"txtintel\" was not injected: check your FXML file 'InterfaceNew.fxml'.";
        assert txtfurt != null : "fx:id=\"txtfurt\" was not injected: check your FXML file 'InterfaceNew.fxml'.";
        assert btOK != null : "fx:id=\"btOK\" was not injected: check your FXML file 'InterfaceNew.fxml'.";
        assert btCancel != null : "fx:id=\"btCancel\" was not injected: check your FXML file 'InterfaceNew.fxml'.";
        assert txtquant != null : "fx:id=\"txtquant\" was not injected: check your FXML file 'InterfaceNew.fxml'.";

    }
}
