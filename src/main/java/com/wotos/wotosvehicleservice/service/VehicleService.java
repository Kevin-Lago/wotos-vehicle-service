package com.wotos.wotosvehicleservice.service;

import com.wotos.wotosvehicleservice.util.feign.WotTankopediaFeignClient;
import com.wotos.wotosvehicleservice.util.model.WotVehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Service
public class VehicleService {

    @Value("${env.app_id}")
    private String APP_ID;

    @Autowired
    WotTankopediaFeignClient wotTankopediaFeignClient;

    public VehicleService() {

    }

    public Map<Integer, WotVehicle> getVehicles(
            String[] fields, String language, Integer limit, String[] nations,
            Integer pageNumber, Integer[] vehicleIds, Integer[] vehicleTiers,
            String[] vehicleTypes
    ) {
        Map<Integer, WotVehicle> wotVehicles = fetchWotVehicles(
                fields, language, limit, nations, pageNumber, vehicleIds, vehicleTiers, vehicleTypes
        );

        return wotVehicles;
    }

    private Map<Integer, WotVehicle> fetchWotVehicles(
            String[] fields, String language, Integer limit,
            String[] nations, Integer pageNumber,
            Integer[] vehicleIds, Integer[] vehicleTiers,
            String[] vehicleTypes
    ) {
        try {
            return Objects.requireNonNull(
                    wotTankopediaFeignClient.getVehicles(
                            APP_ID, fields, language, limit, nations, pageNumber, vehicleIds, vehicleTiers, vehicleTypes
                    ).getBody()
            ).getData();
        } catch (NullPointerException e) {
            System.out.println("Couldn't fetch WotVehicles" + "\n" + e.getStackTrace());
            return new HashMap<>();
        }
    }

}
