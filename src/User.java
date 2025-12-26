import java.util.*;


public class User {

    private String userName;
    private String password;
    private boolean active;


    User(String userName, String password, boolean active) {
        this.userName = userName;
        this.password = password;
        this.active = active;
    }



    public void setUserName(String newUsername) {
        userName = newUsername;

        if(newUsername  != null && !newUsername.isEmpty()){
            userName = newUsername;

        }
    }


    public void setPassword(String newPassword) {

        if(newPassword != null && newPassword.length() >= 8){
            password = newPassword;
            System.out.println("Password Successfully Changed!");
        }
    }


    public String getUserName() {
      return userName;
    }



    public void activateAcc(){
        if(active){
            System.out.println("Account is already active!");
        }else{
            active = true;
            System.out.println("Account activated!");
        }
    }

    public void deActivateAcc(){
        if(!active){
            System.out.println("Account is already inactive!");
        }else{
            active = false;
            System.out.println("Account Deactivated!");
        }
    }



        public String checkStatus() {
            if(active){
                return "Active";
            }else{
                return "Inactive";
            }
        }


    }

