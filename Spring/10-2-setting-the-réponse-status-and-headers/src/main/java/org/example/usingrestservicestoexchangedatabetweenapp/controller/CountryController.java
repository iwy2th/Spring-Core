package org.example.usingrestservicestoexchangedatabetweenapp.controller;

import org.example.usingrestservicestoexchangedatabetweenapp.model.Country;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {
    @GetMapping("/france")
    public ResponseEntity<List<Country>> france() {
        Country c1 = Country.of("France", 67);
        Country c2 = Country.of("VietNam", 1);

        return ResponseEntity
                .status(HttpStatus.OK)
                .header("continent", "Europe")
                .header("capital", "Paris")
                .header("favorite_food", "cheese and wine")
                .body(List.of(c1, c2));
    }
}
