package com.wotos.wotosvehicleservice.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wotos.wotosvehicleservice.config.EnvironmentConfig;
import com.wotos.wotosvehicleservice.util.feign.WotTankopediaFeignClient;
import com.wotos.wotosvehicleservice.util.model.WotVehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class VehicleService {

    private final ObjectMapper mapper = new ObjectMapper();
    private final EnvironmentConfig environmentConfig;

    @Autowired
    WotTankopediaFeignClient wotTankopediaFeignClient;

    public VehicleService(EnvironmentConfig environmentConfig) {
        this.environmentConfig = environmentConfig;
    }

//    public List<WotVehicle> getVehicles(String tankId) {
//        ResponseEntity<String> test = wotTankopediaFeignClient.getVehicles(environmentConfig.APP_ID(), "", "en", "1", "", "", "1", "", "");
//        List<WotVehicle> fuckingbullshitasscode = new ArrayList<>();
//
//        try {
//            JsonNode data = mapper.readTree(test.getBody()).get("data");
//
//            data.forEach(value -> {
//                try {
//                    WotVehicle fuckyou = mapper.treeToValue(value, WotVehicle.class);
//                    fuckingbullshitasscode.add(fuckyou);
//                    System.out.println(fuckyou);
//                } catch (JsonProcessingException e) {
//                    System.out.println("Error parsing Expected Statistics with values: " + value.toString() + "\n" + Arrays.toString(e.getStackTrace()));
//                }
//            });
//
//            return fuckingbullshitasscode;
//        } catch (IOException e) {
//            System.out.println(e);
//        }
//
//        return null;
//    }

}
