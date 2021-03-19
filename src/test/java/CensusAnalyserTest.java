import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;

public class CensusAnalyserTest {
    public static final String INDIA_STATE_CENSUS_FILE="C:\\Users\\Admin\\IdeaProjects\\IndianStateCensusAnalyerProgram1\\src\\main\\resources\\IndiaStateCensusData.csv";


    @Test
    public void givenStateCensusAnalyser_usingIteratorToLoadTheData_ensureNumberOfRecordMatches() throws IOException {
        CensusAnalyser censusAnalyser=new CensusAnalyser();
        int numOfRecords=censusAnalyser.loadCensusData(INDIA_STATE_CENSUS_FILE);
        System.out.println( numOfRecords + " records are present in IndiaStateCensusData.csv");
        Assert.assertEquals(29,numOfRecords);
    }
}