package com.greenbite.subscription.controller;

import com.greenbite.subscription.service.SubscriptionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/subscriptions")
public class SubscriptionController {

    private final SubscriptionService subscriptionService;

    public SubscriptionController(SubscriptionService subscriptionService) {
        this.subscriptionService = subscriptionService;
    }

    @GetMapping
    public List<String> getPlans() {
        return List.of("Basic", "Premium");
    }

    @PostMapping
    public Map<String, String> createSubscription(
            @RequestParam String userId,
            @RequestParam String plan) {

        String result = subscriptionService.processNewSubscription(userId, plan);

        return Map.of("message", result);
    }
}
