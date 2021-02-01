package mybatis;


public class Box {

  private long id;
  private String code;
  private long companyId;
  private long groupId;
  private String name;
  private String address;
  private long lastUseAt;
  private long managerEndAt;
  private long status;
  private long createdAt;
  private long threshold;
  private String qrcodeUrl;
  private String stock;
  private long areaId;
  private String deviceSerial;
  private Company company;

  public Company getCompany() {
    return company;
  }

  public void setCompany(Company company) {
    this.company = company;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public long getCompanyId() {
    return companyId;
  }

  public void setCompanyId(long companyId) {
    this.companyId = companyId;
  }


  public long getGroupId() {
    return groupId;
  }

  public void setGroupId(long groupId) {
    this.groupId = groupId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public long getLastUseAt() {
    return lastUseAt;
  }

  public void setLastUseAt(long lastUseAt) {
    this.lastUseAt = lastUseAt;
  }


  public long getManagerEndAt() {
    return managerEndAt;
  }

  @Override
  public String toString() {
    return "Box{" +
        "id=" + id +
        ", code='" + code + '\'' +
        ", companyId=" + companyId +
        ", groupId=" + groupId +
        ", name='" + name + '\'' +
        ", address='" + address + '\'' +
        ", lastUseAt=" + lastUseAt +
        ", managerEndAt=" + managerEndAt +
        ", status=" + status +
        ", createdAt=" + createdAt +
        ", threshold=" + threshold +
        ", qrcodeUrl='" + qrcodeUrl + '\'' +
        ", stock='" + stock + '\'' +
        ", areaId=" + areaId +
        ", deviceSerial='" + deviceSerial + '\'' +
        ", company=" + company +
        '}';
  }

  public void setManagerEndAt(long managerEndAt) {
    this.managerEndAt = managerEndAt;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(long createdAt) {
    this.createdAt = createdAt;
  }


  public long getThreshold() {
    return threshold;
  }

  public void setThreshold(long threshold) {
    this.threshold = threshold;
  }


  public String getQrcodeUrl() {
    return qrcodeUrl;
  }

  public void setQrcodeUrl(String qrcodeUrl) {
    this.qrcodeUrl = qrcodeUrl;
  }


  public String getStock() {
    return stock;
  }

  public void setStock(String stock) {
    this.stock = stock;
  }


  public long getAreaId() {
    return areaId;
  }

  public void setAreaId(long areaId) {
    this.areaId = areaId;
  }


  public String getDeviceSerial() {
    return deviceSerial;
  }

  public void setDeviceSerial(String deviceSerial) {
    this.deviceSerial = deviceSerial;
  }

}
