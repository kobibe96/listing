package startio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import startio.model.Listing;
import startio.service.ListingService;

import java.util.List;

@RestController
public class ListingController {

    @Autowired
    ListingService listingService;

    @GetMapping("/listings")
    public List<Listing> getListings(@RequestParam Double min_price,
                                     @RequestParam Double max_price, @RequestParam Double min_min_cpm, @RequestParam Double max_min_cpm) {
        return listingService.getListings(min_price, max_price, min_min_cpm, max_min_cpm);
    }
}
