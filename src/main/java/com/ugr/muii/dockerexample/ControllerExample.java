package com.ugr.muii.dockerexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class ControllerExample {

    private final AtomicInteger contador = new AtomicInteger(0);

    @GetMapping("/visitas")
    public Map<String, Integer> registrarVisita() {

        int visitas = contador.incrementAndGet();

        return Map.of("visitas", visitas);
    }
}