package com.swiftpay.gateway.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.time.Duration;

@Service
@RequiredArgsConstructor
public class IdempotencyService {

    private final RedisTemplate<String,String> redisTemplate;

    public boolean exists(String transactionId) {

        return Boolean.TRUE.equals(
                redisTemplate.hasKey(transactionId)
        );
    }

    public void store(String transactionId) {

        redisTemplate.opsForValue()
                .set(transactionId, "processed",
                        Duration.ofHours(24));
    }
}
