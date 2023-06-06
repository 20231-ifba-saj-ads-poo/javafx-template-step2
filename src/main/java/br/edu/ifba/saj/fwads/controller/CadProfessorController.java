package br.edu.ifba.saj.fwads.controller;

import br.edu.ifba.saj.fwads.Biblioteca;
import br.edu.ifba.saj.fwads.model.Autor;
import br.edu.ifba.saj.fwads.model.Professor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class CadProfessorController {
    @FXML
    private TextField txCPF;
    @FXML
    private TextField txSIAPE;
    @FXML
    private TextField txNome;

    @FXML
    private void salvarProfessor() {
        if (txNome.getText().isEmpty() || txSIAPE.getText().isEmpty() || txCPF.getText().isEmpty()) {
            new Alert(AlertType.INFORMATION, "Dados obrigatórios não informados").showAndWait();
        } else {
            Professor novoProfessor = new Professor(txCPF.getText(),
                    txNome.getText(),
                    txSIAPE.getText());
            new Alert(AlertType.INFORMATION,
                    "Cadastrando Professor:" + novoProfessor.getNome()).showAndWait();
            Biblioteca.listaUsuarioBiblioteca.add(novoProfessor);
            limparTela();
        }

    }

    @FXML
    private void limparTela() {
        txSIAPE.setText("");
        txNome.setText("");
        txCPF.setText("");
    }

}
