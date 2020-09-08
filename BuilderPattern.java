public class BuilderPattern {
    public static void main(String[] args){
        User.UserBuilder userBuilder = new User.UserBuilder("username", "password");
        userBuilder.age(38).phoneno(123456789);
        User user = new User(userBuilder);
        System.out.println(user);
    }
}

class User {
    private String username;
    private String password;
    private int age;
    private long phoneno;

    public User(UserBuilder builder){
         this.username = builder.username;
         this.password = builder.password;
         this.age = builder.age;
         this.phoneno = builder.phoneno;
    }

    public String toString(){
        return this.username + "," + this.password +"," +this.age+","+this.phoneno;
    }

    public static class UserBuilder {
        private final String username;
        private final String password;
        private int age;
        private long phoneno;

        public UserBuilder(String username, String password){
            this.username = username;
            this.password = password;
        }

        public UserBuilder age(int age){
            this.age = age;
            return this;
        }
        public UserBuilder phoneno(long phoneno){
            this.phoneno = phoneno;
            return this;
        }

        public UserBuilder build(){
            return this;
        }
    }
}