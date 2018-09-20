package org.squashtest.ta.selenium.Config;

import org.squashtest.ta.selenium.Config.Page;

import java.util.List;

public class Datasets
{
    private String id;

    private String _type;

    private List<Parameter_values> parameter_values;

    private String name;

    private _links _links;

    private List<Parameters> parameters;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String get_type ()
    {
        return _type;
    }

    public void set_type (String _type)
    {
        this._type = _type;
    }

    public List<Parameter_values> getParameter_values ()
    {
        return parameter_values;
    }

    public void setParameter_values (List<Parameter_values> parameter_values)
    {
        this.parameter_values = parameter_values;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public _links get_links ()
    {
        return _links;
    }

    public void set_links (_links _links)
    {
        this._links = _links;
    }

    public List<Parameters> getParameters ()
    {
        return parameters;
    }

    public void setParameters (List<Parameters> parameters)
    {
        this.parameters = parameters;
    }

    @Override
    public String toString()
    {
        return "Datasetspojo [id = "+id+", _type = "+_type+", parameter_values = "+parameter_values+", name = "+name+", _links = "+_links+", parameters = "+parameters+"]";
    }
}
			