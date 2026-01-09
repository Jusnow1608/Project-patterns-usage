package builder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BusinessPlan {
    public String persona;
    public boolean isUnregistered;
    public boolean isVatActive;

    public BusinessPlan(String persona, boolean isUnregistered, boolean isVatActive) {
        this.persona = persona;
        this.isUnregistered = isUnregistered;
        this.isVatActive = isVatActive;
    }
}