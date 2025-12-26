public class Main {



    public static void main(String[] args) {

     User user1 = new User("blackgamer60", "12345678", false);
User user2 =  new User("IshaJ", "securegirlalooo9", true);
User user3 = new User("Finn", "password123", false);

        System.out.println("Username: " + user1.getUserName() + " |  Status : " + user1.checkStatus());
        user2.deActivateAcc();
        System.out.println("Username: " + user2.getUserName() + " |  Status : " + user2.checkStatus());








    }
}