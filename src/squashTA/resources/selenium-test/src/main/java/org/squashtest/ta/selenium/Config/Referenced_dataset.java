package org.squashtest.ta.selenium.Config;

public class Referenced_dataset
{
    private String id;

    private String _type;

    private String name;

    private _links _links;

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

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", _type = "+_type+", name = "+name+", _links = "+_links+"]";
    }
}