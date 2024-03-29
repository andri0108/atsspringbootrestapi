package com.juaracoding.atsspringbootrestapi.controller;

import com.juaracoding.atsspringbootrestapi.model.CalonPeserta;
import com.juaracoding.atsspringbootrestapi.model.Tunggal;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/hello")
public class HelloController {
    @GetMapping("/permisi")
    public String firstPage() {
        return "welcome";
    }
    @PostMapping("/seleksi")
    public Map<String,Object> seleksiCalonPeserta(@RequestBody CalonPeserta calon) {
        System.out.println("Parkir Disini !!");
        calon.setNilai(100);
        calon.setUmur(79);

        Map<String,Object> mapz = new HashMap<>();
        mapz.put("message","OK BOSS !!");
        mapz.put("data",calon);
        mapz.put("status","single");
        mapz.put("waktu",new Date());
        if (calon.getNilai() > 80
                && calon.getUmur() >= 18
                && calon.getUmur() <= 60) {
//            return calon.getNama() + " lolos seleksi";
            //business logic
        } else {
//            return calon.getNama() + " tidak lolos seleksi";
            //business logic
        }
        return mapz;
    }

    @PostMapping("/seleksi2")
    public String seleksiCalonPesertaDua(
            @RequestParam(value = "nama")  String strNama,
            @RequestParam(value = "umur") Integer intUmur,
            @RequestParam(value = "nilai") Integer intNilai
    ) {

        CalonPeserta cp = new CalonPeserta();
        cp.setUmur(intUmur);
        cp.setNilai(intNilai);
        cp.setNama(strNama);

        if (intNilai > 80
                && intUmur >= 18
                && intUmur <= 60) {
            return strNama + " lolos seleksi";
        } else {
            return strNama + " tidak lolos seleksi";
        }
    }

    @PostMapping("/seleksi3")
    public Tunggal seleksiCalonPesertaDua(
            @RequestBody Tunggal tunggal
    ) {

        System.out.println(tunggal.getId());
        System.out.println(tunggal.getIntZ());
        System.out.println(tunggal.getCalonPeserta().getNilai());
        System.out.println(tunggal.getCalonPeserta().getNama());
        System.out.println(tunggal.getCalonPeserta().getUmur());

        return tunggal;
    }
}