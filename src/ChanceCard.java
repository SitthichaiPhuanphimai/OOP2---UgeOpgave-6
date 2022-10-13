public class ChanceCard {

    String name;
    int cost;
    int income;


    public ChanceCard(String name, int cost, int income) {

        this.name = name;
        this.cost = cost;
        this.income = income;
    }


    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getIncome() {
        return income;
    }

    @Override
    public String toString() {
        return name;
    }
}


