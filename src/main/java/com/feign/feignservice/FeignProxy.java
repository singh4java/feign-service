package com.feign.feignservice;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(name = "exchange-service",url = "localhost:8081")
@FeignClient(name = "exchange-service")
@RibbonClient(name = "exchange-service")
public interface FeignProxy {
  @GetMapping("/exchange")
  public String portInfo();

}
