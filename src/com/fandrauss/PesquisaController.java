/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fandrauss;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Fernando
 */
public class PesquisaController implements Initializable {

    @FXML
    private TableView<Produto> tblProdutos;

    @FXML
    private TableColumn<Produto,String > colCodigo;

    @FXML
    private TableColumn<Produto, String> colDescricao;

    @FXML
    private TableColumn<Produto, Double> colValor;
    
    private SelectListner<Produto> onSelectProduto;

    public void setOnSelectProduto(SelectListner<Produto> onSelectProduto) {
        this.onSelectProduto = onSelectProduto;
    }
    
    @FXML
    void selecionar(ActionEvent event) {
        onSelectProduto.onSelect(tblProdutos.getSelectionModel().getSelectedItem());
        
        ((Stage)tblProdutos.getScene().getWindow()).close();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        
        ObservableList<Produto> lista = FXCollections.observableArrayList(
        
                new Produto("001", "Arroz", 10.0),
                new Produto("002", "Feijão", 3.0),
                new Produto("003", "Macarrão", 2.0),
                new Produto("004", "Banana", 4.50),
                new Produto("005", "Tomate", 4.0),
                new Produto("006", "Extrato de Tomate", 1.80),
                new Produto("007", "Trigo", 5.0)
        );
        
        colCodigo.setCellValueFactory(new PropertyValueFactory("codigo"));
        colDescricao.setCellValueFactory(new PropertyValueFactory("descricao"));
        colValor.setCellValueFactory(new PropertyValueFactory("valor"));
        
        tblProdutos.setItems(lista);
        
        
    }

}
