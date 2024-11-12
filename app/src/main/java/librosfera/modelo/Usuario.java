
public class Usuario {

    // ATRIBUTOS //
    public String idUser;
    public String fullNameUser;
    public String emailUser;
    public String passwordUser;

    // CONSTRUCTORES //
    public Usuario() {
    }

    public Usuario(String idUser, String fullNameUser, String emailUser, String passwordUser) {
        this.idUser = idUser;
        this.fullNameUser = fullNameUser;
        this.emailUser = emailUser;
        this.passwordUser = passwordUser;
    }

    // GETTER //
    public String getIdUser() {
        return idUser;
    }

    public String getFullNameUser() {
        return fullNameUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    // SETTER //
    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public void setFullNameUser(String fullNameUser) {
        this.fullNameUser = fullNameUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }

}
