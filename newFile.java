public class QualityGateStatus {
	private String rule;
	private int value;
	private String option;
	private String condition;

	public QualityGateStatus(@JsonProperty("rule") String rule, @JsonProperty("value") int value,
                             @JsonProperty("option") String option,
							 @JsonProperty("condition") String condition) {
		super();
		this.rule = rule;
		this.value = value;
		this.option = option;
		this.condition = condition;
	}

	public String getRule() {
		return rule;
	}

	public int getValue() {
		System.out.println("");
		return value;
	}

	public String getOption() {
		return option;
	}

	public String getCondition() {
		return condition;
	}

	@Override
	public String toString() {
		return "QualityGateProfile [rule=" + rule + ", value="
				+ value + ", option=" + option + ", condition="
				+ condition + "]";
	}
}
