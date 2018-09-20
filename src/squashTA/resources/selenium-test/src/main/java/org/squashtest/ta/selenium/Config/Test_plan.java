package org.squashtest.ta.selenium.Config;

public class Test_plan {
        private Executions[] executions;

        private String assigned_to;

        private Referenced_dataset referenced_dataset;

        private String id;

        private String last_executed_by;

        private String _type;

        private _links _links;

        private String execution_status;

        private Referenced_test_case referenced_test_case;

        private Iteration iteration;

        private String last_executed_on;

        public Executions[] getExecutions ()
        {
            return executions;
        }

        public void setExecutions (Executions[] executions)
        {
            this.executions = executions;
        }

        public String getAssigned_to ()
        {
            return assigned_to;
        }

        public void setAssigned_to (String assigned_to)
        {
            this.assigned_to = assigned_to;
        }

        public Referenced_dataset getReferenced_dataset ()
        {
            return referenced_dataset;
        }

        public void setReferenced_dataset (Referenced_dataset referenced_dataset)
        {
            this.referenced_dataset = referenced_dataset;
        }

        public String getId ()
        {
            return id;
        }

        public void setId (String id)
        {
            this.id = id;
        }

        public String getLast_executed_by ()
        {
            return last_executed_by;
        }

        public void setLast_executed_by (String last_executed_by)
        {
            this.last_executed_by = last_executed_by;
        }

        public String get_type ()
        {
            return _type;
        }

        public void set_type (String _type)
        {
            this._type = _type;
        }

        public _links get_links ()
        {
            return _links;
        }

        public void set_links (_links _links)
        {
            this._links = _links;
        }

        public String getExecution_status ()
        {
            return execution_status;
        }

        public void setExecution_status (String execution_status)
        {
            this.execution_status = execution_status;
        }

        public Referenced_test_case getReferenced_test_case ()
        {
            return referenced_test_case;
        }

        public void setReferenced_test_case (Referenced_test_case referenced_test_case)
        {
            this.referenced_test_case = referenced_test_case;
        }

        public Iteration getIteration ()
        {
            return iteration;
        }

        public void setIteration (Iteration iteration)
        {
            this.iteration = iteration;
        }

        public String getLast_executed_on ()
        {
            return last_executed_on;
        }

        public void setLast_executed_on (String last_executed_on)
        {
            this.last_executed_on = last_executed_on;
        }

        @Override
        public String toString()
        {
            return "TestPlan [executions = "+executions+", assigned_to = "+assigned_to+", referenced_dataset = "+referenced_dataset+", id = "+id+", last_executed_by = "+last_executed_by+", _type = "+_type+", _links = "+_links+", execution_status = "+execution_status+", referenced_test_case = "+referenced_test_case+", iteration = "+iteration+", last_executed_on = "+last_executed_on+"]";
        }
    }

