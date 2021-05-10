package task1_2;

import static task1_2.Continents.*;

public enum Countries {
    UKRAINE("Ukraine", EUROPE),
    POLAND("Poland", EUROPE),
    FRANCE("France", EUROPE),
    ISRAEL("Israel", ASIA),
    AUSTRALIA("Australia", OCEANIA),
    USA("USA", NORTH_AMERICA),
    ARGENTINA("Argentina", SOUTH_AMERICA);

    private final String country;
    private final Continents continent;

    Countries(String country, Continents continent) {
        this.country = country;
        this.continent = continent;
    }

    public String getCountry() {
        return country;
    }

    public Continents getContinent() {
        return continent;
    }

    @Override
    public String toString() {
        return this.country;
    }
}
