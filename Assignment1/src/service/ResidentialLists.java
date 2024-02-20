package service;

import ResidentialTypes.House;
import ResidentialTypes.SummerHouse;
import ResidentialTypes.Villa;

import java.util.ArrayList;
import java.util.List;

public class ResidentialLists {

    public List<House> getHouseList() {
        List<House> houseList = new ArrayList<>();

        houseList.add(new House(25000, 120, 2, 1, "House 1"));
        houseList.add(new House(35000, 150, 3, 1, "House 2"));
        houseList.add(new House(45000, 180, 4, 2, "House 3"));

        return houseList;
    }

    public List<Villa> getVillaList() {
        List<Villa> villaList = new ArrayList<>();

        villaList.add(new Villa(35000, 180, 3, 1, "Villa 1"));
        villaList.add(new Villa(45000, 210, 5, 2, "Villa 2"));
        villaList.add(new Villa(55000, 250, 6, 2, "Villa 3"));

        return villaList;
    }

    public List<SummerHouse> getSummerHouseList() {
        List<SummerHouse> summerHouseList = new ArrayList<>();

        summerHouseList.add(new SummerHouse(55000, 250, 4, 1, "Summer House 1"));
        summerHouseList.add(new SummerHouse(65000, 300, 5, 2, "Summer House 2"));
        summerHouseList.add(new SummerHouse(75000, 350, 7, 3, "Summer House 3"));

        return summerHouseList;
    }
}
