package View;

import java.net.URL;
import java.util.ResourceBundle;

import Beans.Jogador;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class InterfacePrincipal {

    @FXML
    private ResourceBundle resources;
    
    @FXML
    private TableView<Jogador> jogadores;

    @FXML
    private TableColumn<Jogador, String> nome;

    @FXML
    private TableColumn<Jogador, Integer> vida;

    @FXML
    private TableColumn<Jogador, Integer> dano;

    @FXML
    private TableColumn<Jogador, Integer> precisao;

    @FXML
    private TableColumn<Jogador, Integer> carisma;

    @FXML
    private TableColumn<Jogador, Integer> intel;

    @FXML
    private TableColumn<Jogador, Integer> furti;

    @FXML
    private URL location;

    @FXML
    private Button edit;

    @FXML
    private Button add;

    @FXML
    private Button delete;

    @FXML
    private Label labrlNome;

    @FXML
    private Label labelfutividade;

    @FXML
    private Label labelIntel;

    @FXML
    private Label labelCArisma;

    @FXML
    private Label labelVida;

    @FXML
    private Label labelDano;

    @FXML
    private Label labelPrecisao;

    @FXML
    private Button edit1;

    @FXML
    private Button add1;

    @FXML
    private Button delete1;

    @FXML
    private Label labrlNome1;

    @FXML
    private Label labelfutividade1;

    @FXML
    private Label labelIntel1;

    @FXML
    private Label labelCArisma1;

    @FXML
    private Label labelVida1;

    @FXML
    private Label labelDano1;

    @FXML
    private Label labelPrecisao1;

    @FXML
    void addaction(ActionEvent event) {

    }

    @FXML
    void deleteAction(ActionEvent event) {

    }

    @FXML
    void editAction(ActionEvent event) {

    }


    @FXML
    void initialize() {
        assert jogadores != null : "fx:id=\"Jogadores\" was not injected: check your FXML file 'interfacePrincipal.fxml'.";
        assert nome != null : "fx:id=\"nome\" was not injected: check your FXML file 'interfacePrincipal.fxml'.";
        assert vida != null : "fx:id=\"vida\" was not injected: check your FXML file 'interfacePrincipal.fxml'.";
        assert dano != null : "fx:id=\"dano\" was not injected: check your FXML file 'interfacePrincipal.fxml'.";
        assert precisao != null : "fx:id=\"precisao\" was not injected: check your FXML file 'interfacePrincipal.fxml'.";
        assert carisma != null : "fx:id=\"carisma\" was not injected: check your FXML file 'interfacePrincipal.fxml'.";
        assert intel != null : "fx:id=\"intel\" was not injected: check your FXML file 'interfacePrincipal.fxml'.";
        assert furti != null : "fx:id=\"furti\" was not injected: check your FXML file 'interfacePrincipal.fxml'.";
        assert edit != null : "fx:id=\"edit\" was not injected: check your FXML file 'Untitled'.";
        assert add != null : "fx:id=\"add\" was not injected: check your FXML file 'Untitled'.";
        assert delete != null : "fx:id=\"delete\" was not injected: check your FXML file 'Untitled'.";
        assert labrlNome != null : "fx:id=\"labrlNome\" was not injected: check your FXML file 'Untitled'.";
        assert labelfutividade != null : "fx:id=\"labelfutividade\" was not injected: check your FXML file 'Untitled'.";
        assert labelIntel != null : "fx:id=\"labelIntel\" was not injected: check your FXML file 'Untitled'.";
        assert labelCArisma != null : "fx:id=\"labelCArisma\" was not injected: check your FXML file 'Untitled'.";
        assert labelVida != null : "fx:id=\"labelVida\" was not injected: check your FXML file 'Untitled'.";
        assert labelDano != null : "fx:id=\"labelDano\" was not injected: check your FXML file 'Untitled'.";
        assert labelPrecisao != null : "fx:id=\"labelPrecisao\" was not injected: check your FXML file 'Untitled'.";
        assert edit1 != null : "fx:id=\"edit1\" was not injected: check your FXML file 'Untitled'.";
        assert add1 != null : "fx:id=\"add1\" was not injected: check your FXML file 'Untitled'.";
        assert delete1 != null : "fx:id=\"delete1\" was not injected: check your FXML file 'Untitled'.";
        assert labrlNome1 != null : "fx:id=\"labrlNome1\" was not injected: check your FXML file 'Untitled'.";
        assert labelfutividade1 != null : "fx:id=\"labelfutividade1\" was not injected: check your FXML file 'Untitled'.";
        assert labelIntel1 != null : "fx:id=\"labelIntel1\" was not injected: check your FXML file 'Untitled'.";
        assert labelCArisma1 != null : "fx:id=\"labelCArisma1\" was not injected: check your FXML file 'Untitled'.";
        assert labelVida1 != null : "fx:id=\"labelVida1\" was not injected: check your FXML file 'Untitled'.";
        assert labelDano1 != null : "fx:id=\"labelDano1\" was not injected: check your FXML file 'Untitled'.";
        assert labelPrecisao1 != null : "fx:id=\"labelPrecisao1\" was not injected: check your FXML file 'Untitled'.";

    }
}
