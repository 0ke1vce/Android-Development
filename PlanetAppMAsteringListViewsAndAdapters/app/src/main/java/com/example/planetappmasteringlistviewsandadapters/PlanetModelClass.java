package com.example.planetappmasteringlistviewsandadapters;



//This class is acting as Model Class for our list view
public class PlanetModelClass {

//    Attributes
    private String planet;
    private String  moon;
    private int planetImage;  // that represent image resource
// Point to be NOTED-: Image are not stored inside int variables.
// Rather resource identifiers represent as INT value are use to effectively manage and access image.


//    Creating Our Constructor
    public PlanetModelClass(String planet, String moon, int planetImage) {
        this.planet = planet;
        this.moon = moon;
        this.planetImage = planetImage;
    }
//   Creating Getter and setter to access the attributes of model class
    public int getPlanetImage() {
        return planetImage;
    }

    public void setPlanetImage(int planetImage) {
        this.planetImage = planetImage;
    }

    public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public String getMoon() {
        return moon;
    }

    public void setMoon(String moon) {
        this.moon = moon;
    }




}
