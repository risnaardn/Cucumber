package com.juaracoding.cucumber.drivers.strategies;

import com.juaracoding.cucumber.utils.Constants;

import static com.juaracoding.cucumber.utils.Constants.CHROMEHEADLESS;

public class DriverStrategyImplementer {
    public static DriverStrategy chooseStrategy(String strategy) {
        switch (strategy) {
            case Constants.CHROME:
                return new Chrome();

            case CHROMEHEADLESS:
                return (DriverStrategy) new ChromeHeadless();

            case Constants.FIREFOX:
                return new Firefox();

            default:
                return null;
        }
    }
}