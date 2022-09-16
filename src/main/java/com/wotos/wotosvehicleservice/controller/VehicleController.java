package com.wotos.wotosvehicleservice.controller;

import com.wotos.wotosvehicleservice.service.VehicleService;
import com.wotos.wotosvehicleservice.util.model.WotVehicle;
import com.wotos.wotosvehicleservice.util.model.WotApiResponse;
import com.wotos.wotosvehicleservice.validation.constraints.Language;
import com.wotos.wotosvehicleservice.validation.constraints.VehicleType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Max;
import javax.websocket.server.PathParam;
import java.lang.reflect.Array;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/vehicles")
@Validated
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

    @GetMapping
    public Map<Integer, WotVehicle> getVehicles(
            @RequestParam(value = "language", required = false, defaultValue = "en") @Language String language,
            @RequestParam(value = "limit", required = false) Integer limit,
            @RequestParam(value = "nations", required = false) String[] nations,
            @RequestParam(value = "page", required = false) Integer pageNumber,
            @RequestParam(value = "vehicleIds", required = false) Integer[] vehicleIds,
            @RequestParam(value = "vehicleTiers", required = false) Integer[] vehicleTiers,
            @RequestParam(value = "types", required = false) @VehicleType String[] vehicleTypes
    ) {
        return vehicleService.getVehicles(language, limit, nations, pageNumber, vehicleIds, vehicleTiers, vehicleTypes);
    }

}
