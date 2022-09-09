package com.wotos.wotosvehicleservice.util.feign;

import com.wotos.wotosvehicleservice.util.model.WotVehicle;
import com.wotos.wotosvehicleservice.util.model.WotApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(name = "WotVehicleFeignClient", url = "${env.urls.world_of_tanks_api}")
@RequestMapping("/encyclopedia")
public interface WotTankopediaFeignClient {

    @GetMapping("/vehicles/")
    ResponseEntity<WotApiResponse<Map<Integer, WotVehicle>>> getVehicles(
            @RequestParam(name = "application_id") String appId,
            @RequestParam(name = "fields", required = false) String fields,
            @RequestParam(name = "language", required = false) String language,
            @RequestParam(name = "limit", required = false) String limit,
            @RequestParam(name = "nation", required = false) String nation,
            @RequestParam(name = "page_no", required = false) String page_no,
            @RequestParam(name = "tank_id", required = false) String tank_id,
            @RequestParam(name = "tier", required = false) String tier,
            @RequestParam(name = "type", required = false) String type
    );

    @GetMapping("/modules/")
    ResponseEntity<?> getModules(
            @RequestParam(name = "application_id") String appId,
            @RequestParam(name = "extra") String extra,
            @RequestParam(name = "fields") String fields,
            @RequestParam(name = "language") String language,
            @RequestParam(name = "limit") String limit,
            @RequestParam(name = "module_id") String moduleId,
            @RequestParam(name = "nation") String nation,
            @RequestParam(name = "page_no") String pageNumber,
            @RequestParam(name = "type") String type
    );

}
