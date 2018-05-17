package request;

import java.util.ArrayList;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.HttpRequest;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;


public class RequestHelper {

	/*public static void main(String[]args)
	{
	 process();	
	}*/
	
	public static void process(){
	
	//public static void main(String[] args) {
	/*	TestResultListener tlac = new TestResultListener();
		TestListenerAdapter tla = new TestLis
		tenerAdapter(); //set test result listener
		TestNG runner = new TestNG();
		List<String> suites = new ArrayList<>();
		suites.add("C:\\my_git_repos\\TG_pro\\src\\main\\resources\\testng.xml");//path to xml..
		runner.setTestSuites(suites);
		runner.run();*/
		XmlSuite suite = new XmlSuite();
		suite.setName("testng");
		XmlTest test=new XmlTest(suite);
		test.setName("webapp test");
		List<XmlClass> classes = new ArrayList<XmlClass>();
		classes.add(new XmlClass("request.BatchesTest"));
	    //classes.add(new XmlClass("request.ReportsTest"));
		classes.add(new XmlClass("request.TrainersTest"));
		//classes.add(new XmlClass("request.LocationsTest"));
		classes.add(new XmlClass("request.OverviewTest"));
		//classes.add(new XmlClass("webdriver.loginCukes.TestRunner"));
		//classes.add(new XmlClass("request.CurriculumTestNG")); 
		test.setXmlClasses(classes) ;
		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		suites.add(suite);
		TestNG tng = new TestNG();
		tng.setXmlSuites(suites);
		tng.run(); 
	
	}
}