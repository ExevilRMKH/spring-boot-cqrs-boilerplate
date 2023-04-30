package com.example.demojpa.app.command.control_plane;

import reactor.core.publisher.Mono;

public interface ControlPlaneHandlers {
    Mono<Void> run();
    Mono<Void> stop();

    Mono<Void> restart();
}
