package com.markspencer.price;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class PriceController {

    @QueryMapping
    public Price productById(@Argument String id) {
        System.out.println("Inside controller");
        return Price.getById(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/rating/{productId}")
    public ResponseEntity<Double> getRating(@PathVariable String productId) {
        System.out.println("getRating");
        return new ResponseEntity<>(Review.getById(productId).getRating(), HttpStatus.OK);

    }
    @RequestMapping(method = RequestMethod.GET, path = "/review/{productId}")
    public ResponseEntity<Review> getReview(@PathVariable String productId) {
        System.out.println("getReview");
        return new ResponseEntity<>(Review.getById(productId), HttpStatus.OK);

    }
}
