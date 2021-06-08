package logic.dry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Serhiy Dubovenko
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {

    private String userName;
    private String password;
    private  String token;


    public Account setName(String name){
        this.setName(name);
        return this;
    }

    public Account setPassword(String password){
        this.setName(password);
        return this;
    }

    public Account setToken(String token){
        this.setName(token);
        return this;
    }
}
