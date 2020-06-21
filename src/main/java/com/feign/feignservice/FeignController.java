package com.feign.feignservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

  @Autowired
  private FeignProxy proxy;

  @GetMapping("/change")
  public String changeInfo(){
    return proxy.portInfo();
  }

}
