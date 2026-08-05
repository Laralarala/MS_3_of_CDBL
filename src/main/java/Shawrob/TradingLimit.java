package Shawrob;

public class TradingLimit {

    private String ruleName , effectiveDate;
    private float threshold;

    public TradingLimit(String ruleName, String effectiveDate, float threshold) {
        this.ruleName = ruleName;
        this.effectiveDate = effectiveDate;
        this.threshold = threshold;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public float getThreshold() {
        return threshold;
    }

    public void setThreshold(float threshold) {
        this.threshold = threshold;
    }

    @Override
    public String toString() {
        return "TradingLimit{" +
                "ruleName='" + ruleName + '\'' +
                ", effectiveDate='" + effectiveDate + '\'' +
                ", threshold=" + threshold +
                '}';
    }
}
