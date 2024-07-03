package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Steps {
    @When("user Enter first number and second number")
    public void user_enter_first_number_and_second_number(List<Map<String,String>> table) {
        System.out.println(table);
        Map<String, String> record=  table.get(0);
        System.out.println(record.get("first number"));
        System.out.println(record.get("second number"));
        System.out.println(record.get("third number"));
        System.out.println(record.get("forth number"));
        System.out.println(record.get("fifth number"));
        System.out.println(record.get("fifth number"));
        System.out.println(record.size());
        System.out.println(record.size());
        System.out.println(record.size());
        System.out.println(record.size());
        System.out.println(record.entrySet());


        Set a= record.entrySet();
      //  a.iterator().hasNext();
        System.out.println(a.iterator().hasNext());
        System.out.println( a.iterator().next());
        System.out.println( a.iterator().next());
        System.out.println( a.iterator().next());

        Iterator i=a.iterator();
      // System.out.println(i.hasNext());
        System.out.println( i.next());

       // System.out.println(i.hasNext());
        System.out.println( i.next());

       // System.out.println(i.hasNext());
        System.out.println( i.next());
    }

    @Then("additon of two numbers should be as follows")
    public void additon_of_two_numbers_should_be_as_follows(io.cucumber.datatable.DataTable dataTable) {
    }
}
