package com.opensw.safeguard.repository.alarm;

import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

public interface EmitterRepository {

    void save(Long id, SseEmitter sseEmitter);
    void deleteById(Long id);
    SseEmitter findById(Long id);
}
