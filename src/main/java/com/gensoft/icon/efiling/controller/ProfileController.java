package com.gensoft.icon.efiling.controller;

import domain.DataResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "profile")
public class ProfileController {

    @GetMapping(value = "getUser")
    public DataResponse<String> getDataUser(@RequestParam String npwp){
        DataResponse<String> res = new DataResponse<>();
        res.setData(npwp);
        res.setKetSts("Sukses");
        return res;
    }

}
