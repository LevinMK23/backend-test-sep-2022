package com.geekbrains.builder;

import com.geekbrains.api.ApiSearchResult;
import com.geekbrains.api.SpoonaccularService;

public class Main {
    public static void main(String[] args) {

        SpoonaccularService spoonaccularService = new SpoonaccularService();
        ApiSearchResult recipes = spoonaccularService.findRecipes("Bread", 3);
        System.out.println(recipes);

    }
}
