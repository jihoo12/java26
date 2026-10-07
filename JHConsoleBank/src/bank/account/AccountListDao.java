package bank.account;

import java.util.ArrayList;
import java.util.List;

public class AccountListDao implements AccountDao {

    private List<Account> list = new ArrayList<>();

    @Override
    public boolean save(Account a) {
        list.add(a);
        return true;
    }

    @Override
    public List<Account> findAll() {
        return list;
    }

    @Override
    public Account findByNo(String no) {
        for (Account a : list) {
            if (a.getNo() == Integer.parseInt(no)) {
                return a;
            }
        }
        return null;
    }

    @Override
    public boolean update(Account a) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNo() == a.getNo()) {
                list.set(i, a);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Account a) {
        return list.remove(a);
    }
}