package org.squashtest.ta.selenium.Config;

import java.io.Serializable;

public class JsonObject implements Serializable {

        private Page page;

        private _links _links;

        private _embedded _embedded;

        public Page getPage ()
        {
            return page;
        }

        public void setPage (Page page)
        {
            this.page = page;
        }

        public _links get_links ()
        {
            return _links;
        }

        public void set_links (_links _links)
        {
            this._links = _links;
        }

        public _embedded get_embedded ()
        {
            return _embedded;
        }

        public void set_embedded (_embedded _embedded)
        {
            this._embedded = _embedded;
        }

        @Override
        public String toString()
        {
            return "JsonObject [page = "+page+", _links = "+_links+", _embedded = "+_embedded.toString()+"]";
        }
}

