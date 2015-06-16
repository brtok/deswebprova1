/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inscricao.faces.mngbeans;

import inscricao.entity.Login;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import utfpr.faces.support.PageBean;

/**
 *
 * @author Bruno
 */
@ManagedBean
@ApplicationScoped
public class LoginBean extends PageBean{

    private String login = "";
    private String senha = "";
    private boolean administrador = false;
    private String resultado = "";
    private Date horario;

    public String getResult() {
        return resultado;
    }

    public void setResult(String result) {
        this.resultado = result;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    public Date getHora() {
        return horario;
    }

    public String getStringHora() {
        DateFormat formato = new SimpleDateFormat("HH:mm:ss");
        String res = formato.format(horario);
        return res;
    }
    
    public String acaoLogin() {
        if (login.equals(senha)) {
            resultado = "";
            horario = new Date();
            Login l = new Login();
            l.setData(new Date());
            l.setLogin(login);
            SalvarBean bean = (SalvarBean) getBean("salvarBean");
            bean.adicionaLogin(l);
            if (administrador){
                return "admin";
            }
            return "cadastro";
        }
        resultado = "Acesso negado";
        return null;
    }
}