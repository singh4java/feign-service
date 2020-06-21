package com.feign.feignservice;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "exchange-service",url = "localhost:8081")
public interface FeignProxy {
  @GetMapping("/exchange")
  public String portInfo();

}
