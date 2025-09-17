package com.example.apiRateLimit.service;

import io.github.bucket4j.Bandwidth;
import io.github.bucket4j.Bucket;
import io.github.bucket4j.Bucket4j;
import io.github.bucket4j.BucketConfiguration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Component
public class RateLimitFilter { //implements GlobalFilter {

//    private final RedisTemplate<String, Object> redisTemplate;
//    private static final long LIMIT = 100;
//    private static final Duration DURATION = Duration.ofMinutes(1);
//
//    public RateLimitFilter(RedisTemplate<String, Object> redisTemplate) {
//        this.redisTemplate = redisTemplate;
//    }
//
//    @Override
//    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//        String ip = exchange.getRequest().getRemoteAddress().getAddress().getHostAddress();
//        String key = "rate-limit:" + ip;
//
//        Bucket bucket = getBucket(key);
//        if (bucket.tryConsume(1)) {
//            return chain.filter(exchange);
//        } else {
//            exchange.getResponse().setStatusCode(HttpStatus.TOO_MANY_REQUESTS);
//            return exchange.getResponse().setComplete();
//        }
//    }
//
//    private Bucket getBucket(String key) {
//        BucketConfiguration config = Bucket4j.configurationBuilder()
//                .addLimit(Bandwidth.simple(LIMIT, DURATION))
//                .build();
//
////        return Bucket4j.extension(io.github.bucket4j.redis.redisson.cas.RedissonBasedProxyManager.class)
////                .builder()
////                .build(redisTemplate.opsForValue(), key, () -> config);
//
//        return null;
//    }
}
