// 이 서비스는 이혜정이 구현하였습니다.
public class JHMemberService implements MemberService {
    final String ADMIN_ID = "admin";
    final String ADMIN_PWD = "1234";
    private MemberDao dao;
    public JHMemberService(MemberDao dao) {
        super();
        this.dao = dao;
        this.dao.save(new Member(ADMIN_ID,ADMIN_PWD,ADMIN_ID,null,null,Member,ADMIN));
    }
}
