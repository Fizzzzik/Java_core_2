package homework3.basiclvl;

public class Financialrecord {
    public static int count = 0;

    public int incomes = 0;
    public int outcomes = 0;

    public Financialrecord(int recordIncomes, int recordOutcomes) {
        this.incomes = recordIncomes;
        this.outcomes = recordOutcomes;
        count++;
        //    System.out.println();
        //    System.out.println("Доход = " + this.incomes + ", расход = " + this.outcomes);


    }

    public String getIncomes() {
        return "доходы = " + this.incomes;
    }

    public String getOutcomes() {
        return "расходы = " + this.outcomes;
    }

    public void setIncomes(int newIncomes) {
        this.incomes = newIncomes;
    }

    public void setOutcomes(int newOutcomes) {
        this.outcomes = newOutcomes;
    }
}


