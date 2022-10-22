package transport;

public class train extends transport {
    private int tripPrice;
    private int tripTime;
    private String firstStation;
    private String lastStation;
    private int trainLenght;

    public train(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed, int tripPrice, int tripTime, String firstStation, String lastStation, int trainLenght) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        this.tripPrice = tripPrice;
        this.tripTime = tripTime;
        this.firstStation = firstStation;
        this.lastStation = lastStation;
        this.trainLenght = trainLenght;
    }

    public int getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(int tripPrice) {
        if (tripPrice < 0) {
            this.tripPrice = 0;
        } else {
            this.tripPrice = tripPrice;
        }
    }

    public int getTripTime() {
        return tripTime;
    }

    public void setTripTime(int tripTime) {
        if (tripTime < 0) {
            this.tripTime = 0;
        } else {
            this.tripTime = tripTime;
        }
    }

    public String getFirstStation() {
        return firstStation;
    }

    public void setFirstStation(String firstStation) {
        if (firstStation ==null) {
            this.firstStation = "начальная";
        } else {
            this.tripTime = tripTime;
        }
    }

    public String getLastStation() {
        return lastStation;
    }

    public void setLastStation(String lastStation) {
        if (lastStation ==null ) {
            this.lastStation = "конечная";
        } else {
            this.lastStation = lastStation;
        }
    }

    public int getTrainLenght() {
        return trainLenght;
    }

    public void setTrainLenght(int trainLenght) {
        if (trainLenght <=0){
            this.trainLenght = 1;
        }
        this.trainLenght = trainLenght;
    }
    public void refill(){
        System.out.println("нужно заправлять дизелем");
    }
}
