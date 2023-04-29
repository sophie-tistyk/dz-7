public enum SolarSystem {

    MERCURY(1, 0, 2439.7, null),
    VENUS(2, 100, 6051.8, MERCURY),
    EARTH(3, 200, 6371, VENUS),
    MARS(4, 300, 3389.5, EARTH),
    JUPITER(5, 400, 69911, MARS),
    SATURN(6, 500, 58232, JUPITER),
    URANUS(7, 600, 25362, SATURN),
    NEPTUNE(8, 700, 24622, URANUS);

    private final int serialNumberFromSun;
    private final int distanceFromPreviousPlanet;
    private final int distanceFromSun;
    private final double radius;
    private final SolarSystem previousPlanet;

    SolarSystem(int serialNumberFromSun, int distanceFromPreviousPlanet,
                double radius, SolarSystem previousPlanet) {
        this.serialNumberFromSun = serialNumberFromSun;
        this.distanceFromPreviousPlanet = distanceFromPreviousPlanet;
        this.distanceFromSun = previousPlanet != null ? previousPlanet.distanceFromSun + distanceFromPreviousPlanet : distanceFromPreviousPlanet;
        this.radius = radius;
        this.previousPlanet = previousPlanet;
    }

    public int getDistanceFromSun() {
        return distanceFromSun;
    }


}
