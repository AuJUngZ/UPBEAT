package Game;

public interface Configuration {
    long rows();
    long cols();
    long initialPlanMinutes();
    long initialPlanSeconds();
    long initialBudget();
    long initialDeposit();
    long revisionPlanMinutes();
    long revisionPlanSeconds();
    long revisionCost();
    long maxDeposit();
    long interestPercentage();
}
