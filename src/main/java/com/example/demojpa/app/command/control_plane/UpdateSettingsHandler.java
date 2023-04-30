package com.example.demojpa.app.command.control_plane;

import com.example.demojpa.control_plane.domaine.Settings;
import reactor.core.publisher.Mono;

public interface UpdateSettingsHandler {
    Mono<Void> update(Mono<Settings> settings);
}
