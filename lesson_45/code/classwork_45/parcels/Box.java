package classwork_45.parcels;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Box implements Iterable<Parcel> {
    List<Parcel> parcels; // list of parcels in box

    public Box(int numParcels) {
        Random random = new Random();
        this.parcels = Stream.generate(() -> new Parcel(random.nextDouble(0, 2))) // weight of the parcel from 0 to 2
                .limit(numParcels)
                .collect(Collectors.toList());
    }

    public List<Parcel> getParcels() {
        return parcels;
    }

    public boolean addParcel(Parcel parcel) {
        return parcels.add(new Parcel(2))
    }

    // how many parcels in Box
    public int quantity() {
        return parcels.size();
    }

    // weight of the Box = sum of weigh of all parcels
    public double weightBox() {
        return parcels.stream()
                .mapToDouble(p -> p.getWeight()) //object of the type parcels
                .sum();
    }

    @Override
    public Iterator<Parcel> iterator() {
        return parcels.iterator();
    }
}
