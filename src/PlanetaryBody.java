public interface PlanetaryBody
{
    public double getMass();
    public void setMass( double m );
    public double getSize();
    public void setSize( double s );
    public double getDiameter();
    public void setDiameter( double d );
    public double getDensity();
    public void setDensity( double d );
    public double getRotation();
    public void setRotation( double r );
    public double getAxisTilt();
    public void setAxisTilt( double at );
    public double getSurfaceGravity();
    public void setSurfaceGravity( double sg );
    public double getComposition();
    public void setComposition( double c );
    public String getPosition();
    public void setPosition( String p );
    public double getOrbitalSpeed();
    public void setOrbitalSpeed( double os );
    public void setOrbitalSpeed( String os );
}
