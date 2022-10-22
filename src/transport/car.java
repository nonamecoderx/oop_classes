package transport;

import java.time.LocalDate;

public class car extends transport {
    private double engineVolume;
    private String gears;
    private final String typeOfBody;
    private String regNumber;
    private final int seatsCount;
    private boolean summerTyres;
    private Key key;
    private Insurance insurance;

    public car(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed, String regNumber, String typeOfBody, int seatsCount) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        this.regNumber = regNumber;
        this.seatsCount = seatsCount;
        this.typeOfBody = typeOfBody;
        this.summerTyres = true;
        this.key = new Key();
        this.insurance = new Insurance();
        if (gears == null) {
            this.gears = "механика";
        } else {
            this.gears = gears;
        }
        this.engineVolume = 1.6;
    }
    public car(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed, double engineVolume, String gears,
               String typeOfBody, String regNumber, int seatsCount, boolean summerTyres, Key key, Insurance insurance) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);

        this.engineVolume = engineVolume;

        this.gears = gears;


        this.regNumber = regNumber;

        if (typeOfBody == null) {
            this.typeOfBody = "седан";
        } else {
            this.typeOfBody = typeOfBody;
        }
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }
        this.seatsCount = seatsCount;
        this.summerTyres = summerTyres;
    }

    public car(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed, String typeOfBody, int seatsCount) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        this.typeOfBody = "седан";
        this.seatsCount = 5;
    }

    public String getTypeOfBody() {
        return typeOfBody;
    }

    public int getSeatsCount() {
        return seatsCount;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getGears() {
        return gears;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public void setGears(String gears) {
        if (gears == null) {
            this.gears = "механика";
        } else {
            this.gears = gears;
        }
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        if (regNumber == null) {
            this.regNumber = "x000x000";
        } else {
            this.regNumber = regNumber;
        }
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }

    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }

    public void changeTyres() {
        summerTyres = !summerTyres;
    }

    public boolean isCorrectRegNumber() {
        if (regNumber.length() != 9) {
            return false;
        }
        char[] chars = regNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        return Character.isDigit(chars[1]) && Character.isDigit(chars[2]) && Character.isDigit(chars[3]) && Character.isDigit(chars[6]) && Character.isDigit(chars[7]) && Character.isDigit(chars[8]);
    }

    @Override
    public void refill() {
        System.out.println("можно заправлять бензином, дизелем на заправке или заряжать на специальных электроду-парковках, если это электрокар");
    }

    public static class Key {
        private final boolean remoteRunEngine;
        private final boolean withoutKeyAccess;

        public Key(boolean remoteRunEngine, boolean withoutKeyAccess) {
            this.remoteRunEngine = remoteRunEngine;
            this.withoutKeyAccess = withoutKeyAccess;
        }

        public Key() {
            this(false, false);
        }

        public boolean isRemoteRunEngine() {
            return remoteRunEngine;
        }

        public boolean isWithoutKeyAccess() {
            return withoutKeyAccess;
        }
    }

    public static class Insurance {
        private final LocalDate expireDate;
        private final double cost;
        private final String number;

        public Insurance(LocalDate expireDate, double cost, String number) {
            if (expireDate == null) {
                this.expireDate = LocalDate.now().plusDays(365);
            } else {
                this.expireDate = expireDate;
            }
            this.cost = cost;
            if (number == null) {
                this.number = "123456789";
            } else {
                this.number = number;
            }
        }

        public Insurance() {
            this(null, 10_000, null);
        }

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public void checkExpireDate() {
            if (expireDate.isBefore(LocalDate.now()) || expireDate.isEqual(LocalDate.now())) {
                System.out.println("Необходимо оформить новую страховку");
            }
        }

        public void checkNumber() {
            if (number.length() != 9) {
                System.out.println("некорректный номер страховки");
            }
        }



    }

}
