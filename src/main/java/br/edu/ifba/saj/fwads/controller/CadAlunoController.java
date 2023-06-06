package br.edu.ifba.saj.fwads.controller;

import br.edu.ifba.saj.fwads.Biblioteca;
import br.edu.ifba.saj.fwads.model.Aluno;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class CadAlunoController {
    @FXML
    private TextField txCPF;
    @FXML
    private TextField txNome;
    @FXML
    private TextField txMatricula;

    @FXML
    private void salvarAluno() {
        if (txNome.getText().isEmpty() || txMatricula.getText().isEmpty() || txCPF.getText().isEmpty()) {
            new Alert(AlertType.INFORMATION, "Dados obrigatórios não informados").showAndWait();
        } else {
            Aluno novoAluno = new Aluno(txCPF.getText(),
                    txNome.getText(),
                    txMatricula.getText());
            new Alert(AlertType.INFORMATION,
                    "Cadastrando Aluno:" + novoAluno.getNome()).showAndWait();
            Biblioteca.listaUsuarioBiblioteca.add(novoAluno);
            limparTela();
        }

    }

    @FXML
    private void limparTela() {
        txCPF.setText("");
        txNome.setText("");
        txMatricula.setText("");
    }

}
