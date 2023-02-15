package hello.hellospring.domain;

public class Member {

    private Long id;
    private String name;
    private String password;
    private String phoneNumber;
    private String email;
    private Long open;
    private String emailOrPhone;
    private String nickname;

    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getEmailOrPhone() {return emailOrPhone;}
    public void setEmailOrPhone(String emailOrPhone){this.emailOrPhone = emailOrPhone;}
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setOpen(Long open) {this.open = open;}

    public Long getOpen() {return open;}


}
