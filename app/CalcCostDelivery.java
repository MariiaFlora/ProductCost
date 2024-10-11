package app;

// Клас розрахунку вартості товару, враховуючи вартість доставки
// Клас успадковує CalcCostBase.
public class CalcCostDelivery extends CalcCostBase {

    // Вартість доставки
    private final static double deliveryPrice = 7.0;

    // Розрахунок вартості товару з урахуванням вартості доставки
    @Override
    public double calcCost(Product product) {
        return super.calcCost(product) + deliveryPrice;
    }
}