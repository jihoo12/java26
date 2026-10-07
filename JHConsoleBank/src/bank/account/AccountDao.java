package bank.account;

import java.util.List;

public interface AccountDao {
    boolean save(Account a);
    List<Account> findAll();
    Account findByNo(Int no);
    boolean update(Account a);
    boolean delete(Account a);
}
