import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class scoreAnalyzer {

LinkedList<Integer> runsData=new LinkedList<Integer>();

//accept run
public void addRunsToList(int run1, int run2,int run3,int run4,int run5){
	int totalRun=0;
	runsData.add(run1);
	runsData.add(run2);
	runsData.add(run3);
	runsData.add(run4);
	runsData.add(run5);
	
	System.out.println("Run Scored :"+runsData);

}

// calculate run rate
public void calcRunRate() {
	int over=50;float totalRun=0;
	for(int i=0;i<runsData.size();i++) {
		totalRun=totalRun+runsData.get(i);
	}
	float runRate=totalRun/over;
	System.out.println("runrate is : "+runRate);
}

//lowest run
public void lowestRuns() {
	int lowestrun=Collections.min(runsData);
	System.out.println("lowest run :"+lowestrun);
}

// count no. of player batting
public void conterOfPlayer(){
	int count=runsData.size();
	System.out.println("Count of player who batted is : "+count);
}


}
class TestScoreAnalyzer{
	public static void main(String[] args) {
	
	scoreAnalyzer score=new scoreAnalyzer();
	score.addRunsToList(20,30,150,50,2);
	score.calcRunRate();
	score.lowestRuns();
	score.conterOfPlayer();
	
}
}