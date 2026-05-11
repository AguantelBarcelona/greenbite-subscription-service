package com.greenbite.subscription.service;

import org.springframework.stereotype.Service;

@Service
public class SubscriptionService {

    public String processNewSubscription(String userId, String plan) {
        return "Suscripción " + plan + " activada para el usuario " + userId;
    }
}
