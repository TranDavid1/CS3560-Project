public class Star
{
    int numbOfEntitiesInOrbit;
    double luminosity;
    double temperature;
    double surfaceGravity;
    char spectralType;
    String luminosityClass;

    public int getNumbOfEntitiesInOrbit() {
        return numbOfEntitiesInOrbit;
    }

    public void setNumbOfEntitiesInOrbit( int n ) {
        numbOfEntitiesInOrbit = n;
    }

    public double getLuminosity() {
        return luminosity;
    }

    public void setLuminosity( double l ) {
        luminosity = l;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature( double t ) {
        temperature = t;
    }

    public double getSurfaceGravity() {
        return surfaceGravity;
    }

    public void setSurfaceGravity( double sg ) {
        surfaceGravity = sg;
    }

    public char getSpectralType() {
        return spectralType;
    }

    public void setSpectralType( char st) {
        spectralType = st;
    }

    public String getLuminosityClass() {
        return luminosityClass;
    }

    public void setLuminosityClass( String lc ) {
        luminosityClass = lc;
    }
}
