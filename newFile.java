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
		System.out.println("");
		return rule;
	}

	public int getValue() {
		System.out.println("");
		return value;
	}

	public String getOption() {
		System.out.println("");
		return option;
	}

	public String getCondition() {
		System.out.println("");
		System.out.println("");
		return condition;
	}

	@Override
	public String toString() {
		System.out.println("");
		System.out.println("");
		return "QualityGateProfile [rule=" + rule + ", value="
				+ value + ", option=" + option + ", condition="
				+ condition + "]";
	}
}
