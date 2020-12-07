package visualizacao;

import modelo.usuario.Usuario;
import visualizacao.exception.CadastrarUsuarioException;
import visualizacao.exception.UsuariosCadastradosException;
import visualizacao.exception.ValidarCPFException;
import visualizacao.exception.ValidarSenhaException;

import java.util.ArrayList;
import java.util.List;

public class MenuUsuario {
    private List<Usuario> usuariosCadastrados;
    private Usuario usuarioLogado;

    public MenuUsuario() {
        this.usuariosCadastrados = new ArrayList<>();
        this.usuarioLogado = null;
    }

    public void cadastrar(Usuario usuario) throws CadastrarUsuarioException {
        for(Usuario usuarioCadastrado : usuariosCadastrados) {
            if(usuarioCadastrado.getCpf().equals(usuario.getCpf())) {
                throw new CadastrarUsuarioException();
            }
        }
        this.usuariosCadastrados.add(usuario);
    }

    public void logar(String cpf, String senha) throws UsuariosCadastradosException {
        if(this.usuariosCadastrados.isEmpty()) {
            throw new UsuariosCadastradosException();
        }

        try {

            Usuario usuarioLogar = validarCPF(cpf);
            validarSenha(usuarioLogar, senha);

        } catch(ValidarCPFException | ValidarSenhaException validarLoginException) {
            System.out.println(validarLoginException.getMessage());

        }

    }

    private Usuario validarCPF(String cpf) throws ValidarCPFException {
        for(Usuario usuario : this.usuariosCadastrados) {
            if(usuario.getCpf().equals(cpf)) {
                return usuario;
            }
        }

        throw new ValidarCPFException();
    }

    private void validarSenha(Usuario usuario, String senha) throws ValidarSenhaException {
        if(usuario.getSenha().equals(senha)) {
            this.usuarioLogado = usuario;
            return;
        }

        throw new ValidarSenhaException();
    }

    public void deslogar() {
        this.usuarioLogado = null;
    }

    public Usuario getUsuarioLogado() {
        return this.usuarioLogado;
    }
}
