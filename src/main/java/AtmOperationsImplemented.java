import java.util.HashMap;
import java.util.Map;

public class AtmOperationsImplemented implements AtmOperationsToImplement{

    Atm atm = new Atm();
    Map<Double,String> statement = new HashMap<>();

    @Override
    public void viewBalance() {
        System.out.println("Available balance: " + atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if(withdrawAmount % 5 == 0) {
            if (withdrawAmount <= atm.getBalance()) {
                statement.put(withdrawAmount, " amount withdrawn.");
                System.out.println("Withdraw money " + withdrawAmount);
                atm.setBalance(atm.getBalance() - withdrawAmount);
                viewBalance();
            } else {
                System.out.println("Insufficient founds.");
            }
        }
        else{
            System.out.println("The amount you want to withdraw is not a multiple of 5.");
        }
    }

    @Override
    public void depositAmount(double depositAmount) {
        statement.put(depositAmount, " amount deposited.");
        System.out.println(depositAmount + " deposited successfully!");
        atm.setBalance(atm.getBalance() + depositAmount);
        viewBalance();
    }

    @Override
    public void viewStatement() {
        for(Map.Entry<Double,String> map:statement.entrySet()){
            System.out.println(map.getKey() + "" + map.getValue());
        }
    }
}
