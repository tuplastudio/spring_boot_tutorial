package com.tuplastudio.erp.controller;

import com.tuplastudio.erp.service.StringParse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping(path = "api/v1")
public class GeneralController {

  @GetMapping(path = "heltch-check")
  @ResponseBody
  public StringParse getHealtCheck() {
    return new StringParse("Process is Ok!");
  }

}
