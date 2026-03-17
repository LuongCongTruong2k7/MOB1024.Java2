package BatDongSan;

public class Villa extends Property {
    private boolean hasPool;
    private double luxuryTax;

    public Villa(String id, String address, double area, boolean hasPool, double luxuryTax) {
        super(id, address, area);
        this.hasPool = hasPool;
        this.luxuryTax = luxuryTax;
    }

    public boolean isHasPool() {
        return hasPool;
    }

    public void setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
    }

    public double getLuxuryTax() {
        return luxuryTax;
    }

    public void setLuxuryTax(double luxuryTax) {
        this.luxuryTax = luxuryTax;
    }

    @Override
    public double rentalValue() {
        if (this.hasPool) {
            return this.getArea() * 100000 * 1.2 + this.luxuryTax;
        }
        return this.getArea() * 100000 + this.luxuryTax;
    }

    @Override
    public String toString() {
        return String.format("Villa [id=%s, address=%s, area=%.2f, hasPool=%b, luxuryTax=%.2f, rentalValue=%.2f]",
                this.getId(), this.getAddress(), this.getArea(), this.hasPool, this.luxuryTax, this.rentalValue());
    }
}
