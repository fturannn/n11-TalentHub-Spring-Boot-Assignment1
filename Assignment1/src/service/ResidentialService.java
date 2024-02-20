package service;

import ResidentialTypes.House;
import ResidentialTypes.ResidentialModel;
import ResidentialTypes.SummerHouse;
import ResidentialTypes.Villa;

import java.util.ArrayList;
import java.util.List;

public class ResidentialService {

    private final ResidentialLists residentialLists;

    public ResidentialService(ResidentialLists residentialLists) {
        this.residentialLists = residentialLists;
    }

    public int getTotalHousePrice() {
        int totalPrice = 0;

        for(House house : residentialLists.getHouseList()) {
            totalPrice += house.getPrice();
        }

        return totalPrice;
    }

    public int getTotalVillaPrice() {
        int totalPrice = 0;

        for(Villa villa : residentialLists.getVillaList()) {
            totalPrice += villa.getPrice();
        }

        return totalPrice;
    }

    public int getTotalSummerHousePrice() {
        int totalPrice = 0;

        for(SummerHouse summerHouse : residentialLists.getSummerHouseList()) {
            totalPrice += summerHouse.getPrice();
        }

        return totalPrice;
    }

    public int getTotalOfAllResidential() {
        return getTotalHousePrice() + getTotalVillaPrice() + getTotalSummerHousePrice();
    }

    public double getAverageHouseArea() {
        int totalArea = 0;
        for(House house : residentialLists.getHouseList()) {
            totalArea += house.getArea();
        }
        return (double) totalArea / residentialLists.getHouseList().size();
    }

    public double getAverageVillaArea() {
        int totalArea = 0;
        for(Villa villa : residentialLists.getVillaList()) {
            totalArea += villa.getArea();
        }
        return (double) totalArea / residentialLists.getVillaList().size();
    }

    public double getAverageSummerHouseArea() {
        int totalArea = 0;
        for(SummerHouse summerHouse : residentialLists.getSummerHouseList()) {
            totalArea += summerHouse.getArea();
        }
        return (double) totalArea / residentialLists.getSummerHouseList().size();
    }

    public double getAverageAreaOfAllResidential() {
        double totalAverageOfAllResidential = getAverageHouseArea() + getAverageVillaArea() + getAverageSummerHouseArea();
        return totalAverageOfAllResidential / 3;
    }

    public List<String> filterResidentialByNumberOfRoomsAndHalls (int numOfRoom, int numOfHall) {
        List<ResidentialModel> allResidentials = new ArrayList<>();
        List<String> filteredResidentials = new ArrayList<>();

        allResidentials.addAll(residentialLists.getHouseList());
        allResidentials.addAll(residentialLists.getVillaList());
        allResidentials.addAll(residentialLists.getSummerHouseList());

        for(ResidentialModel residential : allResidentials) {
            if(residential.getNumOfRooms() == numOfRoom && residential.getNumOfHalls() == numOfHall) {
                filteredResidentials.add(residential.getName());
            }
        }

        return filteredResidentials;
    }
}
