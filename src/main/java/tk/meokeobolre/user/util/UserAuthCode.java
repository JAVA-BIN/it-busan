package tk.meokeobolre.user.util;

public enum UserAuthCode {

    ADMIN("0")
    , MANAGER("1")
    , MEMBER("2");

    private String value;

    UserAuthCode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
