package com.greenbite.subscription.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/subscriptions")
public class SubscriptionController {
    @GetMapping
    public List<String> getPlans() {
        return List.of("Basic", "Premium");
    }
}
