package com.shuoquan.springboot.controller;

import com.alibaba.fastjson.JSONObject;
import com.shuoquan.springboot.entity.Users;
import com.shuoquan.springboot.service.UserService;
import com.shuoquan.springboot.service.WebsocketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@RestController
public class UserController {

  private UserService userService;

  @Autowired
  public UserController(UserService userService) {
    this.userService = userService;
  }

  @RequestMapping(value = "/user/{id}")
  public Users getUser(@PathVariable("id") Integer id) {
    return userService.getUser(id);
  }

  @GetMapping("page")
  public ModelAndView page() {
    return new ModelAndView("websocket");
  }

  @RequestMapping("/message/{toUserId}")
  public ResponseEntity<String> pushToWeb(String message, @PathVariable String toUserId)
      throws IOException {
    WebsocketService.sendInfo(message, toUserId);
    return ResponseEntity.ok("MSG SEND SUCCESS");
  }

  @PostMapping(value = "/message", consumes = "application/json")
  @ResponseBody
  public void responseMessage(@RequestBody JSONObject json) {
//    System.out.println(json);
//    System.out.println(json.getClass().getName());
//    System.out.println(json.get("name"));
//    System.out.println(json.get("age"));
  }
}
