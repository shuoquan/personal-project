package mybatis;


public class User {

  private long id;

  public String getUsername() {
    return username;
  }

  @Override
  public String toString() {
    return "User{" +
        "id=" + id +
        ", username='" + username + '\'' +
        ", password='" + password + '\'' +
        ", salt='" + salt + '\'' +
        ", createdAt=" + createdAt +
        ", companyId=" + companyId +
        ", fullname='" + fullname + '\'' +
        ", phone='" + phone + '\'' +
        ", mail='" + mail + '\'' +
        ", title='" + title + '\'' +
        '}';
  }

  public void setUsername(String username) {
    this.username = username;
  }

  private String username;
  private String password;
  private String salt;
  private long createdAt;
  private long companyId;
  private String fullname;
  private String phone;
  private String mail;
  private String title;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getSalt() {
    return salt;
  }

  public void setSalt(String salt) {
    this.salt = salt;
  }


  public long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(long createdAt) {
    this.createdAt = createdAt;
  }


  public long getCompanyId() {
    return companyId;
  }

  public void setCompanyId(long companyId) {
    this.companyId = companyId;
  }


  public String getFullname() {
    return fullname;
  }

  public void setFullname(String fullname) {
    this.fullname = fullname;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

}
