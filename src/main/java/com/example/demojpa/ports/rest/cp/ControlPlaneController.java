package com.example.demojpa.ports.rest.cp;

import com.example.demojpa.cp.domaine.Settings;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/control-plane/v1")
public class ControlPlaneController {
    @GetMapping("/settings")
    public Mono<Settings> getCurrentSettings(){
        return null;
    }
}
