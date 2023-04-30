package com.example.demojpa.app.query.control_plane;

import com.example.demojpa.control_plane.domaine.Settings;
import reactor.core.publisher.Mono;

public interface QuerySettingsHandler {
    Mono<Settings> find();
}
