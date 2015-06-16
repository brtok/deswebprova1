package inscricao.entity;

import java.util.Date;

/**
 *
 * @author Bruno Tokarski
 */
public class Login {

    private String login = "";
    private Date data;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
}
