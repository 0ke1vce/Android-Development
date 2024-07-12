package com.example.volumecalculatorgridviewandmasteringadapters;

import android.widget.ArrayAdapter;

public class ModelClass  {
         String Shapename;
         int Shapeimage;

    public ModelClass(String shapename, int shapeimage) {
        Shapename = shapename;
        Shapeimage = shapeimage;
    }

    public String getShapename() {
        return Shapename;
    }

    public void setShapename(String shapename) {
        Shapename = shapename;
    }

    public int getShapeimage() {
        return Shapeimage;
    }

    public void setShapeimage(int shapeimage) {
        Shapeimage = shapeimage;
    }








}
