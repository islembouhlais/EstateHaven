package project.app.demo.user;

public class Session {

   private int session_id;
   private String role;

    public String getRole() {
        return role;
    }

    public int getSession_id() {
        return session_id;
    }

    public void setSession_id(int session_id) {
        this.session_id = session_id;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
