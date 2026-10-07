package test;

import bank.member.MemberDao;
import bank.member.MemberListDao;

public class TestMember {
    public static void main(String[] args) {
        TestMemberDao();
    }
    public static void TestMemberDao() {
        MemberDao mdao = new MemberListDao();
        mdao.save(new Member("jihoo","1111","박지후",null,null));
        List<Member> mlist = mdao.findAll();
        printMemberList(mlist);
    }
}
