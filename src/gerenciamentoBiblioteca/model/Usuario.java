package gerenciamentoBiblioteca.model;

import java.util.ArrayList;

public class Usuario {

    private String nomeUsuario;
    private String email;
    private ArrayList livrosEmprestados;

    public Usuario(String nomeUsuario, String email, ArrayList livrosEmprestados){
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.livrosEmprestados = livrosEmprestados;
    }

}
