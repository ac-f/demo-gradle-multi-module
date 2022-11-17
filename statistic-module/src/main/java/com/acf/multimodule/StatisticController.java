package com.acf.multimodule;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("statistic")
public class StatisticController {
  @GetMapping("")
  public String index() {
    return "statistic";
  }
}
