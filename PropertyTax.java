public class PropertyTax{
    public double getPropertyTax(Property p){
        double tax = 100;
        if (p.getMarketValue() > 650000) {
            tax = tax + (p.getMarketValue()*.04);
        } else if (p.getMarketValue() > 400001) {
            tax = tax + (p.getMarketValue()*.02);
        } else if (p.getMarketValue()> 150000) {
            tax = tax + (p.getMarketValue()*.01);
        }
        if (p.getLocationCategory().equals("City")) {
            tax = tax + 100;
        } else if (p.getLocationCategory().equals("Large town")) {
            tax = tax + 80;
        } else if (p.getLocationCategory().equals("Small town")) {
            tax = tax + 60;
        } else if (p.getLocationCategory().equals("Village")){
            tax = tax + 50;
        } else if (p.getLocationCategory().equals("Countryside")) {
            tax = tax + 25;
        }
        if (!p.getPpr()){
            tax = tax + 100;
        }
        return tax;
        // Need to add property tax unpaid thing
    }
}
