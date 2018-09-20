package org.squashtest.ta.selenium.Config;

public class Page
{
    private String totalElements;

    private String number;

    private String totalPages;

    private String size;

    public String getTotalElements ()
    {
        return totalElements;
    }

    public void setTotalElements (String totalElements)
    {
        this.totalElements = totalElements;
    }

    public String getNumber ()
    {
        return number;
    }

    public void setNumber (String number)
    {
        this.number = number;
    }

    public String getTotalPages ()
    {
        return totalPages;
    }

    public void setTotalPages (String totalPages)
    {
        this.totalPages = totalPages;
    }

    public String getSize ()
    {
        return size;
    }

    public void setSize (String size)
    {
        this.size = size;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [totalElements = "+totalElements+", number = "+number+", totalPages = "+totalPages+", size = "+size+"]";
    }
}
			