package com.fandrauss;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author Fernando
 */
public class MainController implements Initializable {

    @FXML
    private TextField tfCodigo;

    @FXML
    private TextField tfDescricao;

    @FXML
    private TextField tfValor;

    @FXML
    private void pesquisar() {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/fandrauss/pesquisa.fxml"));

            Parent root = loader.load();

            PesquisaController controller = loader.getController();

            controller.setOnSelectProduto((produto) -> {
                tfCodigo.setText(produto.getCodigo());
                tfDescricao.setText(produto.getDescricao());
                tfValor.setText(produto.getValor().toString());
            });

            Scene scene = new Scene(root);

            Stage stage = new Stage(StageStyle.UTILITY);
            stage.initOwner(tfValor.getScene().getWindow());
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle("Pesquisa");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {

        }
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
