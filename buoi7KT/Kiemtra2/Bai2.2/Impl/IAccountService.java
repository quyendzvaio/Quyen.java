package Bai2.2.Impl;
import Bai2.AccountService;

public class IAccountService implements AccountService {    
 
    private List<Account> accounts;  

    public AccountServiceImpl() {  
        accounts = new ArrayList<>();  
    }  

    public List<Account> getAllAccount() {  
        return accounts;  
    }  

    public void createNewAccount(Account account) {  
        accounts.add(account);  
    }  

    public Account getAccountByUsername(String username) {  
        for (Account account : accounts) {  
            if (account.getUsername().equals(username)) {  
                return account;  
            }  
        }  
        return null;  
    }  

    public void deleteAccount(String username) {  
        accounts.removeIf(account -> account.getUsername().equals(username));  
    }  

    public void changeStatus(String username, Status status) {  
        Account account = getAccountByUsername(username);  
        if (account != null) {  
            account.setStatus(status);  
        }  
    }  
}  
