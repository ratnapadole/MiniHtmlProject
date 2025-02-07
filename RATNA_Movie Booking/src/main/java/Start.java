import java.util.*;

/*
For detailed instructions, please refer to the README file.
It contains all the necessary guidelines and information for submitting and working with this project.
 */

public class Start extends AvailableSeat {
    //you may remove the static keyword if required, and please DO NOT CREATE a new object for scanner class
    public static Scanner scanner = new Scanner(System.in);
    //Prices for seats
   static int platinumPrice=320;
   static int goldPrice=280;
   static int silverPrice=240;

    //calculate percent of all values -->formula is (percentvalue / 100)
    // I take calculate percent value directly
    //Tax Rates define
    double serviceTax = 0.14;
    double swachhBharatCess = 0.005;
    double krishiKalyanCess = 0.005;

    //seat book amount
    double subTotal= 0.0;

    //revenue and taxes define
    static double totalRevenue = 0.0;
    double totalServiceTax = 0.0;
    double totalSwachhBharatCess = 0.0;
    double totalKrishiKalyanCess = 0.0;

    public static void main(String[] args) {
        //your code from here......

        Start obj = new Start();
        obj.assignSeatForShow();

        //System.out.println("rrrrrr="+obj.no);

        obj.selectShowNo();
        obj.showTotalSales();
    }

    void selectShowNo(){
        System.out.println("Enter Show no: ");
        int showNo = scanner.nextInt();
        switch (showNo){
            case 1: displayShowSeat(show1Seats,showNo);
                    break;
            case 2: displayShowSeat(show2Seats,showNo);
                    break;
            case 3: displayShowSeat(show3Seats,showNo);
                    break;
            default: System.out.println("Invalid show no,please give valid show no.");
                    break;
        }
    }
    void displayShowSeat(Map<String, List<String>> showSeats,int showNo){
        System.out.println("Available Seats:");

        for (Map.Entry<String, List<String>> entry : showSeats.entrySet()) {
            for (String seat : entry.getValue()) {
                System.out.print(seat + " ");
            }
            System.out.println();
        }

        System.out.print("Enter seats (with comma separated): ");
        scanner.nextLine();
        String seatInput = scanner.nextLine();
        String[] seatsToBook = seatInput.split(",");

         double subTotal = bookingSeats(showSeats, seatsToBook);
         // double subTotal = 1;
         if (subTotal > 0) {
            // Calculate taxes and total amount
            double serviceTaxCal = subTotal * serviceTax;
            double swachhBharatCessCal = subTotal * swachhBharatCess;
            double krishiKalyanCessCal = subTotal * krishiKalyanCess;
            double totalCal = subTotal + serviceTaxCal + swachhBharatCessCal + krishiKalyanCessCal;

            // Print the booking details
            // I take subTotal and Total value as round of Amount
           // remaining as it is,its show like this 12.3300044777

            System.out.println("Print: Successfully Booked - Show " + showNo);
            System.out.println("Subtotal: Rs. " + Math.round(subTotal));
            System.out.println("Service Tax @14%: Rs. " +  serviceTaxCal);
            System.out.println("Swachh Bharat Cess @0.5%: Rs. " +  swachhBharatCessCal);
            System.out.println("Krishi Kalyan Cess @0.5%: Rs. " + krishiKalyanCessCal);
            System.out.println("Total: Rs. " +  Math.round(totalCal));

            // Update the total revenue and taxes
            totalRevenue = totalRevenue + subTotal;
            totalServiceTax = totalServiceTax + serviceTaxCal;
            totalSwachhBharatCess = totalSwachhBharatCess + swachhBharatCessCal;
            totalKrishiKalyanCess = totalKrishiKalyanCess + krishiKalyanCessCal;
        }

        System.out.println("Would you like to continue (Yes/No):");
        String yesNo = scanner.nextLine();
        if(yesNo.equalsIgnoreCase("yes") ){
            selectShowNo();
        }
    }

    static double bookingSeats(Map<String, List<String>> showSeats, String[] seatsToBook) {
        double subtotal = 0;

        for (String seat : seatsToBook) {
            seat = seat.trim();

            if (showSeats.get("Platinum").remove(seat)) {
                subtotal = subtotal + platinumPrice ;
            } else if (showSeats.get("Gold").remove(seat)) {
                subtotal = subtotal +goldPrice;
            } else if (showSeats.get("Silver").remove(seat)) {
                subtotal = subtotal + silverPrice;
            } else {
                System.out.println("Print: "+seat + " Not available, Please select different seats");
                return 0;  // Return 0 if a seat is unavailable
            }
        }
        return subtotal;
    }

    void showTotalSales(){
        System.out.println("Total Sales: ");
        System.out.println("Revenue : Rs.  "+Math.round(totalRevenue));
        System.out.println("Service Tax : Rs.  "+totalServiceTax);
        System.out.println("Swachh Bharat Cess : Rs.  "+totalSwachhBharatCess);
        System.out.println("Krishi Kalyan Cess : Rs.  "+totalKrishiKalyanCess);
    }
}
