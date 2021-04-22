/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Account;

import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class AccountDirectory {
    
    private ArrayList<Account> userAccountList;

    public AccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<Account> getUserAccountList() {
        return userAccountList;
    }
    
    public Account authenticateUser(String username, String password){
        for (Account ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public Account createUserAccount(String username, String password, Employee employee, Role role){
        Account userAccount = new Account();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (Account ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
}
