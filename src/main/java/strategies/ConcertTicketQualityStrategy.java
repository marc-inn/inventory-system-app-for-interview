package strategies;

/**
 * Created by Marcin on 2015-12-17.
 */
public class ConcertTicketQualityStrategy extends SimpleQualityStrategy {

    @Override
    public int countNewQuality(int sellIn, int quality) {
        if (sellIn < 0) {
            return MINIMUM_QUALITY;
        } else if (sellIn < 5) {
            return quality + 3;
        } else if (sellIn < 10) {
            return quality + 2;
        } else if (quality < MAXIMUM_QUALITY) {
            return quality + 1;
        } else {
            return quality;
        }
    }
}
