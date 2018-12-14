import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

import java.util.ArrayList;

public class Z_Score {

   public void Cal(ArrayList<LowerCase> character) throws InterruptedException {

       DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics();
       for(
               LowerCase v :character)

       {
           descriptiveStatistics.addValue(v.getA());
       }


       double mean = descriptiveStatistics.getMean();
       double standardDeviation = descriptiveStatistics.getStandardDeviation();

       double sum =0;

       for(LowerCase cal : character)
           sum+=cal.getA();


       double zscore =  (sum - mean)/standardDeviation;

       Thread.sleep(1000);{
           System.out.println("\nZ-Score is: " + zscore);
           // System.out.println(sum);
           //System.out.println(mean);
           //return sum;
       }

   }
}
