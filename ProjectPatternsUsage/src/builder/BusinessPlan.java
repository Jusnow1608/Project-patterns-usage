package builder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BusinessPlan {
    private String persona;
    private boolean isUnregistered;
    private boolean isVatActive;

    public BusinessPlan(String persona, boolean isUnregistered, boolean isVatActive) {
        this.persona = persona;
        this.isUnregistered = isUnregistered;
        this.isVatActive = isVatActive;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public boolean isUnregistered() {
        return isUnregistered;
    }

    public void setUnregistered(boolean unregistered) {
        isUnregistered = unregistered;
    }

    public boolean isVatActive() {
        return isVatActive;
    }

    public void setVatActive(boolean vatActive) {
        isVatActive = vatActive;
    }
}