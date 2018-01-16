public class Member {
    String name;
    String id;

    public Member(String name, String id) {
        this.name = name;
        this.id = id;
    }
    @Override
    public String toString() {
        return name +": " + id;
    }
}
