package mybatis;


public class Company {

  private long id;
  private String name;
  private long auth;
  private double boxPrice;
  private long status;
  private String alias;
  private String address;
  private String signSk;
  private String signApp;
  private String signSid;
  private long serviceType;
  private String serverUrl;
  private long serviceId;
  private long isPrivate;
  private String appid;
  private String aliAppId;
  private String aliUserId;
  private long needSplit;
  private String faceAppId;
  private long payScoreId;
  private long feeMode;
  private double feeAmount;
  private long isCollected;
  private double feeDiff;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getAuth() {
    return auth;
  }

  public void setAuth(long auth) {
    this.auth = auth;
  }

  public double getBoxPrice() {
    return boxPrice;
  }

  public void setBoxPrice(double boxPrice) {
    this.boxPrice = boxPrice;
  }

  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }

  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getSignSk() {
    return signSk;
  }

  public void setSignSk(String signSk) {
    this.signSk = signSk;
  }

  public String getSignApp() {
    return signApp;
  }

  public void setSignApp(String signApp) {
    this.signApp = signApp;
  }

  public String getSignSid() {
    return signSid;
  }

  public void setSignSid(String signSid) {
    this.signSid = signSid;
  }

  public long getServiceType() {
    return serviceType;
  }

  public void setServiceType(long serviceType) {
    this.serviceType = serviceType;
  }

  public String getServerUrl() {
    return serverUrl;
  }

  public void setServerUrl(String serverUrl) {
    this.serverUrl = serverUrl;
  }

  public long getServiceId() {
    return serviceId;
  }

  public void setServiceId(long serviceId) {
    this.serviceId = serviceId;
  }

  public long getIsPrivate() {
    return isPrivate;
  }

  public void setIsPrivate(long isPrivate) {
    this.isPrivate = isPrivate;
  }

  public String getAppid() {
    return appid;
  }

  public void setAppid(String appid) {
    this.appid = appid;
  }

  public String getAliAppId() {
    return aliAppId;
  }

  public void setAliAppId(String aliAppId) {
    this.aliAppId = aliAppId;
  }

  public String getAliUserId() {
    return aliUserId;
  }

  public void setAliUserId(String aliUserId) {
    this.aliUserId = aliUserId;
  }

  public long getNeedSplit() {
    return needSplit;
  }

  public void setNeedSplit(long needSplit) {
    this.needSplit = needSplit;
  }

  public String getFaceAppId() {
    return faceAppId;
  }

  public void setFaceAppId(String faceAppId) {
    this.faceAppId = faceAppId;
  }

  public long getPayScoreId() {
    return payScoreId;
  }

  public void setPayScoreId(long payScoreId) {
    this.payScoreId = payScoreId;
  }

  public long getFeeMode() {
    return feeMode;
  }

  public void setFeeMode(long feeMode) {
    this.feeMode = feeMode;
  }

  public double getFeeAmount() {
    return feeAmount;
  }

  public void setFeeAmount(double feeAmount) {
    this.feeAmount = feeAmount;
  }

  @Override
  public String toString() {
    return "Company{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", auth=" + auth +
        ", boxPrice=" + boxPrice +
        ", status=" + status +
        ", alias='" + alias + '\'' +
        ", address='" + address + '\'' +
        ", signSk='" + signSk + '\'' +
        ", signApp='" + signApp + '\'' +
        ", signSid='" + signSid + '\'' +
        ", serviceType=" + serviceType +
        ", serverUrl='" + serverUrl + '\'' +
        ", serviceId=" + serviceId +
        ", isPrivate=" + isPrivate +
        ", appid='" + appid + '\'' +
        ", aliAppId='" + aliAppId + '\'' +
        ", aliUserId='" + aliUserId + '\'' +
        ", needSplit=" + needSplit +
        ", faceAppId='" + faceAppId + '\'' +
        ", payScoreId=" + payScoreId +
        ", feeMode=" + feeMode +
        ", feeAmount=" + feeAmount +
        ", isCollected=" + isCollected +
        ", feeDiff=" + feeDiff +
        '}';
  }

  public long getIsCollected() {
    return isCollected;
  }

  public void setIsCollected(long isCollected) {
    this.isCollected = isCollected;
  }

  public double getFeeDiff() {
    return feeDiff;
  }

  public void setFeeDiff(double feeDiff) {
    this.feeDiff = feeDiff;
  }

}
