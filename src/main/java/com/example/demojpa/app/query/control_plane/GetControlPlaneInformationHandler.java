package com.example.demojpa.app.query.control_plane;

import com.example.demojpa.control_plane.domaine.RunInfo;
import reactor.core.publisher.Mono;

public interface GetControlPlaneInformationHandler{
    Mono<RunInfo> getCurrentRunInfo();
}
