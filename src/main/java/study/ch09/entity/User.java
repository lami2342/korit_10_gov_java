package study.ch09.entity;

public class User {
    private String username;
    private String password;
    private String name;

    public User(String username, String password, String name) {
        this.username = username;
        this.password = password;
        this.name = name;
    }

    public User(String username, String password) {
        this(username, password, "공백");
    }

    public User(String username) {
        this(username, "1234", "공백");
    }

    //alt + ins 누르면 알아서 getter,setter 설정 해줌

    public String getPassword() {
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getName() {
        return name.substring(0,name.length()-1);
        //신동수 = 3 인덱스
        //0 1 2
        //신동수 님 = 4인덱스
        //0 1 2 3


    }

    public void setName(String name){
        this.name = name + "님";
    }


    public boolean getUsername() {
        return username;
    }

    public void setUsername(boolean username) {
        this.username = username;
    }
}
