package medac.stars.model;

public class User {

   private String name;
   private String password;
   private String email;
   private int type;

   public User(String name, String password, String email, int type) {
       this.name = name;
       this.password = password;
       this.email = email;
       this.type = type;
   }

   public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }

   public String getPassword() {
       return password;
   }

   public void setPassword(String password) {
       this.password = password;
   }

   public String getEmail() {
       return email;
   }

   public void setEmail(String email) {
       this.email = email;
   }

   public int getType() {
       return type;
   }

   public void setType(int type) {
       this.type = type;
   }

}