package bank.app.menu;

import bank.account.AccountService;
import bank.app.console.ConsoleMenu;
import bank.member.MemberService;

public class Startmenu extends ConsoleMenu {

    protected Startmenu(AccountService as, MemberService ms) {
        super(as, ms);
        //TODO Auto-generated constructor stub
        this.menuList = new String[]{"종료","로그인","회원가입"};
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

}
