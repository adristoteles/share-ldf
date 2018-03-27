package org.linkeddatafragments;

import static org.fest.assertions.Assertions.assertThat;

import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.ResultSet;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.linkeddatafragments.model.LinkedDataFragmentGraph;

public class Main {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Model model;
		
	  //  LinkedDataFragmentGraph ldfg = new LinkedDataFragmentGraph("http://192.168.99.100:3000/patients");
	    LinkedDataFragmentGraph ldfg = new LinkedDataFragmentGraph("http://192.168.99.100:3000/patientsn3");
        model = ModelFactory.createModelForGraph(ldfg);
        
       
        System.out.println(model.size());
        model.write(System.out);
  /*

        String queryString = "SELECT ?p ?o WHERE { ?e ?p ?o }";
        Query qry = QueryFactory.create(queryString);
        QueryExecution qe = QueryExecutionFactory.create(qry, model);
        ResultSet rs = qe.execSelect();
        while(rs.hasNext()) {
            System.out.println(rs.nextSolution().toString());
        }

        assertThat(rs.getRowNumber()).isGreaterThan(0);
        */
    }
	
}
