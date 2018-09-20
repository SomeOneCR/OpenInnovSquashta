package org.squashtest.ta.selenium.Config;

public class Parameter_values
{
    private String parameter_value;

    private String parameter_test_case_id;

    private String parameter_id;

    private String parameter_name;

    public String getParameter_value ()
    {
        return parameter_value;
    }

    public void setParameter_value (String parameter_value)
    {
        this.parameter_value = parameter_value;
    }

    public String getParameter_test_case_id ()
    {
        return parameter_test_case_id;
    }

    public void setParameter_test_case_id (String parameter_test_case_id)
    {
        this.parameter_test_case_id = parameter_test_case_id;
    }

    public String getParameter_id ()
    {
        return parameter_id;
    }

    public void setParameter_id (String parameter_id)
    {
        this.parameter_id = parameter_id;
    }

    public String getParameter_name ()
    {
        return parameter_name;
    }

    public void setParameter_name (String parameter_name)
    {
        this.parameter_name = parameter_name;
    }

    @Override
    public String toString()
    {
        return "Parameters_values [parameter_value = "+parameter_value+", parameter_test_case_id = "+parameter_test_case_id+", parameter_id = "+parameter_id+", parameter_name = "+parameter_name+"]";
    }
}