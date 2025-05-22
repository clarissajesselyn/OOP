
public class OAuthLogin implements ILogin {
    String token;
    public OAuthLogin(String token){
        this.token = token;
    }

    @Override
    public boolean authenticate(String username, String password) {
        if(this.token.equals(password)){
            return true;
        }
        return false;
    }

}
