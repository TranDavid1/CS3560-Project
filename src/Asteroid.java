public abstract class Asteroid extends PlanetaryBody
{
    double mass;
    double size;
    double diameter;
    double density;
    double rotation;
    double axisTilt;
    double surfaceGravity;
    double composition;
    String position;
    double orbitalSpeed;
    String orbitsStar;

    @Override
    public double getMass() {
        return mass;
    }

    @Override
    public void setMass(double m) {
        mass = m;
    }

    @Override
    public double getSize() {
        return size;
    }

    @Override
    public void setSize(double s) {
        size = s;
    }

    @Override
    public double getDiameter() {
        return diameter;
    }

    @Override
    public void setDiameter(double d) {
        diameter = d;
    }

    @Override
    public double getDensity() {
        return density;
    }

    @Override
    public void setDensity(double d) {
        density = d;
    }

    @Override
    public double getRotation() {
        return rotation;
    }

    @Override
    public void setRotation(double r) {
        rotation = r;
    }

    @Override
    public double getAxisTilt() {
        return axisTilt;
    }

    @Override
    public void setAxisTilt(double at) {
        axisTilt = at;
    }

    @Override
    public double getSurfaceGravity() {
        return surfaceGravity;
    }

    @Override
    public void setSurfaceGravity(double sg) {
        surfaceGravity = sg;
    }

    @Override
    public double getComposition() {
        return composition;
    }

    @Override
    public void setComposition(double c) {
        composition = c;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public void setPosition(String p) {
        position = p;
    }

    @Override
    public double getOrbitalSpeed() {
        return orbitalSpeed;
    }

    @Override
    public void setOrbitalSpeed(double os) {
        orbitalSpeed = os;
    }

    public String getOrbitsStar() {
        return orbitsStar;
    }

    public void setOrbitsStar( String os ) {
        orbitsStar = os;
    }
}
