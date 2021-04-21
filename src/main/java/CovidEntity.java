import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.IOException;
import java.io.Serializable;

import com.fasterxml.jackson.databind.ObjectMapper;

public class CovidEntity implements Serializable {

    public CovidEntity deepClone() {
        ObjectMapper objectMapper = new ObjectMapper();

        // Exemple de désérialisation
        CovidEntity myNewEntity = new CovidEntity();

        try {
            String deserializedEntity = objectMapper.writeValueAsString(this);
            myNewEntity = objectMapper.readValue(deserializedEntity, CovidEntity.class);
        } catch (IOException e) {
            System.out.println("ERROR in cloning object");
        }

        return myNewEntity;
    }

    @Override
    public String toString() {
        return "CovidEntity{" +
                "updated=" + updated +
                ", country='" + country + '\'' +
                ", countryInfo=" + countryInfo +
                ", cases=" + cases +
                ", todayCases=" + todayCases +
                ", deaths=" + deaths +
                ", todayDeaths=" + todayDeaths +
                ", recovered=" + recovered +
                ", todayRecovered=" + todayRecovered +
                ", active=" + active +
                ", critical=" + critical +
                ", casesPerOneMillion=" + casesPerOneMillion +
                ", deathsPerOneMillion=" + deathsPerOneMillion +
                ", tests=" + tests +
                ", testsPerOneMillion=" + testsPerOneMillion +
                ", population=" + population +
                ", continent='" + continent + '\'' +
                ", oneCasePerPeople=" + oneCasePerPeople +
                ", oneDeathPerPeople=" + oneDeathPerPeople +
                ", oneTestPerPeople=" + oneTestPerPeople +
                ", activePerOneMillion=" + activePerOneMillion +
                ", recoveredPerOneMillion=" + recoveredPerOneMillion +
                ", criticalPerOneMillion=" + criticalPerOneMillion +
                '}';
    }

    private class CountryInfo {
        public Integer _id;
        public String iso2;
        public String iso3;

        @Override
        public String toString() {
            return "CountryInfo{" +
                    "_id=" + _id +
                    ", iso2='" + iso2 + '\'' +
                    ", iso3='" + iso3 + '\'' +
                    ", latitude=" + latitude +
                    ", longitude=" + longitude +
                    ", flag='" + flag + '\'' +
                    '}';
        }

        @JsonProperty(value = "lat")
        public Integer latitude;

        @JsonProperty(value = "long")
        public Integer longitude;

        public String flag;

        public CountryInfo() {}
    }

    public CovidEntity() {}

    public Long getUpdated() {
        return updated;
    }

    public void setUpdated(Long updated) {
        this.updated = updated;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public CountryInfo getCountryInfo() {
        return countryInfo;
    }

    public void setCountryInfo(CountryInfo countryInfo) {
        this.countryInfo = countryInfo;
    }

    public Integer getCases() {
        return cases;
    }

    public void setCases(Integer cases) {
        this.cases = cases;
    }

    public Integer getTodayCases() {
        return todayCases;
    }

    public void setTodayCases(Integer todayCases) {
        this.todayCases = todayCases;
    }

    public Integer getDeaths() {
        return deaths;
    }

    public void setDeaths(Integer deaths) {
        this.deaths = deaths;
    }

    public Integer getTodayDeaths() {
        return todayDeaths;
    }

    public void setTodayDeaths(Integer todayDeaths) {
        this.todayDeaths = todayDeaths;
    }

    public Integer getRecovered() {
        return recovered;
    }

    public void setRecovered(Integer recovered) {
        this.recovered = recovered;
    }

    public Integer getTodayRecovered() {
        return todayRecovered;
    }

    public void setTodayRecovered(Integer todayRecovered) {
        this.todayRecovered = todayRecovered;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Integer getCritical() {
        return critical;
    }

    public void setCritical(Integer critical) {
        this.critical = critical;
    }

    public Integer getCasesPerOneMillion() {
        return casesPerOneMillion;
    }

    public void setCasesPerOneMillion(Integer casesPerOneMillion) {
        this.casesPerOneMillion = casesPerOneMillion;
    }

    public Integer getDeathsPerOneMillion() {
        return deathsPerOneMillion;
    }

    public void setDeathsPerOneMillion(Integer deathsPerOneMillion) {
        this.deathsPerOneMillion = deathsPerOneMillion;
    }

    public Integer getTests() {
        return tests;
    }

    public void setTests(Integer tests) {
        this.tests = tests;
    }

    public Integer getTestsPerOneMillion() {
        return testsPerOneMillion;
    }

    public void setTestsPerOneMillion(Integer testsPerOneMillion) {
        this.testsPerOneMillion = testsPerOneMillion;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public Integer getOneCasePerPeople() {
        return oneCasePerPeople;
    }

    public void setOneCasePerPeople(Integer oneCasePerPeople) {
        this.oneCasePerPeople = oneCasePerPeople;
    }

    public Integer getOneDeathPerPeople() {
        return oneDeathPerPeople;
    }

    public void setOneDeathPerPeople(Integer oneDeathPerPeople) {
        this.oneDeathPerPeople = oneDeathPerPeople;
    }

    public Integer getOneTestPerPeople() {
        return oneTestPerPeople;
    }

    public void setOneTestPerPeople(Integer oneTestPerPeople) {
        this.oneTestPerPeople = oneTestPerPeople;
    }

    public Float getActivePerOneMillion() {
        return activePerOneMillion;
    }

    public void setActivePerOneMillion(Float activePerOneMillion) {
        this.activePerOneMillion = activePerOneMillion;
    }

    public Float getRecoveredPerOneMillion() {
        return recoveredPerOneMillion;
    }

    public void setRecoveredPerOneMillion(Float recoveredPerOneMillion) {
        this.recoveredPerOneMillion = recoveredPerOneMillion;
    }

    public Float getCriticalPerOneMillion() {
        return criticalPerOneMillion;
    }

    public void setCriticalPerOneMillion(Float criticalPerOneMillion) {
        this.criticalPerOneMillion = criticalPerOneMillion;
    }

    private Long updated;
    private String country;
    private CountryInfo countryInfo;
    private Integer cases;
    private Integer todayCases;
    private Integer deaths;
    private Integer todayDeaths;
    private Integer recovered;
    private Integer todayRecovered;
    private Integer active;
    private Integer critical;
    private Integer casesPerOneMillion;
    private Integer deathsPerOneMillion;
    private Integer tests;
    private Integer testsPerOneMillion;
    private Integer population;
    private String continent;
    private Integer oneCasePerPeople;
    private Integer oneDeathPerPeople;
    private Integer oneTestPerPeople;
    private Float activePerOneMillion;
    private Float recoveredPerOneMillion;
    private Float criticalPerOneMillion;
}
