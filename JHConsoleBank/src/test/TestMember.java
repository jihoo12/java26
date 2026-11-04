package test;

import java.util.List;

import bank.member.Member;
import bank.member.MemberDao;
import bank.member.MemberListDao;

public class TestMember {
    public static void main(String[] args) {
        TestMemberDao();
    }
    public static void TestMemberDao() {
        MemberDao mdao = new MemberListDao();
        mdao.save(new Member("jihoo","1111","박지후",null,null, Member.USER));
        List<Member> mlist = mdao.findAll();
        printMemberList(mlist);
    }

    public static void printMemberList(List<Member> mlist) {
        if (mlist == null) {
            System.out.println("회원이 없습니다.");
            return;
        }
        for (Member m : mlist) {
            System.out.println(m);
        }
    }
}
