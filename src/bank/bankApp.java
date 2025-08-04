
package bank;


public class bankApp {
    int accountNum = 100021;
    float initialBalance = 0;
    int pin = 1234;

    public boolean verifyAccount(int acc, int pn){
        
            if(acc == accountNum && pn == pin){
                return true;
            }else{
                return false;
            }
    }
    
    public int setAccount(){
        return accountNum;
    }
    
    public void viewBalance(){
    
    }
    
    public boolean verify_account( int acc, int pin){
        return false;
       
    }

}