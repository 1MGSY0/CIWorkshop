package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// import com.fasterxml.jackson.databind.ObjectMapper;
// import com.fasterxml.jackson.databind.node.ArrayNode;
import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DataController {

    @GetMapping("/")
    public String healthCheck() {
        return "HEALTH CHECK OK!";
    }

    @GetMapping("/version")
    public String version() {
        return "The actual version is 1.0.0";
    }

    @GetMapping("/nations")
    public List<Map<String, String>> getRandomNations() {
        var faker = new Faker();
        var nations = new ArrayList<Map<String, String>>();

        for (var i = 0; i < 10; i++) {
            var nation = faker.nation();

            var item = new HashMap<String, String>();
            item.put("nationality", nation.nationality());
            item.put("capitalCity", nation.capitalCity());
            item.put("flag", nation.flag());
            item.put("language", nation.language());

            nations.add(item);
        }

        return nations;
    }

    @GetMapping("/currencies")
    public List<Map<String, String>> getRandomCurrencies() {
        var faker = new Faker();
        var currencies = new ArrayList<Map<String, String>>();

        for (var i = 0; i < 20; i++) {
            var currency = faker.currency();

            var item = new HashMap<String, String>();
            item.put("name", currency.name());
            item.put("code", currency.code());

            currencies.add(item);
        }

        return currencies;
    }
}