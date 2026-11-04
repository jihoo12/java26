package bank.app.console;

import bank.account.AccountService;
import bank.member.MemberService;

public abstract class ConsoleMenu {
    protected AccountService as;
    protected MemberService ms;
    protected String[] menuList;
    protected ScannerInput input = new ScannerInput();
    protected ConsoleMenu(AccountService as, MemberService ms) {
        this.as = as;
        this.ms = ms;
    }
    public abstract void run();
    protected int selectMenu() {
        System.out.println("-------------------------------");
        for (int i = 1; i < menuList.length; i++) {
            System.out.println(i + "." + menuList[i]);
        }
        return input.readInt("선택: ");
    }
}
