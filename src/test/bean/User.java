package test.bean;

public class User {
    private String username;
    private String password;
    private String address;
    private boolean receivePaper;
    private String[] favoriteFrameworks;
    private String gender;
    private String favoriteNumber;
    private String country;
    private String[] skills;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setReceivePaper(boolean receivePaper) {
        this.receivePaper = receivePaper;
    }

    public boolean isReceivePaper() {
        return receivePaper;
    }

    public void setFavoriteFrameworks(String[] favoriteFrameworks) {
        this.favoriteFrameworks = favoriteFrameworks;
    }

    public String[] getFavoriteFrameworks() {
        return favoriteFrameworks;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setFavoriteNumber(String favoriteNumber) {
        this.favoriteNumber = favoriteNumber;
    }

    public String getFavoriteNumber() {
        return favoriteNumber;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public String[] getSkills() {
        return skills;
    }
}
