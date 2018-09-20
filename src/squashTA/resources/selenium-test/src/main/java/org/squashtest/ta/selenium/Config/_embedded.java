package org.squashtest.ta.selenium.Config;


import java.util.List;

public class _embedded
{
    private List<Datasets> datasets;

    public List<Datasets> getDatasets ()
    {
        return datasets;
    }

    public void setDatasets (List<Datasets> datasets)
    {
        this.datasets = datasets;
    }

    @Override
    public String toString()
    {
        return "Embeddes [datasets = "+datasets.toString()+"]";
    }
}