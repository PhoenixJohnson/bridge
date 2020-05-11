package com.indoor.bridge.order.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
@Slf4j
@RequestMapping("/bridge/order")
public class OrderController {

    private final WebClient.Builder clientBuilder;

    private final static String PAYMENT_END_POINT = "http://localhost:8001/bridge/payment/getPaymentById/{Id}";

    @Autowired
    public OrderController(WebClient.Builder clientBuilder) {
        this.clientBuilder = clientBuilder;
    }

    @GetMapping("/getPayment/{paymentId}")
    public Mono<String> getPayment(@PathVariable String paymentId){

        return clientBuilder
                .baseUrl(PAYMENT_END_POINT.replace("{Id}", paymentId))
                .build()
                .method(HttpMethod.GET)
                .retrieve()
                .bodyToMono(String.class);

    }
}
