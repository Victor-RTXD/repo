class User extends Account{
    int id;
    String password;
    String email;
    
    public User(String name, String document) {
        super(name, document);
    }
}
