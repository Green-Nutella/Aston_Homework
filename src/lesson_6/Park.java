package lesson_6;

import java.util.ArrayList;
import java.util.List;

public class Park {

    // Список аттракционов в парке
    private List<Attraction> attractions;

    public Park() {
        this.attractions = new ArrayList<>();
    }

    public class Attraction {
        private String name;
        private int workingHours;
        private int price;

        public Attraction(String name, int workingHours, int price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getWorkingHours() {
            return workingHours;
        }

        public void setWorkingHours(int workingHours) {
            this.workingHours = workingHours;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Attraction " +
                    "name='" + name + '\'' +
                    ", workingHours='" + workingHours + '\'' +
                    ", price=" + price ;
        }
    }

    public void addAttraction(String name, int workingHours, int price) {
        Attraction attraction = new Attraction(name, workingHours, price);
        attractions.add(attraction);
    }

    @Override
    public String toString() {
        return "Park " +
                "attractions=" + attractions ;
    }

}

