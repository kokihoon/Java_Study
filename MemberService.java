public class MemberService {

    public boolean login(String id, String password) {

        if("hong".equals(id) && "12345".equals(password)) {
            return true;
        }
        else
            return false;
    }

    public void logout(String id) {
        System.out.println(id + "로그아웃했습니다.");
    }
}
