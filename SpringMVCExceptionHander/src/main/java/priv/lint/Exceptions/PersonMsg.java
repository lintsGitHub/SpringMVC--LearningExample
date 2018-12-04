package priv.lint.Exceptions;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class PersonMsg {
    private String province;
    private Date birthday;
    private String gender;

    @Override
    public String toString() {
        return "PersonMsg{" +
                "province='" + province + '\'' +
                ", birthday=" + birthday +
                ", gender='" + gender + '\'' +
                '}';
    }

    public PersonMsg(String province, Date birthday, String gender) {
        this.province = province;
        this.birthday = birthday;
        this.gender = gender;
    }

    public PersonMsg() {
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
