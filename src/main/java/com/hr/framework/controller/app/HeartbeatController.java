package com.hr.framework.controller.app;

import com.hr.framework.constant.ResourcePath;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@Api(value = "Heartbeat")
@RestController
@RequestMapping(ResourcePath.API + ResourcePath.V1 + ResourcePath.APP + ResourcePath.HEARTBEAT)
public class HeartbeatController {

  @RequestMapping(method = RequestMethod.GET)
  @ApiOperation(value = "Heartbeat", httpMethod = "GET", response = ResponseEntity.class)
  @ApiImplicitParams({
      @ApiImplicitParam(name = "Authorization", value = "token", paramType = "header", dataType = "string", required = true),
      @ApiImplicitParam(name = "Limit-Key", value = "limit key", paramType = "header", dataType = "string")
  })
  public ResponseEntity heartbeat() {
    return ResponseEntity.ok().build();
  }
}
