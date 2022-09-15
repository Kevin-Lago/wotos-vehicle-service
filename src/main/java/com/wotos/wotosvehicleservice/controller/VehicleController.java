package com.wotos.wotosvehicleservice.controller;

import com.wotos.wotosvehicleservice.service.VehicleService;
import com.wotos.wotosvehicleservice.util.model.WotVehicle;
import com.wotos.wotosvehicleservice.util.model.WotApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/vehicles")
@Validated
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

    @GetMapping
    public String getVehicles(@RequestParam("vehicleIds") Integer[] vehicleIds) {
        return vehicleService.get();
    }

}
