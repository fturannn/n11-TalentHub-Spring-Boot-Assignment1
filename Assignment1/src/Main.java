import service.ResidentialLists;
import service.ResidentialService;

public class Main {
    public static void main(String[] args) {

        ResidentialService residentialService = new ResidentialService(new ResidentialLists());

        System.out.println("Total House Price: $" + residentialService.getTotalHousePrice());
        System.out.println("Total Villa Price: $" + residentialService.getTotalVillaPrice());
        System.out.println("Total Summer House Price: $" + residentialService.getTotalSummerHousePrice());
        System.out.println("Total Price of All Residential: $" + residentialService.getTotalOfAllResidential());
        System.out.println("Average House Area: " + residentialService.getAverageHouseArea() + " m2");
        System.out.println("Average Villa Area: " + residentialService.getAverageVillaArea() + " m2");
        System.out.println("Average Summer House Area: " + residentialService.getAverageSummerHouseArea() + " m2");
        System.out.println("Average Area of All Residential: " + residentialService.getAverageAreaOfAllResidential() + " m2");
        System.out.println("Residentials Filtered by Number of Rooms And Halls: ");
        for(String name : residentialService.filterResidentialByNumberOfRoomsAndHalls(3,1)) {
            System.out.println(name);
        }
    }
}