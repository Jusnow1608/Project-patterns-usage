package builder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //BusinessPlan plan = new BusinessPlan("FREELANCER", true, false);
        BusinessPlan plan = new BusinessPlan("SHOP", false, true);

        System.out.println("PLAN FOR: " + plan.getPersona());

        if (plan.getPersona().equals("FREELANCER")) {
            System.out.println("- [TASK] Create Portfolio");
        } else if (plan.getPersona().equals("SHOP")) {
            System.out.println("- [TASK] Select E-commerce Platform");
        }

        if (plan.isUnregistered()) {
            System.out.println("- [TASK] Monitor Revenue Limit (Unregistered Activity)");
        } else {
            System.out.println("- [TASK] Register in CEIDG");
        }

        if (plan.isVatActive()) {
            System.out.println("- [TASK] VAT-R Registration");
        }
    }
}