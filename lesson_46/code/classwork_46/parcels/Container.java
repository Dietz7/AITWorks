package classwork_46.parcels;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Container implements Iterable<Box> {
    private String label;
    private List<Box> boxes;

    public Container(String label, int numBoxes) {
        this.label = label;
        Random random = new Random();
        //loop from 0 to numBox - 1, creates new boxes
        this.boxes = IntStream.range(0, numBoxes)
                .mapToObj(i -> new Box(random.nextInt(5, 11)))
                .toList();//put into List
    }

    // quantity of parcels in the container
    public int getTotalParcels() {
        return boxes.stream()
                .mapToInt(box -> box.parcels.size())
                .sum();
    }

    public String getLabel() {
        return label;
    }

    public List<Box> getBoxes() {
        return boxes;
    }

    //adding Box
    //adding the box into list of boxes
    public boolean addedBox(Box box) {
        return boxes.add(box);
    }

    public double weightContainer() {
        return boxes.stream()
                .mapToDouble(b -> b.weightBox())
                .sum();
    }

    public int quantity() {
        return boxes.size();
    }

    public int countParcels(){
        return boxes.stream()
                .mapToInt(p-> p.quantity())
                .sum();
    }
        //public String toString () {
        //final StringBuffer sb = new StringBuffer("Container{");
        //sb.append("label='").append(label).append('\'');
        //sb.append(", boxes=").append(boxes);
        //sb.append(", parcels=").append(countParcels());
       // sb.append('}');
        //return sb.toString();

   // }

    @Override
    public String toString() {
        return "Container label " + label  + ", parcels =  " + countParcels() ;
    }

    //@Override
   // public String toString() {
       // return "Container{" +
              //  "label='" + label + '\'' +
               // ", boxes=" + boxes +
                //", parcels=" + countParcels()+
               // '}';
    //}

    @Override
    public Iterator<Box> iterator() {
        return boxes.iterator();
    }
}
