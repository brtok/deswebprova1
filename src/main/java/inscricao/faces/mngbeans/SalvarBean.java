/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inscricao.faces.mngbeans;

import inscricao.entity.Login;
import java.util.ArrayList;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import utfpr.faces.support.PageBean;

/**
 *
 * @author Bruno
 */
@ManagedBean
@ApplicationScoped
public class SalvarBean extends PageBean {

    private ArrayList<Login> listaLogin = new ArrayList<>();

    public ArrayList<Login> getListaLogin() {
        return listaLogin;
    }

    public void setListaLogin(ArrayList<Login> listaLogin) {
        this.listaLogin = listaLogin;
    }
    
    public void adicionaLogin(Login login) {
        listaLogin.add(login);
    }
    
}
