package day08_scanner_logical_operators;

public class EligibileToVote {


    /*
    create and assign these variables:

        name
        are they citizen
        do have criminal background
        age

        sample inputs:
            "James Bond"
            true
            false
            49

    determine if they are eligible to vote, they can only vote if they are a citizen, have no criminal background and are about age 18

    print : $name is eligible to vote: $boolean

 */

    public static void main(String[] args) {

        String name = "David";
        boolean isCitizen = true;
        boolean isnotCriminal = true;
        int age = 18;


        boolean isEligible = isCitizen && isnotCriminal && age >=18;
        System.out.println(name + " is eligible to vote: " + isEligible);





    }



}
