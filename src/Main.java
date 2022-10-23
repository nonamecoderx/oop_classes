import transport.Bus;
import transport.Car;
import transport.Train;

public class Main {
    public static void main(String[] args) {
        //Lada Granta, 2015 год выпуска, сборка в России, желтого цвета, объем двигателя — 1,7 л.
        Car lada = new Car("Lada", "Granta", 2015, "Россия", "желтый", 160, "fg090sd900", "седан", 5);
        //Audi A8 50 L TDI quattro, 2020 год выпуска, сборка в Германии, черный цвет кузова, объем двигателя — 3,0 л.
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "черный", 240, "ам203мр567", "седан", 5);
        //BMW Z8, сборка в Германии в 2021 году, черный цвет кузова, объем — 3,0 л.
        Car bmw = new Car("BMW", "Z8", 2021, "Германия", "черный", 250, "nx450gh670", "седан", 5);
        //Kia Sportage 4-го поколения, 2018 год выпуска, сборка в Южной Корее, цвет кузова — красный, объем двигателя — 2,4 л.
        Car kia = new Car("KIA", "Sportage 4-го поколения", 2018, "Южная корея", "красный", 310, "ом654ка766", "седан", 5);
        //Hyundai Avante, сборка в Южной Корее, цвет кузова — оранжевый, объем двигателя — 1,6 л, год выпуска — 2016.
        Car hyundai = new Car("Hyundai", "Avante", 2016, "Южная корея", "оранжевый", 240, "мк565ап787", "седан", 5);

        Train lastochka = new Train("Ласточка", "b-901", 2011, "Россия", "красный", 301, 3500, 0, "Белорусский вокзал", "Минск-пассажирский", 11);
        Train leningrad = new Train("Ленинград", "в-125", 2019, "Россия", "белый", 270, 1700, 56, "Ленинградский вокзал", "Ленинград-пассажирский", 8);

        Bus bogdan = new Bus("Богдан", "t-34", 2000, "Россия", "Белый", 170);
        Bus ikarus = new Bus("Икарус", "t-35", 2010, "Россия", "Белый", 180);
        Bus zaz = new Bus("Заз", "t-36", 2003, "Россия", "Белый", 190);
        printInfo(lada);
        printInfo(audi);
        printInfo(bmw);
        printInfo(kia);
        printInfo(hyundai);

        printInfoTrain(lastochka);
        printInfoTrain(leningrad);

        printInfoBus(bogdan);
        printInfoBus(ikarus);
        printInfoBus(zaz);

        bogdan.refill();
        lastochka.refill();
        audi.refill();

    }

    public static void printInfoBus(Bus bus) {
        System.out.println(
                bus.getBrand() + " " + bus.getModel() + " " + bus.getProductionYear() + " " + bus.getProductionCountry() + " " + bus.getColor() + " " + bus.getMaxSpeed()
        );
    }


    public static void printInfoTrain(Train train) {
        System.out.println(
                train.getBrand() + " " + train.getModel() +
                        ", год выпуска: " + train.getProductionYear() +
                        ", страна сборки: " + train.getProductionCountry() +
                        ", цвет паровоза: " + train.getColor() +
                        ", максимальная скорость: " + train.getMaxSpeed() +
                        ", начальная станция: " + train.getFirstStation() +
                        ", конечная станция: " + train.getLastStation() +
                        ", время в пути: " + train.getTripTime() +
                        ", цена поездки: " + train.getTripPrice() +
                        ", число вагонов: " + train.getTrainLenght());
    }

    public static void printInfo(Car car) {
        System.out.println(
                car.getBrand() + " " + car.getModel() +
                        ", год выпуска: " + car.getProductionYear() +
                        ", страна сборки: " + car.getProductionCountry() +
                        ", цвет кузова: " + car.getColor() +
                        ", объем двигателя: " + car.getEngineVolume() +
                        ", коробка передач: " + car.getGears() +
                        ", тип кузова: " + car.getTypeOfBody() +
                        ", рег номер: " + car.getRegNumber() +
                        ", кол-во мест: " + car.getSeatsCount() +
                        " " + (car.isSummerTyres() ? "летняя" : "зимняя") + " резина, "
                        + (car.getKey().isWithoutKeyAccess() ? " бесключевой доступ" : "ключевой доступ") + ", " +
                        (car.getKey().isRemoteRunEngine() ? " удаленный запуск" : "обычный запуск") +
                        ", номер страховки: " + car.getInsurance().getNumber() +
                        ", стоимость страховки: " + car.getInsurance().getCost() +
                        ", срок действия: " + car.getInsurance().getExpireDate()

        );
    }
}