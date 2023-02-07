package startio.service;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import startio.model.Listing;
import javax.annotation.PostConstruct;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CsvService {

    @Value("${pathToCsvFile}")
    String fileName;

    private static List<Listing> listings = new ArrayList<>();

    @PostConstruct
    public void openCsv()  {

        List<String[]> r = null;
        try (CSVReader reader = new CSVReader(new FileReader(fileName))) {
            r = reader.readAll();
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }

        r.remove(0);
        r.stream().forEach(e-> {
            Listing listing = new Listing();
            listing.setSessionId(e[0]);
            listing.setAdvertiserId(e[1]);
            listing.setCountry(e[2]);
            listing.setPrice(e[3]);
            listing.setEventTypeId(e[4]);
            listing.setGdpr(e[5]);
            listing.setMinCpm(e[6]);
            listing.setPriority(e[7]);
            listing.setBidPrice(e[8]);
            listings.add(listing);
        });
    }

    public List<Listing> findByPriceAndMinCpm(double minPrice, double maxPrice, double minMinCpm, double maxMinCpm) {
        return listings.stream().filter(entity -> (Double.parseDouble(entity.getPrice()) >= minPrice && Double.parseDouble(entity.getPrice()) <= maxPrice)
                                               && (Double.parseDouble(entity.getMinCpm()) >= minMinCpm && Double.parseDouble(entity.getMinCpm()) <= maxMinCpm))
                                                  .collect(Collectors.toList());
    }
}
