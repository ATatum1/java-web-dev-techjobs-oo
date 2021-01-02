package org.launchcode.techjobs_oo.Tests;

//import.org.Junit.Test;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {


    Job test_job1;
    Job test_job2;
    Job test_jobFull;
    Job test_jobEqual1;
    Job test_jobEqual2;
    Job test_jobEmptyField;
    //Job test_jobString;

    @Before
    public void setUp(){
        test_job1 = new Job();
        test_job2 = new Job();
        test_jobFull = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_jobEqual1 = new Job("Product tester", new Employer("Jelly Belly"), new Location("Fairfield"), new PositionType("Quality control"), new CoreCompetency("sweet tooth"));
        test_jobEqual2 = new Job("Product tester", new Employer("Jelly Belly"), new Location("Fairfield"), new PositionType("Quality control"), new CoreCompetency("sweet tooth"));
        test_jobEmptyField = new Job("Product tester", new Employer("ACME"), new Location(""), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        //test_jobString = new Job()
    }

    //) Test the Empty Constructor

    //assertEquals(expected, actual, optional_delta)
    //Asserts that two values, expected and actual, are equal to each other (optionally, within a given range of difference)
    //assertEquals(9, test_car.getGasTankLevel(), .001);
    @Test
    public void testSettingJobId(){
        assertEquals(1,test_job1.getId(),.001);
        assertEquals(2,test_job2.getId(),.001);

    }



    // 3. Use assert statements to test that the constructor correctly assigns the class and value of each field.
    // The instanceof keyword can be used to check the class of an object. The result of the comparison is a boolean.
    //if (!(o instanceof Course)) return false; objectName instanceof ClassName

    //assertEquals(expected, actual, optional_delta)
    //Asserts that two values, expected and actual, are equal to each other (optionally, within a given range of difference)
    //assertEquals(9, test_car.getGasTankLevel(), .001);
    @Test
    public void testJobConstructorSetsAllFields(){

            assertEquals(3,test_jobFull.getId());

            assertEquals("Product tester",test_jobFull.getName());

            Employer testEmployer = test_jobFull.getEmployer();
            assertEquals("ACME",testEmployer.getValue());
            assertEquals(test_jobFull.getEmployer().getClass(),Employer.class);

            Location testLocation = test_jobFull.getLocation();
            assertEquals("Desert",testLocation.getValue());
            assertEquals(test_jobFull.getLocation().getClass(),Location.class);

            PositionType testPositionType =  test_jobFull.getPositionType();
            assertEquals("Quality control",testPositionType.getValue());
            assertEquals(test_jobFull.getPositionType().getClass(),PositionType.class);

            CoreCompetency testCoreCompetency = test_jobFull.getCoreCompetency();
            assertEquals("Persistence",testCoreCompetency.getValue());
            assertEquals(test_jobFull.getCoreCompetency().getClass(),CoreCompetency.class);


        }

        //assertFalse(condition)


        @Test
        public void testJobsForEquality(){

            assertFalse("false",test_jobEqual1.equals(test_jobEqual2));

        }


        @Test
        public void testReturnedStringHasBlankLineBeforeAndAfterJobInfo(){ ///may
            String testString = test_jobFull.toString();
            //assertEquals(" Product tester ACME Desert Quality control Persistence ",test_jobFull.toString());
            assertTrue("true",Character.isWhitespace(testString.charAt(0))&&Character.isWhitespace(testString.charAt(testString.length() - 1)));
        }

        @Test
        public void testReturnsFieldLabelWithDataOnOwnLine(){
            assertEquals("ID: 3"+"Name: Product tester"+'\n'+"Employer: ACME"+'\n'+"Location: Desert"+'\n'+"Position Type: Quality control"+'\n'+"Core Competency: Persistence"+" ",test_jobFull.toString());
        }
    //test_jobFull = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        @Test
        public void testIfFieldIsEmpty(){
            //assertEquals("ID: 3"+"Name: Product tester"+'\n'+"Employer: ACME"+'\n'+"Location: Desert"+'\n'+"Position Type: Quality control"+'\n'+"Core Competency: Persistence"+" ")
            assertEquals("ID: 6"+'\n'+"Name: Product tester"+'\n'+"Employer: ACME"+'\n'+"Location: Data not available"+'\n'+"Position Type: Quality control"+'\n'+"Core Competency: Persistence"+" ",test_jobEmptyField.toString());
        //test_jobEmptyField = new Job("Product tester", new Employer("ACME"), new Location(""), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    }


