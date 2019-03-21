class DayThree {
    static void solve(double meal_cost, int tip_percent, int tax_percent) {

            double tip = (meal_cost*tip_percent)/100;
            double tax = (meal_cost*tax_percent)/100;
            double totalCost = meal_cost+tip+tax;
            System.out.print(Math.round(totalCost));
    }

    static void dayThree(int n){
        if (n%2==1) {
            System.out.print("Weird");
        }else if (n%2==0 && n>=2&& n<=5){
            System.out.print("Not Weird");
        }else if (n%2==0 && n>=6 && n<=20) {
            System.out.print("Weird");
        }else if (n%2==0 && n>20) {
            System.out.print("Not Weird");
        }
    }
    public static void main(String[] args) {
        solve(10.25,17,5);
    }
}