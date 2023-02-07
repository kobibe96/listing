package startio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import startio.model.Listing;

import java.util.List;

@Service
public class ListingService {

    @Autowired
    private CsvService csvService;

    public List<Listing> getListings(double minPrice, double maxPrice, double minMinCpm, double maxMinCpm) {
        return csvService.findByPriceAndMinCpm(minPrice, maxPrice, minMinCpm, maxMinCpm);
    }
}
