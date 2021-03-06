import strategies.QualityStrategy;

/**
 * Created by Marcin on 2015-12-17.
 */
public class StrategyItem extends Item implements Cloneable {

    private QualityStrategy strategy;

    public StrategyItem(String name, int sellIn, int quality, QualityStrategy strategy) {
        super(name, sellIn, quality);
        this.strategy = strategy;
    }

    public QualityStrategy getStrategy() {
        return strategy;
    }

    @Override
    protected StrategyItem clone() throws CloneNotSupportedException {
        super.clone();
        return new StrategyItem(getName(), getSellIn(), getQuality(), getStrategy());
    }

    public void updateSellInAndQuality() {
        setSellIn(strategy.countNewSellIn(getSellIn()));
        setQuality(strategy.countNewQuality(getSellIn(), getQuality()));
    }
}
