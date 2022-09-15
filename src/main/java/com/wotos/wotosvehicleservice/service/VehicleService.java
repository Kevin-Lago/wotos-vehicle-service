package com.wotos.wotosvehicleservice.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wotos.wotosvehicleservice.config.EnvironmentConfig;
import com.wotos.wotosvehicleservice.util.feign.WotTankopediaFeignClient;
import com.wotos.wotosvehicleservice.util.model.WotVehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Service
public class VehicleService {

    @Value("${env.urls.world_of_tanks_api}")
    private String WOT_API;
    @Value("${env.app_id}")
    private String APP_ID;

    @Autowired
    WotTankopediaFeignClient wotTankopediaFeignClient;

    public VehicleService() {

    }

    public String get() {
        return "got";
    }

//    public List<WotVehicle> getVehicles(List<Integer> vehicleIds) {
//
//    }

    private List<WotVehicle> fetchWotVehicles(
            String fields, String language, Integer limit,
            List<String> nations, String pageNumber,
            List<Integer> vehicleIds, List<Integer> vehicleTiers,
            List<String> vehicleTypes
    ) {
        return null;
//        Integer[] array = new Integer[vehicleIds.size()];
//        vehicleIds.toArray(array);
//
//        try {
//            return Objects.requireNonNull(
//                    wotTankopediaFeignClient.getVehicles(APP_ID, accountId, accessToken, extra, fields, inGarage, language, array).getBody()
//            ).getData().get(accountId);
//        } catch (NullPointerException e) {
//            System.out.println("Couldn't fetch WotVehicleStatistics with accountId: " + accountId + " and vehicleIds: " + vehicleIds.toString() + "\n" + e.getStackTrace());
//            return new ArrayList<>();
//        }
    }

}
