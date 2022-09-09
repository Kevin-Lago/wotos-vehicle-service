package com.wotos.wotosvehicleservice.controller;

import com.wotos.wotosvehicleservice.service.VehicleService;
import com.wotos.wotosvehicleservice.util.model.WotVehicle;
import com.wotos.wotosvehicleservice.util.model.WotApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

//    @GetMapping
//    public ResponseEntity<WotApiResponse<Map<Integer, WotVehicle>>> getVehicles(@PathParam("tank_id") String tankId) {
//        List<WotVehicle> wotVehicles = vehicleService.getVehicles(tankId);
//
//        if (wotVehicles.size() > 0) {
//            return new ResponseEntity<Map<Integer, WotVehicle>>(wotVehicles, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }

}
