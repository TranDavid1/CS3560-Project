public abstract class PlanetaryBody
{
    public abstract double getMass();
    public abstract void setMass( double m );
    public abstract double getSize();
    public abstract void setSize( double s );
    public abstract double getDiameter();
    public abstract void setDiameter( double d );
    public abstract double getDensity();
    public abstract void setDensity( double d );
    public abstract double getRotation();
    public abstract void setRotation( double r );
    public abstract double getAxisTilt();
    public abstract void setAxisTilt( double at );
    public abstract double getSurfaceGravity();
    public abstract void setSurfaceGravity( double sg );
    public abstract double getComposition();
    public abstract void setComposition( double c );
    public abstract String getPosition();
    public abstract void setPosition( String p );
    public abstract double getOrbitalSpeed();
    public abstract void setOrbitalSpeed( double os );
    public abstract void setOrbitalSpeed( String os );
}
