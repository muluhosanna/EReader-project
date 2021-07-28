package com.ereader.classes;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
public class ProjectSampleOrder {
    private ArrayList<EReaderInterface> order;
    private Scanner userIn;
    private ProjectInventory inventory;
    private EReaderInterface orderChoice;
    public ProjectSampleOrder(){
        order = new ArrayList<>();
        userIn = new Scanner(System.in);
        inventory = new ProjectInventory();
    }
    public void welcomeMessage(){
        System.out.println("Welcome  to E-Reader Company ");
        System.out.println("All E-Readers are coming with Charger ,Manual," +
                "Head phone jack");
    }
    public void buyEReader(){
        System.out.println("What kind of E-Reader would you like?");
        System.out.println("your options are:\nE7-E-lnk7 inch\n" +
                "E9-E-lnk9 inch\n" +"E12-E-lnk12 inch\n" +
                "O7-Old display 7 inch\n" + "O9-Old Display 9 inch\n" +
                "O12-Old Display 12 inch");
        String type = userIn.next();
        validateEReaderType(type.toUpperCase());
        eReaderColor();
        order.add(orderChoice);
        orderDone();

    }

    private void orderDone() {
        System.out.println("Does this complete your order? yes or no");
        String  val = userIn.next();
        switch (val.toLowerCase()){
            case "yes":
                new ProjectSampleReceipt(order);
                break;
            case "no":
                orderChoice = null;
                buyEReader();
                break;
            default:
                System.out.println("you have made an invalid choice");
                orderDone();

        }
    }

    private void eReaderColor() {
        System.out.println("What color would you like ?");
        System.out.println("BLACK, WHITE, ROSEGOLD,CANDY, BLUE");
        String color = userIn.next();
        validateColorChoice(color);
    }

    private void validateColorChoice(String color) {
        switch (color){
            case "BLACK":
                orderChoice.paint(EReaderColor.BLACK);
                break;
            case "White":
                orderChoice.paint(EReaderColor.WHITE);
                break;
            case "RoseGold":
                orderChoice.paint(EReaderColor.ROSEGOLD);
                break;
            case "Blue":
                orderChoice.paint(EReaderColor.BLUE);
                break;
            case "candy":
                orderChoice.paint(EReaderColor.CANDY);
                break;
            default:
                System.out.println("You have entered an in correct color");
                eReaderColor();
                break;
        }

    }

    private void validateEReaderType(String ereaderType) {
        switch (ereaderType){
            case "E7":
                orderChoice = inventory.getSevenList().get(0);
                inventory.getNineList().remove(0);
                break;
            case "E9":
                orderChoice = inventory.getNineList().get(0);
                inventory.getNineList().remove(0);
                break;
            case "E12":
                orderChoice = inventory.getTwelvesList().get(0);
                inventory.getTwelvesList().remove(0);
                break;
            case "O7":
                orderChoice = inventory.getOldSevenList().get(0);
                inventory.getOldSevenList().remove(0);
                break;
            case "O9":
                orderChoice = inventory.getOldNineList().get(0);
                inventory.getOldNineList().remove(0);
                break;
            case "O12":
                orderChoice = inventory.getOldTwelveList().get(0);
                inventory.getOldTwelveList().remove(0);
                break;
            default:
                System.out.println("you have entered an in correct value");
                buyEReader();



        }



    }


}
