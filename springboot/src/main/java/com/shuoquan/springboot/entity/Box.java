package com.shuoquan.springboot.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;

@TableName("boxes")
@Data
@Accessors(chain = true)
public class Box implements Serializable {

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

}
